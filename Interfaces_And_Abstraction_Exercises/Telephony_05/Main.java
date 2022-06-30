package JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Java_OOP.Java_OOP_Exercises.Interfaces_And_Abstraction_Exercises.Telephony_05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbers = Arrays.asList(scanner.nextLine().split("\\s+").clone());
        List<String> urls = Arrays.asList(scanner.nextLine().split("\\s+").clone());

        Smartphone smartphone = new Smartphone(numbers, urls);
        System.out.println(smartphone.call());
        System.out.println(smartphone.browse());







    }



}


