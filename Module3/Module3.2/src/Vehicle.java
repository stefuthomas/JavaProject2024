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
        System.out.println("Car is starting...");
    }
    @Override
    public void stop() {
        System.out.println("Car is stopping...");
    }

    @Override
    public void getInfo() {
        System.out.println("Car information: ");
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
        System.out.println("Motorcycle is starting...");
    }
    @Override
    public void stop() {
        System.out.println("Motorcycle is stopping...");
    }

    @Override
    public void getInfo() {
        System.out.println("Motorcycle information: ");
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
        System.out.println("Bus is starting...");
    }
    @Override
    public void stop() {
        System.out.println("Bus is stopping...");
    }

    @Override
    public void getInfo() {
        System.out.println("Bus information: ");
        System.out.println("Type: " + this.type);
        System.out.println("Fuel: " + this.fuel);
        System.out.println("Capacity: " + this.passengers + " passengers");
    }
}

class VehicleTest {
    public static void main(String[] args) {
        Vehicle car = new Car("Car", "Petrol", "Red");
        Vehicle motorcycle = new Motorcycle("Motorcycle", "Diesel", "Black");
        Vehicle bus = new Bus("Bus", "Diesel", 40);

        System.out.println("Vehicle Demonstration: ");

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