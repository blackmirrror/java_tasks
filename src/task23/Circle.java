package task23;

public class Circle implements Shape {

    private int radius = 5;

    @Override
    public String toString() {
        return "Круг";
    }

    @Override
    public double area() {
        return radius * radius * 3.14;
    }
}
