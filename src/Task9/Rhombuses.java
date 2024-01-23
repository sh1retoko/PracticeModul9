package Task9;

public class Rhombuses extends Quadrangle implements Figure {
    double alpha, beta;

    public Rhombuses(int a, int b, String color, double alpha, double beta) {
        super(a, a, color);
        this.alpha = alpha;
        this.beta = beta;
    }

    @Override
    public double area() {
        return b * getHeight();
    }

    @Override
    public double perimeter() {
        return 2 * a + 2 * b;
    }

    @Override
    double getLargeDiagonal() {
        double d1 = a * Math.sqrt(2 - 2 * Math.cos(Math.toRadians(beta)));
        double d2 = a * Math.sqrt(2 - 2 * Math.cos(Math.toRadians(alpha)));
        return Math.max(d1, d2);
    }

    @Override
    double getHeight() {
        return a * Math.sin(Math.toRadians(alpha));
    }

    @Override
    String getColor() {
        return color;
    }
}
