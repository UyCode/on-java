package base.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ahmatjan(UuCode)
 * @email Hyper-Hack@outlook.com
 * @since 4/7/2021 23:39
 */


public class Generics<T> implements Generator<T>{
    // any type for T

    private String value;
    private T next;

    @Override
    public T next() {
        return next;
    }


    /*public Generics(T value) {
        this.value = value;
    }*/

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
