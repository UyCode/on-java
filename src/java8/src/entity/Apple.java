package java8.src.entity;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 7/20/2021 12:00 AM
 */


public class Apple {

    private long id;

    private String color;

    private int weight;

    public Apple(long id, String color, int weight) {
        this.id = id;
        this.color = color;
        this.weight = weight;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
