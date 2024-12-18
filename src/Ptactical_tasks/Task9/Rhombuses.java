package Ptactical_tasks.Task9;

public class Rhombuses extends Quadrangle implements Figure {
    double alpha, beta;

    public Rhombuses(int a, double alpha, double beta, String color) {
        super(a, a, color);
        this.alpha = alpha;
        this.beta = beta;
    }

    @Override
    public double getLargeDiagonal() {
        double d1 = a * Math.sqrt(2-2*Math.cos(Math.toRadians(beta)));
        double d2 = a * Math.sqrt(2-2*Math.cos(Math.toRadians(alpha)));
        return Math.max(d1, d2);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getHeight() {
        return area() / a;
    }

    @Override
    public double area() {
        return Math.sqrt(a) * Math.sin(Math.toRadians(a));
    }

    @Override
    public double perimeter() {
        return a * 4;
    }
}
