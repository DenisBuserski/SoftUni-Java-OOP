package JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Java_OOP.Java_OOP_Exercises.Polymorphism_Lab.Math_Operation_01;

public class MathOperation {

    public static int add(int num1, int num2) {
        return num1 + num2;
    }
    public static int add(int num1, int num2, int num3) {
        return add(add(num1, num2), num3);
    }

    public static int add(int num1, int num2, int num3, int num4) {
        return add(add(num1, num2), num3, num4);
    }
}
