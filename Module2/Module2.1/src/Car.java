import java.util.Scanner;

public class Car {
    private float speed;
    private float gasolineLevel;
    private String typeName;
    private float tankCapacity;
    private float topSpeed;
    private int targetSpeed;
    public Car(String typeName) {
        speed = 0; gasolineLevel = 0;
        this.typeName = typeName;
    }

    public Car(String typeName, float tankCapacity, float topSpeed) {
        speed = 0; gasolineLevel = 0;
        this.tankCapacity = tankCapacity;
        this.topSpeed = topSpeed;
        this.typeName = typeName;
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

    public void cruiseControl(boolean on) {
        int targetSpeed = setTargetSpeed();
        if (on && targetSpeed <= topSpeed) {
            while (speed < targetSpeed) {
                accelerate();
            }
        } else {
            while (speed > 0) {
                decelerate(10);
            }
        }
        if (targetSpeed >= topSpeed) {
            System.out.println("Target speed is too high!");
        }
    }

    private int setTargetSpeed() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter target speed: ");
        targetSpeed = scanner.nextInt();
        return targetSpeed;
    }
}


class CarDriver {
    
}