package Factory_pattern.core;

import Factory_pattern.model.GameObject;
import Factory_pattern.model.Initializer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<GameObject> gameObjects;

    public static void main(String[] args) throws InterruptedException {

        gameObjects = Initializer.init();

        boolean gameOver = false;

        while (!gameOver) {
            ArrayList<GameObject> copy = new ArrayList<>(Main.gameObjects);

            for (GameObject gameObject : copy) {
                gameObject.update();
                gameObject.render();
            }

            Thread.sleep(2000);
        }

    }
}
