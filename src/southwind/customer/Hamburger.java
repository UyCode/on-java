package southwind.customer;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 4/27/2021 20:36
 */

public class Hamburger {

    private int id;

    public Hamburger(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Hamburger{" +
                "id=" + id +
                '}';
    }
}
