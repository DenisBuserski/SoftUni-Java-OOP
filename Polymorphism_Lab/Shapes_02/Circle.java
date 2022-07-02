package JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Java_OOP.Java_OOP_Exercises.Polymorphism_Lab.Shapes_02;

public class Circle extends Shape {
    private   Double radius;

    public Circle(Double radius) {
        this.radius = radius;
        calculatePerimeter();
        calculateArea();
    }

    @Override
    protected void calculatePerimeter() {
        Double result = 2 * Math.PI * radius;
        setPerimeter(result);
    }

    @Override
    protected void calculateArea() {
        Double result = Math.PI * radius * radius;
        setArea(result);
    }

    public final Double getRadius() {
        return radius;
    }
}
