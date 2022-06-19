package Working_With_Abstraction_Exercise.Traffic_Lights_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] colors = scanner.nextLine().split("\\s+");
        int count = Integer.parseInt(scanner.nextLine());
        List<Light> lightsList = new ArrayList<>();

        for (String color : colors) {
            Light light = new Light(Color.valueOf(color));
            lightsList.add(light);
        }

        for (int i = 0; i < count; i++) {
            for (Light light : lightsList) {
                light.changeColor();
                System.out.print(light.getColor() + " ");
            }
            System.out.println();
        }

    }
}