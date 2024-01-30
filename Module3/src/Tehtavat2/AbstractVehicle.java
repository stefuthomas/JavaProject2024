package Tehtavat2;

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

    abstract void accelerate(int speed);

    abstract void decelerate(int speed);
}

class Car2 extends AbstractVehicle {
    Car2(int maxSpeed, int manufactureYear, String manufacturer, String type, String fuel, String color) {
        super(maxSpeed, manufactureYear, manufacturer, type, fuel, color);
    }

    @Override
    public void start() {
        System.out.println("Tehtavat2.Car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Tehtavat2.Car is stopping...");
    }

    @Override
    public void getInfo() {
        System.out.println("Tehtavat2.Car Information: ");
        System.out.println("Type: " + this.type);
        System.out.println("Fuel: " + this.fuel);
        System.out.println("Color: " + this.color);
        System.out.println("Max Speed: " + this.maxSpeed);
        System.out.println("Current Speed: " + this.currentSpeed);
        System.out.println("Manufacturer: " + this.manufacturer);
        System.out.println("Manufacture Year: " + this.manufactureYear);
    }

    @Override
    public void accelerate(int speed) {
        if (this.currentSpeed + speed > this.maxSpeed) {
            System.out.println("Tehtavat2.Car cannot accelerate to " + (this.currentSpeed + speed) + " km/h");
        } else {
            this.currentSpeed += speed;
            System.out.println("Tehtavat2.Car accelerated to " + this.currentSpeed + " km/h");
        }
    }
    @Override
    public void decelerate(int speed) {
        if (this.currentSpeed - speed < 0) {
            System.out.println("Tehtavat2.Car cannot decelerate to " + (this.currentSpeed - speed) + " km/h");
        } else {
            this.currentSpeed -= speed;
            System.out.println("Tehtavat2.Car decelerated to " + this.currentSpeed + " km/h");
        }
    }
}

class Motorcycle2 extends AbstractVehicle {
    Motorcycle2(int maxSpeed, int manufactureYear, String manufacturer, String type, String fuel, String color) {
        super(maxSpeed, manufactureYear, manufacturer, type, fuel, color);
    }

    @Override
    public void start() {
        System.out.println("Tehtavat2.Motorcycle is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Tehtavat2.Motorcycle is stopping...");
    }

    @Override
    public void getInfo() {
        System.out.println("Tehtavat2.Motorcycle Information: ");
        System.out.println("Type: " + this.type);
        System.out.println("Fuel: " + this.fuel);
        System.out.println("Color: " + this.color);
        System.out.println("Max Speed: " + this.maxSpeed);
        System.out.println("Current Speed: " + this.currentSpeed);
        System.out.println("Manufacturer: " + this.manufacturer);
        System.out.println("Manufacture Year: " + this.manufactureYear);
    }

    @Override
    public void accelerate(int speed) {
        if (this.currentSpeed + speed > this.maxSpeed) {
            System.out.println("Tehtavat2.Motorcycle cannot accelerate to " + (this.currentSpeed + speed) + " km/h");
        } else {
            this.currentSpeed += speed;
            System.out.println("Tehtavat2.Motorcycle accelerated to " + this.currentSpeed + " km/h");
        }
    }
    @Override
    public void decelerate(int speed) {
        if (this.currentSpeed - speed < 0) {
            System.out.println("Tehtavat2.Motorcycle cannot decelerate to " + (this.currentSpeed - speed) + " km/h");
        } else {
            this.currentSpeed -= speed;
            System.out.println("Tehtavat2.Motorcycle decelerated to " + this.currentSpeed + " km/h");
        }
    }
}

class Bus2 extends AbstractVehicle {
    Bus2(int maxSpeed, int manufactureYear, String manufacturer, String type, String fuel, String color) {
        super(maxSpeed, manufactureYear, manufacturer, type, fuel, color);
        this.passengers = 40;
    }

    @Override
    public void start() {
        System.out.println("Tehtavat2.Bus is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Tehtavat2.Bus is stopping...");
    }

    @Override
    public void getInfo() {
        System.out.println("Tehtavat2.Bus Information: ");
        System.out.println("Type: " + this.type);
        System.out.println("Fuel: " + this.fuel);
        System.out.println("Color: " + this.color);
        System.out.println("Max Speed: " + this.maxSpeed);
        System.out.println("Current Speed: " + this.currentSpeed);
        System.out.println("Manufacturer: " + this.manufacturer);
        System.out.println("Manufacture Year: " + this.manufactureYear);
        System.out.println("Passengers: " + this.passengers);
    }

    @Override
    public void accelerate(int speed) {
        if (this.currentSpeed + speed > this.maxSpeed) {
            System.out.println("Tehtavat2.Bus cannot accelerate to " + (this.currentSpeed + speed) + " km/h");
        } else {
            this.currentSpeed += speed;
            System.out.println("Tehtavat2.Bus accelerated to " + this.currentSpeed + " km/h");
        }
    }

    @Override
    public void decelerate(int speed) {
        if (this.currentSpeed - speed < 0) {
            System.out.println("Tehtavat2.Bus cannot decelerate to " + (this.currentSpeed - speed) + " km/h");
        } else {
            this.currentSpeed -= speed;
            System.out.println("Tehtavat2.Bus decelerated to " + this.currentSpeed + " km/h");
        }
    }
}

class AbstractClassTest {

    public static void main(String[] args) {
        Car2 car = new Car2(200, 2019, "BMW", "Tehtavat2.Car", "Gasoline", "Black");
        Motorcycle2 motorcycle = new Motorcycle2(150, 2018, "Honda", "Tehtavat2.Motorcycle", "Gasoline", "Red");
        Bus2 bus = new Bus2(100, 2017, "Mercedes", "Tehtavat2.Bus", "Diesel", "White");

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