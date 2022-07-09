package Factory_pattern.shared;

import Factory_pattern.model.GameObject;
import Factory_pattern.model.Stone;

public class StoneFactory implements Factory {
    
    @Override
    public GameObject produce() {
        return new Stone();
    }
    
}
