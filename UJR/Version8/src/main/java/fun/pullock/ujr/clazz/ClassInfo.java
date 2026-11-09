package fun.pullock.ujr.clazz;

import fun.pullock.ujr.clazz.model.Product;

import javax.annotation.Resource;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Arrays;

public class ClassInfo {

    public void base() {
        // Class
        Class<?> clazz = Product.class;

        // package
        Package pkg = clazz.getPackage();
        System.out.println("package name: " + pkg);

        // name
        String name = clazz.getName();
        System.out.println("class name: " + name);

        // simple name
        String simpleName = clazz.getSimpleName();
        System.out.println("simple name: " + simpleName);

        // modifier
        int modifiers = clazz.getModifiers();
        System.out.println("modifiers: " + modifiers);

        // super class
        Class<?> superclass = clazz.getSuperclass();
        System.out.println("superclass: " + superclass);

        // interface
        Class<?>[] interfaces = clazz.getInterfaces();
        System.out.println("interfaces: " + Arrays.toString(interfaces));
    }

    public void field() throws NoSuchFieldException {
        // Class
        Class<?> clazz = Product.class;

        // public fields
        Field[] fields = clazz.getFields();
        System.out.println("public fields: " + Arrays.toString(fields));

        // all fields
        Field[] declaredFields = clazz.getDeclaredFields();
        System.out.println("declared fields: " + Arrays.toString(declaredFields));

        // specified public field
        Field publicField = clazz.getField("count");
        System.out.println("public field: " + publicField);

        // specified private field
        Field privateField = clazz.getDeclaredField("name");
        System.out.println("private field: " + privateField);
    }

    public void method() throws NoSuchMethodException {
        // Class
        Class<?> clazz = Product.class;

        // public methods
        Method[] publicMethods = clazz.getMethods();
        System.out.println("public methods: " + Arrays.toString(publicMethods));

        // all methods
        Method[] declaredMethods = clazz.getDeclaredMethods();
        System.out.println("declared methods: " + Arrays.toString(declaredMethods));

        // specified method
        Method method = clazz.getMethod("getPrice", null);
        System.out.println("specified method: " + method);
    }

    public void constructor() throws NoSuchMethodException {
        // class
        Class<?> clazz = Product.class;

        // public constructors
        Constructor<?>[] publicConstructors = clazz.getConstructors();
        System.out.println("public constructors: " + Arrays.toString(publicConstructors));

        // all constructors
        Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();
        System.out.println("declared constructors: " + Arrays.toString(declaredConstructors));

        // specified constructor
        Constructor<?> specifiedConstructor = clazz.getConstructor(String.class);
        System.out.println("specified constructor: " + specifiedConstructor);
    }

    public void annotation() {
        // class
        Class<?> clazz = Product.class;

        // annotations
        Annotation[] annotations = clazz.getAnnotations();
        System.out.println("annotations: " + Arrays.toString(annotations));

        // specified annotation
        Resource  resource = clazz.getAnnotation(Resource.class);
        System.out.println("specified annotation: " + resource);
    }
}
