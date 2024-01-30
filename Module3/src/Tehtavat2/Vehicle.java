package Tehtavat2;

public interface Vehicle {
     void start();
     void stop();
     void getInfo();
}

class Car implements Vehicle {

    private String type;
    private String fuel;
    private String color;
    Car(String type, String fuel, String color) {
        this.type = type;
        this.fuel = fuel;
        this.color = color;
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
        System.out.println("Tehtavat2.Car information: ");
        System.out.println("Type: " + this.type);
        System.out.println("Fuel: " + this.fuel);
        System.out.println("Color: " + this.color);
    }
}

class Motorcycle implements Vehicle {
    private String type;
    private String fuel;
    private String color;

    public Motorcycle(String type, String fuel, String color) {
        this.type = type;
        this.fuel = fuel;
        this.color = color;
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
        System.out.println("Tehtavat2.Motorcycle information: ");
        System.out.println("Type: " + this.type);
        System.out.println("Fuel: " + this.fuel);
        System.out.println("Color: " + this.color);
    }
}

class Bus implements Vehicle {
    private String type;
    private String fuel;
    private int passengers;

    Bus(String type, String fuel, int passengers) {
        this.type = type;
        this.fuel = fuel;
        this.passengers = passengers;
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
        System.out.println("Tehtavat2.Bus information: ");
        System.out.println("Type: " + this.type);
        System.out.println("Fuel: " + this.fuel);
        System.out.println("Capacity: " + this.passengers + " passengers");
    }
}

class VehicleTest {
    public static void main(String[] args) {
        Vehicle car = new Car("Tehtavat2.Car", "Petrol", "Red");
        Vehicle motorcycle = new Motorcycle("Tehtavat2.Motorcycle", "Diesel", "Black");
        Vehicle bus = new Bus("Tehtavat2.Bus", "Diesel", 40);

        System.out.println("Tehtavat2.Vehicle Demonstration: ");

        car.start();
        car.stop();
        car.getInfo();

        motorcycle.start();
        motorcycle.stop();
        motorcycle.getInfo();

        bus.start();
        bus.stop();
        bus.getInfo();
    }
}