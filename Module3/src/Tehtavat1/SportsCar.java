package Tehtavat1;

class SportsCar extends Car {
    public SportsCar(String typeName, float tankCapacity, float topSpeed) {
        super(typeName, tankCapacity, topSpeed);
    }
    @Override
    public void accelerate() {
        if (gasolineLevel > 0) {
            gasolineLevel -= 10;
            speed += 30;
        } else {
            speed = 0;
        }
    }

    @Override
    void decelerate(int amount) {
        if (gasolineLevel > 0) {
            gasolineLevel -= 10;
            if (amount > 0) speed = Math.max(0, speed - amount);
        } else speed = 0;
    }

}

class CarTest {
    public static void main(String[] args) {
        Car toyota = new Car("Toyota Corolla", 100, 200);
        toyota.fillTank();
        SportsCar lamborghini = new SportsCar("Lamborghini Aventador", 200, 350);
        lamborghini.fillTank();

        for (int i = 1; i <= 10; i++) {
            lamborghini.accelerate();
            toyota.accelerate();
            System.out.print(i + ". " + lamborghini.getTypeName() + " Speed: " + lamborghini.getSpeed() + "km/h, ");
            System.out.println("Gasoline level: " + lamborghini.getGasolineLevel() + "/" + lamborghini.getTankCapacity());
            System.out.println("\n");
            System.out.print(i + ". " + toyota.getTypeName() + " Speed: " + toyota.getSpeed() + "km/h, ");
            System.out.println("Gasoline level: " + toyota.getGasolineLevel() + "/" + toyota.getTankCapacity());
            System.out.println("\n");
        }

    }
}