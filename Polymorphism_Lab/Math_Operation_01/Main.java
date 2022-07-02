package Polymorphism_Lab.Math_Operation_01;

public class Main {
    public static void main(String[] args) {
        MathOperation math = new MathOperation();
        
        System.out.println(math.add(2, 2));
        System.out.println(math.add(3, 3, 3));
        System.out.println(math.add(4, 4, 4, 4));
    }
}
