package JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Java_OOP.Java_OOP_Exercises.Polymorphism_Lab.Shapes_02;

public class Rectangle extends Shape {
    private Double height;
    private Double width;

    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
        calculatePerimeter();
        calculateArea();
    }

    @Override
    protected void calculatePerimeter() {
        Double result = height * 2 + width * 2;
        super.setArea(result);

    }

    @Override
    protected void calculateArea() {
        Double result = height * width;
        super.setPerimeter(result);
    }

    public Double getHeight() {
        return height;
    }

    public Double getWidth() {
        return width;
    }
}
