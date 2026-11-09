package fun.pullock.ujr.clazz;

import fun.pullock.ujr.clazz.model.Product;

public class GetClass {

    public void withClassName() {
        Class<?> productClass = Product.class;
        System.out.println("Get class with Product.class: " + productClass);
    }

    public void withClassForName() throws ClassNotFoundException {
        Class<?> productClass = Class.forName("fun.pullock.ujr.clazz.model.Product");
        System.out.println("Get class with class for name: " + productClass);
    }

    public void instanceGetClass() {
        Product product = new Product();
        Class<?> productClass = product.getClass();
        System.out.println("Get class from instance: " + productClass);
    }

    public void withLoadClass() throws ClassNotFoundException {
        Class<?> productClass = ClassLoader.getSystemClassLoader().loadClass("fun.pullock.ujr.clazz.model.Product");
        System.out.println("Get class using ClassLoader.loadClass: " + productClass);
    }
}
