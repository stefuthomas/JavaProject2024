abstract class AbstractVehicle2 implements Vehicle, ElectricVehicle {
    protected int maxSpeed;
    protected int manufactureYear;
    protected String manufacturer;
    protected int currentSpeed;
    protected String type;
    protected String fuel;
    protected String color;
    protected int passengers;
    protected int batteryLevel;

    AbstractVehicle2(int maxSpeed, int manufactureYear, String manufacturer, String type, String fuel, String color) {
        this.maxSpeed = maxSpeed;
        this.manufactureYear = manufactureYear;
        this.manufacturer = manufacturer;
        this.currentSpeed = 0;
        this.type = type;
        this.fuel = fuel;
        this.color = color;
    }

    AbstractVehicle2(int maxSpeed, int manufactureYear, String manufacturer, String type, String color) {
        this.maxSpeed = maxSpeed;
        this.manufactureYear = manufactureYear;
        this.manufacturer = manufacturer;
        this.currentSpeed = 0;
        this.type = type;
        this.color = color;
    }

    public void accelerate(int speed) {
        this.currentSpeed += speed;
    }

    public void decelerate(int speed) {
        this.currentSpeed -= speed;
    }
    @Override
    public void chargeBattery(int amount) {
        System.out.println("Charging not possible for this vehicle.");
    }
}

public interface ElectricVehicle {
    abstract void chargeBattery(int amount);
}
class ElectricCar extends AbstractVehicle2 {
    private int batteryCapacity;
    ElectricCar(int maxSpeed, int manufactureYear, String manufacturer, String type, String color) {
        super(maxSpeed, manufactureYear, manufacturer, type, color);
        this.batteryCapacity = 100;
        this.batteryLevel = 0;
    }

    @Override
    public void start() {
        System.out.println("Electric car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Electric car is stopping...");
    }

    @Override
    public void getInfo() {
        System.out.println("Electric car info:");
        System.out.println("Max speed: " + this.maxSpeed);
        System.out.println("Manufacture year: " + this.manufactureYear);
        System.out.println("Manufacturer: " + this.manufacturer);
        System.out.println("Current speed: " + this.currentSpeed);
        System.out.println("Type: " + this.type);
        System.out.println("Color: " + this.color);
        System.out.println("Battery capacity: " + this.batteryCapacity);
        System.out.println("Battery level: " + this.batteryLevel);

    }

    @Override
    public void chargeBattery(int amount) {
        System.out.println("Electric car is charging...");
        this.batteryLevel += amount;
    }
}

class ElectricMotorcycle extends AbstractVehicle2 {
    private int batteryCapacity;
    ElectricMotorcycle(int maxSpeed, int manufactureYear, String manufacturer, String type, String color) {
        super(maxSpeed, manufactureYear, manufacturer, type, color);
        this.batteryCapacity = 100;
        this.batteryLevel = 0;
    }

    @Override
    public void start() {
        System.out.println("Electric car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Electric car is stopping...");
    }

    @Override
    public void getInfo() {
        System.out.println("Electric car info:");
        System.out.println("Max speed: " + this.maxSpeed);
        System.out.println("Manufacture year: " + this.manufactureYear);
        System.out.println("Manufacturer: " + this.manufacturer);
        System.out.println("Current speed: " + this.currentSpeed);
        System.out.println("Type: " + this.type);
        System.out.println("Color: " + this.color);
        System.out.println("Battery capacity: " + this.batteryCapacity);
        System.out.println("Battery level: " + this.batteryLevel);

    }

    @Override
    public void chargeBattery(int amount) {
        System.out.println("Electric Motorcycle is charging...");
        this.batteryLevel += amount;
    }
}

class ElectricVehicleTest {
    public static void main(String[] args) {
        ElectricCar electroCar = new ElectricCar(200, 2019, "Tesla", "Model S", "Red");
        ElectricMotorcycle electroMotorbike = new ElectricMotorcycle(200, 2019, "Zero", "SR/f", "Red");
        electroCar.chargeBattery(50);
        electroCar.accelerate(100);
        electroCar.getInfo();
        electroCar.decelerate(100);
        electroCar.stop();
        electroCar.getInfo();
        System.out.println("====================================");

        electroMotorbike.chargeBattery(50);
        electroMotorbike.accelerate(100);
        electroMotorbike.getInfo();
        electroMotorbike.decelerate(100);
        electroMotorbike.stop();
        electroMotorbike.getInfo();
        System.out.println("====================================");
    }
}