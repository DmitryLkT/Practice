package Ptactical_tasks.Task9;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5, "Black");
        System.out.println(square.getLargeDiagonal());
        System.out.println(square.getHeight());
        System.out.println(square.getColor());
        System.out.println(square.perimeter());
        System.out.println(square.area());

        System.out.println("--------------");

        Rectangle rectangle = new Rectangle(4, 6, "Black");
        System.out.println(rectangle.getLargeDiagonal());
        System.out.println(rectangle.getHeight());
        System.out.println(rectangle.getColor());
        System.out.println(rectangle.perimeter());
        System.out.println(rectangle.area());

        System.out.println("--------------");

        Rhombuses rhombuses = new Rhombuses(7, 70, 110, "Black");
        System.out.println(rhombuses.getLargeDiagonal());
        System.out.println(rhombuses.getHeight());
        System.out.println(rhombuses.getColor());
        System.out.println(rhombuses.perimeter());
        System.out.println(rhombuses.area());

        System.out.println("--------------");

        Parallelogram parallelogram = new Parallelogram(10, 15, 140, 70, "Black");
        System.out.println(parallelogram.getLargeDiagonal());
        System.out.println(parallelogram.getHeight());
        System.out.println(parallelogram.getColor());
        System.out.println(parallelogram.perimeter());
        System.out.println(parallelogram.area());
    }
}
