package base.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.function.Consumer;

/**
 * @author ahmatjan(UuCode)
 * @email Hyper-Hack@outlook.com
 * @since 4/8/2021 00:39
 */

public class TestRunner {

    public static void main(String[] args) throws IllegalAccessException,
            InstantiationException, NoSuchMethodException,
            InvocationTargetException, ClassNotFoundException {
        Class student = null;

        try {
            student = Class.forName("base.reflect.Student");
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        // get all public fields of the Object.
        Field[] fields = student.getFields();

        for(Field field : fields) {
            System.out.println(field);
        }

        System.out.println("-----------------------");

        // get all fields but not the extended class of the object.
        Field[] declaredFields = student.getDeclaredFields();

        for(Field field : declaredFields) {
            System.out.println(field);
        }

        System.out.println("------------------------");

        // get all public method of the object.
        Method[] methods = student.getMethods();

        for(Method method : methods) {
            System.out.println(method);
        }

        System.out.println("------------------------");

        // get all methods but not the extended class of the object.
        Method[] declaredMethods = student.getDeclaredMethods();

        for (Method method : declaredMethods) {
            System.out.println(method);
        }

        System.out.println("------------------------");

        // get all public constructor of the object.
        Constructor[] constructors = student.getConstructors();

        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }

        System.out.println("------------------------");

        // get all constructor of the object.
        Constructor[] declaredConstructor = student.getDeclaredConstructors();

        for (Constructor constructor : declaredConstructor) {
            System.out.println(constructor);
        }

        Class c = Class.forName("base.reflect.Student");

        Student student1 = (Student) c.newInstance();

        // 1. create instance by constructor, use setter
        student1.setAddress("Xinjiang");
        System.out.println(student1);

        // 2. get all constructor method and use it for set value.
        Constructor<Student> constructor = c.getConstructor(String.class, int.class,
                String.class, String.class);

        Student student2 = (Student) constructor.newInstance("Ahmatjan1", 25,
                "worker", "Hunan");

        System.out.println(student2);

        // get the method and execute.
        Method show = c.getMethod("toString");
        String object = (String) show.invoke(student2);
        System.out.println(object);
    }

}
