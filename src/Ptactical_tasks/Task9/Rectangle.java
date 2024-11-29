package Ptactical_tasks.Task9;

public class Rectangle extends Quadrangle implements Figure {
    public Rectangle(int a, int b, String color) {
        super(a, b, color);
    }

    @Override
    public double getLargeDiagonal() {
        double a2 = Math.pow(a, 2);
        double b2 = Math.pow(b, 2);
        double a2b2 = a2 + b2;
        return Math.sqrt(a2b2);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getHeight() {
        return Math.min(a, b);
    }

    @Override
    public double area() {
        return a * b;
    }

    @Override
    public double perimeter() {
        return (a + b) * 2;
    }
}
