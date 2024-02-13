package Tehtavat3;

public class Pen {

    public enum Color {
        RED("red"), GREEN("green"), BLUE("blue");
        private final String color;
        Color(String color) {this.color = color; };
        @Override public String toString() { return color; }
    }
    private Color color;
    private boolean capOn;
    public Pen(Color color) {
        this.color = color;
        this.capOn = true;
    }
    public Pen() {
        this.color = Color.RED;
        this.capOn = true;
    }
    public String draw() {
        if (capOn) {
            return "";
        } else {
            return "Drawing " + color;
        }
    }
    public void capOn() {
        this.capOn = true;
    }

    public void capOff() {
        this.capOn = false;
    }

    public void changeColor(Color color) {
        if (capOn) {
            this.color = color;
        }
    }
}