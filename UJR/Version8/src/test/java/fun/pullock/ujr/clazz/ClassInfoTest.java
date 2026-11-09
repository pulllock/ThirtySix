package fun.pullock.ujr.clazz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class ClassInfoTest {

    @Test
    public void testBase() {
        ClassInfo classInfo = new ClassInfo();
        assertDoesNotThrow(classInfo::base);
    }

    @Test
    public void testField() {
        ClassInfo classInfo = new ClassInfo();
        assertDoesNotThrow(classInfo::field);
    }

    @Test
    public void testMethod() {
        ClassInfo classInfo = new ClassInfo();
        assertDoesNotThrow(classInfo::method);
    }

    @Test
    public void testConstructor() {
        ClassInfo classInfo = new ClassInfo();
        assertDoesNotThrow(classInfo::constructor);
    }

    @Test
    public void testAnnotation() {
        ClassInfo classInfo = new ClassInfo();
        classInfo.annotation();
    }
}
