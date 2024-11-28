package Ptactical_tasks.Task9;

public class Square extends Quadrangle implements Figure {
    public Square(int a, String color ) {
        super(a, a, color);
    }

    @Override
    public double getLargeDiagonal() {
        return a * Math.sqrt(2);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getHeight() {
        return a;
    }

    @Override
    public double getArea() {
        return a * a;
    }

    @Override
    public double getPerimeter() {
        return a * 4;
    }
}
