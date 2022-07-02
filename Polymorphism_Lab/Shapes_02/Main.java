package JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Java_OOP.Java_OOP_Exercises.Polymorphism_Lab.Shapes_02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Shape shape = new Rectangle(13D, 2D);
        Shape shape2 = new Circle(3D);

        List<Shape> shapes = new ArrayList<>();

        shapes.add(shape);
        shapes.add(shape2);

        for (Shape s : shapes) {
            System.out.println(s.getArea());
            System.out.println(s.getPerimeter());
        }
    }
}
