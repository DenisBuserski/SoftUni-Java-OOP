package JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Java_OOP.Java_OOP_Exercises.Polymorphism_Lab.Shapes_02;

public abstract class Shape {

    private Double perimeter;
    private Double area;

    protected abstract void calculatePerimeter();
    protected abstract void calculateArea();

    protected void setArea(Double area) {
        this.area = area;
    }

    protected void setPerimeter(Double perimeter) {
        this.perimeter = perimeter;
    }

    public Double getPerimeter() {
        return perimeter;
    }

    public Double getArea() {
        return area;
    }
}
