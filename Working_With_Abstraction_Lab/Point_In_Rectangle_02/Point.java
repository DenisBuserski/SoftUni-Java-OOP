package JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Java_OOP.Java_OOP_Exercises.Working_With_Abstraction_Lab.Point_In_Rectangle_02;

public class Point {

    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean greaterOrEqual(Point p) {
        return p.x <= x && p.y <= y;
    }

    public boolean lessOrEqual(Point p) {
        return x <= p.x && y <= p.y;
    }
}
