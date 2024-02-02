package Tehtavat1;

public class Bus extends Car {
    private int passengerAmount;
    private int passengerCapacity;
    private boolean isMoving;

    public Bus(String typeName, float tankCapacity, float topSpeed, int passengerCapacity) {
        super(typeName, tankCapacity, topSpeed);
        this.passengerCapacity = passengerCapacity;
        this.passengerAmount = 0;
        this.isMoving = false;
    }

    protected int getPassengerAmount() {
        return passengerAmount;
    }

    protected int getPassengerCapacity() {
        return passengerCapacity;
    }

    protected boolean getIsMoving() {
        return isMoving;
    }

    protected void startMoving() {
        System.out.println("The bus has started moving.");
        isMoving = true;
    }

    protected void stopMoving() {
        System.out.println("The bus has stopped.");
        isMoving = false;
    }

    protected void letPassengersIn(int passengers) {
        if (!isMoving) {
            if (passengers + passengerAmount <= passengerCapacity) {
                passengerAmount += passengers;
            } else {
                System.out.println("Passenger capacity is full " + passengerCapacity);
            }
        } else {
            System.out.println("The bus is moving.");
        }

    }

    protected void letPassengersOut(int passengers) {
        if (!isMoving) {
            if (passengerAmount != 0) {
                if (passengerAmount - passengers < 0) {
                    System.out.println("There are not that many passengers abroad.");
                } else {
                    passengerAmount -= passengers;
                    System.out.println(passengers + " passengers have left the bus.");
                }
            } else {
                System.out.println("There are no passengers abroad.");
            }
        } else {
            System.out.println("The bus is moving. Stop the bus first.");
        }
    }

    protected void printPassengerAmount() {
        System.out.println("Passenger amount: " + passengerAmount);
    }
}
class BusTest {
    public static void main(String[] args) {
        // Create a new Tehtavat1.Bus object.
        Bus bus = new Bus("Mercedes", 500, 200, 50);
        bus.fillTank();
        System.out.println("Let 10 passengers in.");
        bus.letPassengersIn(10);
        bus.printPassengerAmount();
        bus.startMoving();
        // Try to let passengers in while the bus is moving.
        System.out.println("Let 5 passengers out.");
        bus.letPassengersOut(5);
        bus.stopMoving();
        // Now let passengers out.
        bus.letPassengersOut(5);
        bus.printPassengerAmount();
    }
}
