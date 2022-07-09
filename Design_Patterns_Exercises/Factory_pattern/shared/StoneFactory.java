package JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Java_OOP.Java_OOP_Exercises.Design_Patterns_Exercises.Factory_pattern.shared;

import JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Java_OOP.Java_OOP_Exercises.Design_Patterns_Exercises.Factory_pattern.model.GameObject;
import JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Java_OOP.Java_OOP_Exercises.Design_Patterns_Exercises.Factory_pattern.model.Stone;

public class StoneFactory implements Factory {
    @Override
    public GameObject produce() {
        return new Stone();
    }
}
