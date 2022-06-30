package JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Java_OOP.Java_OOP_Exercises.Interfaces_And_Abstraction_Exercises.Birthday_Celebrations_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Birthable> birthables = new ArrayList<>();

        String line = scanner.nextLine();
        while (!line.equals("End")) {
            String[] tokens = line.split("\\s+");

            switch (tokens[0]) {
                case "Citizen":
                    birthables.add(new Citizen(tokens[1], Integer.parseInt(tokens[2]), tokens[3], tokens[4]));
                    break;
                case "Robot":
                    new Robot(tokens[1], tokens[2]);
                    break;
                case "Pet":
                    birthables.add(new Pet(tokens[1], tokens[2]));
                    break;
            }

//            if (tokens[0].equals("Robot")) {
//                scanner.nextLine();
//                continue;
//            }
//
//            try {
//                Class<?> clazz = Class.forName(tokens[0]);
//                Constructor<?> constructor = clazz.getDeclaredConstructors()[0];
//                constructor.setAccessible(true);
//                Birthable birthable;
//
//                if (constructor.getParameterCount() == 4) {
//                    birthable = (Birthable) constructor.newInstance(tokens[1], Integer.parseInt(tokens[2]), tokens[3], tokens[4]);
//                } else {
//                    birthable = (Birthable) constructor.newInstance(tokens[1], tokens[2]);
//                }
//
//                birthables.add(birthable);
//
//            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | InvocationTargetException ex) {
//                ex.printStackTrace();
//            }


            line = scanner.nextLine();
        }

        String year = scanner.nextLine();

        boolean hasOutput = false;
        for (Birthable birthable : birthables) {
            if (birthable.getBirthDate().endsWith(year)) {
                System.out.println(birthable.getBirthDate());
                hasOutput = true;
            }
        }
        if (!hasOutput) {
            System.out.println("<no output>");
        }


    }
}
