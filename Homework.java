package lesson6;

    /*
      Урок 6. Хранение и обработка данных ч3: множество коллекций Set
      Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
      Создать множество ноутбуков (ArrayList).
      Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
      Например, спросить у пользователя минимальный размер оперативной памяти или конкретный цвет.
      Выводить только те ноутбуки, что соответствуют условию
    */

import java.util.ArrayList;
import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {
        ArrayList<Laptop> laptops = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        Laptop laptop1 = new Laptop();
        laptop1.setBrand("Apple");
        laptop1.setModel("MacBook Pro");
        laptop1.setScreenSize(15.4f);
        laptop1.setCpu("M2 Pro");
        laptop1.setRam(32);
        laptop1.setDriveType("SSD");
        laptop1.setDriveSize(512);
        laptop1.setOs("MacOS");
        laptop1.setDeviceId("ABC-12345-6789-0");
        laptop1.setColor("Silver");
        laptop1.setPrice(2000);
        laptops.add(laptop1);

        Laptop laptop2 = new Laptop();
        laptop2.setBrand("Dell");
        laptop2.setModel("Inspiron 8000");
        laptop2.setScreenSize(14.0f);
        laptop2.setCpu("Intel");
        laptop2.setRam(16);
        laptop2.setDriveType("HDD");
        laptop2.setDriveSize(1024);
        laptop2.setOs("Windows");
        laptop2.setDeviceId("DEF-9876-5432-1");
        laptop2.setColor("Black");
        laptop2.setPrice(700);
        laptops.add(laptop2);

        System.out.print("Введите минимальный размер оперативной памяти (Гб): ");
        String input_ram = scanner.nextLine();

        try {
            Integer ram = Integer.parseInt(input_ram);
            Boolean foundItems = false;
            
            for (Laptop device : laptops) {
                if (device.getRam() >= ram) {
                    System.out.println(device.getBrand() + " " + device.getModel() + " => " + device.getRam() + "Гб");
                    foundItems = true;
                }
            }

            if (!foundItems) {
                System.out.printf("Ноутбуков с минимальным размером памяти %d гигабайт отсутствуют%n", ram);
            }

        } catch (NumberFormatException e) {
            System.out.println("Неправильный формат данных");
        }

        System.out.print("Введите цвет: ");
        String color = scanner.nextLine().toLowerCase();
        Boolean foundItems = false;

        for (Laptop device : laptops) {
            if (device.getColor().toLowerCase().contains(color)) {
                System.out.println(device.getBrand() + " " + device.getModel() + " => " + device.getColor());
                foundItems = true;
            }
        }
        
        if (!foundItems) {
            System.out.printf("Ноутбуков с цветом %s не найдены%n", color);
        }
    }
}
