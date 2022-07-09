package JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Java_OOP.Java_OOP_Exercises.Design_Patterns_Exercises.Factory_pattern.shared;

import JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Java_OOP.Java_OOP_Exercises.Design_Patterns_Exercises.Factory_pattern.model.GameObject;

public class Enemy implements GameObject {

    private int healthPoints;
    private int damage;

    public Enemy(int healthPoints, int damage) {
        this.healthPoints = healthPoints;
        this.damage = damage;
    }

    @Override
    public void update() {
        System.out.println("Enemy updated");
    }

    @Override
    public void render() {
        System.out.println("Enemy rendered");
    }
}
