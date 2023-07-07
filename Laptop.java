package lesson6;

public class Laptop {

    private String brand;
    private String model;
    private String cpu;
    private int ram;
    private Float screenSize;
    private String driveType;
    private int driveSize;
    private String os;
    private String deviceId;
    private String color;
    private int price;

    public static void main(String[] args) {
        System.out.println("Class instatiated");
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", screen_size=" + screenSize +
                ", drive_type='" + driveType + '\'' +
                ", drive_size=" + driveSize +
                ", os='" + os + '\'' +
                ", device_id='" + deviceId + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setScreenSize(Float screenSize) {
        this.screenSize = screenSize;
    }

    public void setDriveType(String driveType) {
        this.driveType = driveType;
    }

    public void setDriveSize(int driveSize) {
        this.driveSize = driveSize;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public Float getScreenSize() {
        return screenSize;
    }

    public int getDriveSize() {
        return driveSize;
    }

    public int getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getCpu() {
        return cpu;
    }

    public String getDriveType() {
        return driveType;
    }

    public String getOs() {
        return os;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public String getColor() {
        return color;
    }
}
