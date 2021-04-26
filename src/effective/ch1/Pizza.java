package effective.ch1;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 4/12/2021 21:12
 */

public abstract class Pizza {

    public enum Topping{
        /*
         *pizza枚举常量
         */

        HAM,
        MUSHROOM,
        ONION,
        PEPPER,
        SAUSAGE;
    }

    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract Pizza build();

        protected abstract T self();

    }

    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }

}
