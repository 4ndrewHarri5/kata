package wardrobe;

public class WardrobeComponent implements Component {

    private Integer length;
    private Integer cost;

    public WardrobeComponent(Integer length, Integer cost) {
        this.length = length;
        this.cost = cost;
    }

    public Integer getLength() {
        return this.length;
    }

    public Integer getCost() {
        return this.cost;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }
}
