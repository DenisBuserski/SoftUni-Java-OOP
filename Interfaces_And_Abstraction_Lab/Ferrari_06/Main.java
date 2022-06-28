package JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Java_OOP.Java_OOP_Exercises.Interfaces_And_Abstraction_Lab.Ferrari_06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String driverName = scanner.nextLine();

        Ferrari ferrari = new Ferrari(driverName);

        System.out.printf("%s/%s/%s/%s%n", ferrari.getModel(), ferrari.brakes(), ferrari.gas(), ferrari.getDriverName());

    }
}
