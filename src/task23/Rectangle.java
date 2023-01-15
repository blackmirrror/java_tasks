package task23;

public class Rectangle implements Shape {

    private int length = 4;
    private int width = 2;

    @Override
    public String toString() {
        return "Прямоугольник";
    }

    @Override
    public double area() {
        return length * width;
    }
}
