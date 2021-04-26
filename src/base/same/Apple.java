package base.same;

/**
 * @author ahmatjan(UuCode)
 * @email Hyper-Hack@outlook.com
 * @since 4/5/2021 23:22
 */

public class Apple extends Fruit{

    int i = 0;

    int sum;
    String color;


    public Apple(){}


    public int getSum() {
        return sum;
    }

    public String getColor() {
        return color;
    }

    public int getApple(int sum) {
        return sum;
    }

    public String getApple() {
        return color;
    }

    @Override
    public void eat() {
        super.num = 10;
        System.out.println("eat base.same.Apple : " + num);
    }

    Apple eatApple() {
        i++;
        return this;
    }

}