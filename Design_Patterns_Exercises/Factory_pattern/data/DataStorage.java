package JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Java_OOP.Java_OOP_Exercises.Design_Patterns_Exercises.Factory_pattern.data;

import JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Java_OOP.Java_OOP_Exercises.Design_Patterns_Exercises.Factory_pattern.shared.Enemy;
import JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Java_OOP.Java_OOP_Exercises.Design_Patterns_Exercises.Factory_pattern.shared.Player;

import java.util.Map;

public class DataStorage {

    private Map<Class<?>, int []> objectsData = Map.of(
            Player.class, new int [] {100, 24},
            Enemy.class, new int [] {240, 2}
    );

    public int [] load(Class<?> clazz) {
        return this.objectsData.get(clazz);
    }

}
