package ygnn.cola.study.day35;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Cola0817
 * @name Demo01
 * @date 2023/9/27 19:26
 * @since 1.0.0
 */
public class Demo01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> aClass = Class.forName("ygnn.cola.study.day35.SayHello");
        Object o = aClass.getDeclaredConstructor().newInstance();
        Method method = aClass.getMethod("sayHello", String.class);

        System.out.println(method.invoke(o, "Cola777"));
    }
}
