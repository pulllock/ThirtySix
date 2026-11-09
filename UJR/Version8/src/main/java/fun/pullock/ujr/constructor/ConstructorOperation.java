package fun.pullock.ujr.constructor;

import fun.pullock.ujr.clazz.model.Product;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

public class ConstructorOperation {

    public void newInstanceWithDefaultConstructor() throws NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        // class
        Class<?> clazz = Product.class;

        // default constructor
        Constructor<?> defaultConstructor = clazz.getConstructor(null);
        System.out.println("default constructor: " + defaultConstructor);

        // create instance
        Product product = (Product) defaultConstructor.newInstance();
        System.out.println("instance: " + product);
    }

    public void newInstanceWithPrivateConstructor() throws NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        // class
        Class<?> clazz = Product.class;

        // private constructor
        Constructor<?> privateConstructor = clazz.getDeclaredConstructor(BigDecimal.class);
        System.out.println("private constructor: " + privateConstructor);

        // accessible
        boolean accessible = privateConstructor.isAccessible();
        System.out.println("private constructor accessible: " + accessible);

        // set accessible
        privateConstructor.setAccessible(true);
        accessible = privateConstructor.isAccessible();
        System.out.println("private constructor accessible: " + accessible);

        // create instance
        Product product = (Product) privateConstructor.newInstance(new BigDecimal("10.1"));
        System.out.println("instance: " + product);
    }
}
