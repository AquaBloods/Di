public class Main {
    public static void   main(String[] args) {
        Shape circle = new Circle(5.0);
        double circleArea = Calculator.calculateArea(circle);
        System.out.println("Площадь круга: " + circleArea);

        Shape triangle = new Triangle(3.0, 4.0, 5.0);
        double triangleArea = Calculator.calculateArea(triangle);
        System.out.println("Площадь треугольника: " + triangleArea);

        Triangle rightTriangle = new Triangle(3.0, 4.0, 5.0);
        boolean isRightAngled = Calculator.isTriangleRightAngled(rightTriangle);
        System.out.println("Треугольник прямоугольный? " + isRightAngled);
        }
    }