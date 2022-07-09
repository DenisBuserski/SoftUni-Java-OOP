package Factory_pattern.data;

import Factory_pattern.shared.Enemy;
import Factory_pattern.shared.Player;

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
