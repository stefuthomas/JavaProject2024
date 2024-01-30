public interface Vehicle2 {
    void start();
    void stop();
    void getInfo();
    void calculateFuelEfficiency();
}

class Car3 implements Vehicle2 {

    private String type;
    private String fuel;
    private String color;
    private float fuelEfficiency;
    Car3(String type, String fuel, String color, float fuelEfficiency) {
        this.type = type;
        this.fuel = fuel;
        this.color = color;
        this.fuelEfficiency = fuelEfficiency;
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

    @Override
    public void calculateFuelEfficiency() {
        System.out.println("Fuel efficiency: " + fuelEfficiency);
    }
}

class Motorcycle3 implements Vehicle2 {
    private String type;
    private String fuel;
    private String color;
    private float fuelEfficiency;

    public Motorcycle3(String type, String fuel, String color, float fuelEfficiency) {
        this.type = type;
        this.fuel = fuel;
        this.color = color;
        this.fuelEfficiency = fuelEfficiency;
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

    @Override
    public void calculateFuelEfficiency() {
        System.out.println("Fuel efficiency: " + fuelEfficiency);
    }
}

class Bus3 implements Vehicle2 {
    private String type;
    private String fuel;
    private int passengers;
    private float fuelEfficiency;

    Bus3(String type, String fuel, int passengers, float fuelEfficiency) {
        this.type = type;
        this.fuel = fuel;
        this.passengers = passengers;
        this.fuelEfficiency = fuelEfficiency;
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
    @Override
    public void calculateFuelEfficiency() {
        System.out.println("Fuel efficiency: " + fuelEfficiency);
    }
}


class Vehicle2test {
    public static void main(String[] args) {
        Car3 car = new Car3("Car", "Gasoline", "Red", 1);
        Motorcycle3 motorcycle = new Motorcycle3("Motorcycle", "Gasoline", "Black", 2);
        Bus3 bus = new Bus3("Bus", "Diesel", 50, 5);

        car.start();
        car.stop();
        car.getInfo();
        car.calculateFuelEfficiency();

        motorcycle.start();
        motorcycle.stop();
        motorcycle.getInfo();
        motorcycle.calculateFuelEfficiency();

        bus.start();
        bus.stop();
        bus.getInfo();
        bus.calculateFuelEfficiency();
    }
}