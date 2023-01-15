package task23;

public class ShapeFactory implements AbstractShapeFactory {
    @Override
    public Rectangle createRectangle() {
        return new Rectangle();
    }

    @Override
    public Circle createCircle() {
        return new Circle();
    }
}
