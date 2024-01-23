import java.util.Scanner;

public class Car {
    private float speed;
    private float gasolineLevel;
    private String typeName;
    private float tankCapacity;
    private float topSpeed;
    private boolean cruiseControlOn;
    private int targetSpeed;

    public Car(String typeName) {
        speed = 0;
        gasolineLevel = 0;
        this.typeName = typeName;
        cruiseControlOn = false;
        targetSpeed = 0;
    }

    public Car(String typeName, float tankCapacity, float topSpeed) {
        speed = 0;
        gasolineLevel = 0;
        this.tankCapacity = tankCapacity;
        this.topSpeed = topSpeed;
        this.typeName = typeName;
        cruiseControlOn = false;
        targetSpeed = 0;
    }

    public void accelerate() {
        if (gasolineLevel > 0)
            speed += 10;
        else
            speed = 0;
    }

    void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
    }

    float getSpeed() {
        return speed;
    }

    String getTypeName() {
        return typeName;
    }

    void fillTank() {
        gasolineLevel = 100;
    }

    float getGasolineLevel() {
        return gasolineLevel;
    }

    public void cruiseControl() {
        if (cruiseControlOn) {
            if (targetSpeed > speed) {
                while (speed < targetSpeed && gasolineLevel > 0) {
                    accelerate();
                    System.out.println("Cruise control on: speed is " + speed + " km/h");
                }
            } else if (targetSpeed < speed) {
                while (speed > targetSpeed && gasolineLevel > 0) {
                    decelerate(10);
                    System.out.println("Cruise control on: speed is " + speed + " km/h");
                }
            }
            if (gasolineLevel == 0) {
                System.out.println("Out of gas. Cruise control turned off.");
                cruiseControlOn = false;
            }
        } else {
            System.out.println("Cruise control off");
        }
    }

    public void setCruiseControlSpeed(int minTargetSpeed, int maxTargetSpeed) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter target speed between " + minTargetSpeed + " and " + maxTargetSpeed + ": ");
        targetSpeed = scanner.nextInt();
        if (targetSpeed < minTargetSpeed || targetSpeed > maxTargetSpeed) {
            System.out.println("Invalid target speed. Cruise control turned off.");
            cruiseControlOn = false;
        } else {
            cruiseControlOn = true;
        }
    }

    public int getTargetSpeed() {
        return targetSpeed;
    }

    public boolean isCruiseControlOn() {
        return cruiseControlOn;
    }
}

class CarDriver {

    public static void main(String[] args) {
        Car myCar;

        myCar = new Car("Toyota Corolla", 50, 200);
        myCar.fillTank();

        for (int i = 0; i < 6; i++) {
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        while (myCar.getSpeed() > 0) {
            myCar.decelerate(15);
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }


        while (true) {
            System.out.println("1) to use cruise control");
            System.out.println("2) to view current speed");
            System.out.println("3) to exit");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            if (choice == 1) {
                myCar.setCruiseControlSpeed(60, 150);
                myCar.cruiseControl();
            } else if (choice == 2) {
                System.out.println("Current speed is " + myCar.getSpeed() + " km/h");
            } else if (choice == 3) {
                break;
            }
        }
    }
}
