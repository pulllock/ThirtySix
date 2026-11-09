package fun.pullock.ujr.clazz;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class GetClassTest {

    @Test
    public void testWithClassName() {
        GetClass getClass = new GetClass();
        getClass.withClassName();
    }

    @Test()
    public void testWithClassForName() {
        GetClass getClass = new GetClass();
        assertDoesNotThrow(getClass::withClassForName);
    }

    @Test
    public void testInstanceGetClass() {
        GetClass getClass = new GetClass();
        getClass.instanceGetClass();
    }

    @Test
    public void testWithLoadClass() {
        GetClass getClass = new GetClass();
        assertDoesNotThrow(getClass::withLoadClass);
    }
}
