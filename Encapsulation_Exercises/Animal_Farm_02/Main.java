package JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Java_OOP.Java_OOP_Exercises.Encapsulation_Exercises.Animal_Farm_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        Chicken chicken = null;
        try {
            chicken = new Chicken(name, age);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
            return;
        }
        System.out.println(chicken.toString());


    }
}
