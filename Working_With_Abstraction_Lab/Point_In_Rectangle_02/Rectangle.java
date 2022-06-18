package Working_With_Abstraction_Lab.Point_In_Rectangle_02;

public class Rectangle {
    private final Point A;
    private final Point B;

    public Rectangle(Point A, Point B) {
        this.A = A;
        this.B = B;
    }

    public boolean contains(Point p) {
        return p.greaterOrEqual(A) && p.lessOrEqual(B);
    }
    
}
