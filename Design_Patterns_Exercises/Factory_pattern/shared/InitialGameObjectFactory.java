package JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Java_OOP.Java_OOP_Exercises.Design_Patterns_Exercises.Factory_pattern.shared;

import JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Java_OOP.Java_OOP_Exercises.Design_Patterns_Exercises.Factory_pattern.model.GameObject;

import java.util.ArrayList;
import java.util.List;

public class InitialGameObjectFactory implements ProduceMultiple {

    private List<Factory> objectFactories;

    public InitialGameObjectFactory() {
        this.objectFactories = new ArrayList<>();
    }

    @Override
    public List<GameObject> produce() {
        List<GameObject> gameObjects = new ArrayList<>();
        for (Factory objectFactory : objectFactories) {
            gameObjects.add(objectFactory.produce());
        }

        return gameObjects;
    }

    @Override
    public void setFactories(List<Factory> objectFactories) {
        this.objectFactories = objectFactories;

    }
}
