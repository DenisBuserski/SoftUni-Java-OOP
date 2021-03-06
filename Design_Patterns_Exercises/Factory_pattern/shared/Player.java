package Factory_pattern.shared;

import Factory_pattern.core.Main;
import Factory_pattern.model.GameObject;

import java.util.concurrent.ThreadLocalRandom;

public class Player implements GameObject {
    private int healthPoints;
    private int damage;
    private Factory factory;

    public Player(int healthPoints, int damage) {
        this.healthPoints = healthPoints;
        this.damage = damage;
        this.factory = new StoneFactory();
    }

    @Override
    public void update() {
        int nextInt = ThreadLocalRandom.current().nextInt(1000);

        if (nextInt % 3 == 0) {
            Main.gameObjects.add(this.factory.produce());
        } else if (nextInt % 7 == 0) {
            Main.gameObjects.removeIf(g -> g.getClass().getSimpleName().equals("Stone"));
        }
        System.out.println("Player updated");
    }

    @Override
    public void render() {
        System.out.println("Player rendered");
    }
    
}
