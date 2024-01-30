package Tehtavat1;

import java.util.Scanner;

public class Car {
    protected float speed;
    protected float gasolineLevel;
    protected String typeName;
    protected float tankCapacity;
    protected float topSpeed;
    protected boolean cruiseControlOn;
    protected int targetSpeed;

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
        if (gasolineLevel > 0) {
            gasolineLevel -= 5;
            speed += 10;
        } else {
            speed = 0;
        }
    }

    void decelerate(int amount) {
        if (gasolineLevel > 0) {
            gasolineLevel -= 5;
            if (amount > 0) speed = Math.max(0, speed - amount);
        } else speed = 0;
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

    float getTankCapacity() {
        return tankCapacity;
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
