package wardrobe;

import java.util.Collections;
import java.util.List;

public class Calculator {

    public Component getNextBlock(int remainingHeight) throws NoComponentException {
        if (remainingHeight >= 120) {
            return new WardrobeComponent(120, 111);
        } else if (remainingHeight >= 100) {
            return new WardrobeComponent(100, 90);
        } else if (remainingHeight >= 75) {
            return new WardrobeComponent(75, 62);
        } else if (remainingHeight >= 50) {
            return new WardrobeComponent(50, 59);
        }
        throw new NoComponentException("no component can fit the remaining space");
    }


    public int calculateRemainingHeight(Integer maxHeight, List<Component> components) {
        int remainingHeight = maxHeight;
        for (Component c : components){
            remainingHeight -= c.getLength();
        }
        return remainingHeight;
    }
}
