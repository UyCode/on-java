package southwind.generics;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 2021/5/9 17:46
 */

public class Person<T, UID> {

    private UID uid;
    private int id;
    private T attr;

    public UID getUid() {
        return uid;
    }

    public void setUid(UID uid) {
        this.uid = uid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public T getAttr() {
        return attr;
    }

    public void setAttr(T attr) {
        this.attr = attr;
    }

    @Override
    public String toString() {
        return "Person{" +
                "uid=" + uid +
                ", id=" + id +
                ", attr=" + attr +
                '}';
    }
}
