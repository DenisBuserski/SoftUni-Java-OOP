package Factory_pattern.shared;

import Factory_pattern.model.GameObject;
import Factory_pattern.model.Initializer;

public class PlayerFactory implements Factory {

    @Override
    public GameObject produce() {
        int[] params = Initializer.dataStorage.load(Player.class);
        return new Player(params[0], params[1]);
    }
    
}
