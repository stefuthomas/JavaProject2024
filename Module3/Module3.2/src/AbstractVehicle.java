abstract class AbstractVehicle implements Vehicle {
    protected int maxSpeed;
    protected int manufactureYear;
    protected String manufacturer;
    protected int currentSpeed;
    protected String type;
    protected String fuel;
    protected String color;
    protected int passengers;

    AbstractVehicle(int maxSpeed, int manufactureYear, String manufacturer, String type, String fuel, String color) {
        this.maxSpeed = maxSpeed;
        this.manufactureYear = manufactureYear;
        this.manufacturer = manufacturer;
        this.currentSpeed = 0;
        this.type = type;
        this.fuel = fuel;
        this.color = color;
    }

    public void accelerate(int speed) {
        this.currentSpeed += speed;
    }

    public void decelerate(int speed) {
        this.currentSpeed -= speed;
    }
}

class Car2 extends AbstractVehicle {
    Car2(int maxSpeed, int manufactureYear, String manufacturer, String type, String fuel, String color) {
        super(maxSpeed, manufactureYear, manufacturer, type, fuel, color);
    }

    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping...");
    }

    @Override
    public void getInfo() {
        System.out.println("Car Information: ");
        System.out.println("Type: " + this.type);
        System.out.println("Fuel: " + this.fuel);
        System.out.println("Color: " + this.color);
        System.out.println("Max Speed: " + this.maxSpeed);
        System.out.println("Current Speed: " + this.currentSpeed);
        System.out.println("Manufacturer: " + this.manufacturer);
        System.out.println("Manufacture Year: " + this.manufactureYear);
    }

}

class Motorcycle2 extends AbstractVehicle {
    Motorcycle2(int maxSpeed, int manufactureYear, String manufacturer, String type, String fuel, String color) {
        super(maxSpeed, manufactureYear, manufacturer, type, fuel, color);
    }

    @Override
    public void start() {
        System.out.println("Motorcycle is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle is stopping...");
    }

    @Override
    public void getInfo() {
        System.out.println("Motorcycle Information: ");
        System.out.println("Type: " + this.type);
        System.out.println("Fuel: " + this.fuel);
        System.out.println("Color: " + this.color);
        System.out.println("Max Speed: " + this.maxSpeed);
        System.out.println("Current Speed: " + this.currentSpeed);
        System.out.println("Manufacturer: " + this.manufacturer);
        System.out.println("Manufacture Year: " + this.manufactureYear);
    }
}

class Bus2 extends AbstractVehicle {
    Bus2(int maxSpeed, int manufactureYear, String manufacturer, String type, String fuel, String color) {
        super(maxSpeed, manufactureYear, manufacturer, type, fuel, color);
        this.passengers = 40;
    }

    @Override
    public void start() {
        System.out.println("Bus is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Bus is stopping...");
    }

    @Override
    public void getInfo() {
        System.out.println("Bus Information: ");
        System.out.println("Type: " + this.type);
        System.out.println("Fuel: " + this.fuel);
        System.out.println("Color: " + this.color);
        System.out.println("Max Speed: " + this.maxSpeed);
        System.out.println("Current Speed: " + this.currentSpeed);
        System.out.println("Manufacturer: " + this.manufacturer);
        System.out.println("Manufacture Year: " + this.manufactureYear);
        System.out.println("Passengers: " + this.passengers);
    }
}

class AbstractClassTest {

    public static void main(String[] args) {
        Car2 car = new Car2(200, 2019, "BMW", "Car", "Gasoline", "Black");
        Motorcycle2 motorcycle = new Motorcycle2(150, 2018, "Honda", "Motorcycle", "Gasoline", "Red");
        Bus2 bus = new Bus2(100, 2017, "Mercedes", "Bus", "Diesel", "White");

        car.start();
        car.accelerate(50);
        car.getInfo();
        car.decelerate(20);
        car.stop();
        car.getInfo();

        System.out.println("====================================");

        motorcycle.start();
        motorcycle.accelerate(30);
        motorcycle.getInfo();
        motorcycle.decelerate(10);
        motorcycle.stop();
        motorcycle.getInfo();

        System.out.println("====================================");

        bus.start();
        bus.accelerate(20);
        bus.getInfo();
        bus.decelerate(10);
        bus.stop();
        bus.getInfo();
    }
}