public class Triangle implements Shape {

    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public boolean isRightAngled() {
        double a2 = a * a;
        double b2 = b * b;
        double c2 = c * c;
        return (a2 + b2 == c2 || (a2 + c2 == b2) || (b2 + c2 == a2));
    }
}
