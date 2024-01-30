public interface Vehicle {
     void start();
     void stop();
     void getInfo();
}

class Car implements Vehicle {
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
        System.out.println("Type: Car");
        System.out.println("Fuel: Petrol");
        System.out.println("Color: Red");
    }
}

class Motorcycle implements Vehicle {
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
        System.out.println("Type: Motorcycle");
        System.out.println("Fuel: Gasoline");
        System.out.println("Color: Black");
    }
}

class Bus implements Vehicle {
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
        System.out.println("Type: Bus");
        System.out.println("Fuel: Diesel");
        System.out.println("Capacity: 40 passengers");
    }
}

class VehicleTest {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();
        Vehicle bus = new Bus();

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