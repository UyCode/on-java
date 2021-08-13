package southwind.collection;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 2021/5/8 23:44
 */

public class A implements Comparable{
    private int num;
    public A(int num) {
        this.num = num;
    }

    @Override
    public int compareTo(Object o) {
        A a = (A)o;
        if(this.num > a.num) {
            return 1;
        } else if(this.num == a.num) {
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "A{" +
                "num=" + num +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
        // instanceOf 判断对象是否属于某个类
        if(o instanceof A) {
            A a = (A)o;
            if(this.num == a.num) {
                return true;
            }
        }
        return false;
    }

}
