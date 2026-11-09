package fun.pullock.ujr.method;

import fun.pullock.ujr.clazz.model.Product;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;

public class MethodOperation {

    public void invokePublicMethod() throws NoSuchMethodException, InstantiationException,
            IllegalAccessException, InvocationTargetException {
        // class
        Class<Product> clazz = Product.class;

        // default constructor
        Constructor<?> defaultConstructor = clazz.getConstructor(null);
        System.out.println("default constructor: " + defaultConstructor);

        // new instance with default constructor
        Product product = (Product) defaultConstructor.newInstance();
        System.out.println("instance: " + product);

        // public method
        Method publicMethod = clazz.getMethod("setName", String.class);
        System.out.println("public method: " + publicMethod);

        // invoke method
        Object result = publicMethod.invoke(product, "name from reflection");
        System.out.println("invoke result: " + result + ", instance: " + product);
    }

    public void invokePrivateMethod() throws NoSuchMethodException, InstantiationException,
            IllegalAccessException, InvocationTargetException {
        // class
        Class<Product> clazz = Product.class;

        // default constructor
        Constructor<?> defaultConstructor = clazz.getConstructor(null);
        System.out.println("default constructor: " + defaultConstructor);

        // new instance with default constructor
        Product product = (Product) defaultConstructor.newInstance();
        System.out.println("instance: " + product);

        // private method
        Method privateMethod = clazz.getDeclaredMethod("setPrice", BigDecimal.class);
        System.out.println("private method: " + privateMethod);

        // accessible
        boolean accessible = privateMethod.isAccessible();
        System.out.println("accessible: " + accessible);

        // set accessible
        privateMethod.setAccessible(true);
        System.out.println("accessible: " + accessible);

        // invoke method
        Object result = privateMethod.invoke(product, new BigDecimal("10.2"));
        System.out.println("invoke result: " + result + ", instance: " + product);
    }
}
