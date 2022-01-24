package base.collection;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 1/20/2022
 */

public class Conllections {

    public static void main(String[] args){
        // init a empty learning lists.
        //在使用 java.util.stream.Collectors 类的 toMap() 方法转为 Map 集合时，一定要注意当 value 为 null 时会抛 NPE 异常。
        List<Person> people = new ArrayList<>();
        people.add(new Person("ahmat", 16));
        // null to the age
        people.add(new Person("ahmat1", 26));
        Map<String, Integer> map = people.stream().collect(Collectors.toMap(Person::getName, Person::getAge));
        System.out.println(map.get("ahmat"));
    }

}

class Person {
    private String name;
    private Integer age;

    Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}