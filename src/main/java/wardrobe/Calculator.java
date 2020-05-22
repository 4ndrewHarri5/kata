package wardrobe;

public class Calculator {

    public Component getNextBlock(int remainingHeight) {
        if (remainingHeight >= 100){
            return new WardrobeComponent(100, 90);
        } else if (remainingHeight >= 75) {
            return new WardrobeComponent(75, 62);
        }

        return new WardrobeComponent(50, 59);
    }
}
