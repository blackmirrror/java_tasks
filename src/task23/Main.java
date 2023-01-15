package task23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        AbstractShapeFactory shapeFactory = new ShapeFactory();
        System.out.print("Какая фигура вам нужна?\n" +
                "1 - Прямоугольник\n" +
                "2 - Круг\n" +
                "Ваш вариант: ");
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                Rectangle rectangle = shapeFactory.createRectangle();
                System.out.println(rectangle);
                System.out.println("Площадь: " + rectangle.area());
                break;
            case 2:
                Circle circle = shapeFactory.createCircle();
                System.out.println(circle);
                System.out.println("Площадь: " + circle.area());
                break;
        }
    }
}
