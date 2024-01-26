import java.lang.reflect.Array;

public class Shape {

    @Override
    public String toString() {
        return "Shape";
    }

    public float calculateArea() {
        return 0;
    }

    public String display() {
        return "";
    }

}


class Circle extends Shape {
    protected float radius;
    protected String color;

    Circle(float radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle";
    }

    @Override
    public float calculateArea() {
        return (float) (Math.PI * (Math.pow(radius, 2)));
    }
    @Override
    public String display() {
        return "Area of " + color + " " + this.toString() + " with radius " + radius + ": " + this.calculateArea();
    }
}

class Rectangle extends Shape {
    protected float height;
    protected float width;
    protected String color;

    Rectangle(float height, float width, String color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Rectangle";
    }

    @Override
    public float calculateArea() {
        return height * width;
    }
    @Override
    public String display() {
        return "Area of " + color + " " + this.toString() + " with width " + width + " and height " + height + ": " + this.calculateArea();
    }
}

class Triangle extends Shape {
    protected float height;
    protected float base;
    protected String color;

    Triangle(float height, float base, String color) {
        this.height = height;
        this.base = base;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Triangle";
    }

    @Override
    public float calculateArea() {
        return (height * base) / 2;
    }
    @Override
    public String display() {
        return "Area of " + color + " " + this.toString() + " with base " + base + " and height " + height + ": " + this.calculateArea();
    }
}

class ShapeCalculator {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "blue");
        Rectangle rectangle = new Rectangle(6, 4, "red");
        Triangle triangle = new Triangle(8, 3, "green");
        Object[] shapes = {circle, rectangle, triangle};
        System.out.println("Shape Calculator\n");

        for (Object shape : shapes) {
            System.out.println(((Shape) shape).display());
        }
    }
}