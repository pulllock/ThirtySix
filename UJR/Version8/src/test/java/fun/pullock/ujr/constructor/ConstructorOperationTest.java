package fun.pullock.ujr.constructor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class ConstructorOperationTest {

    @Test
    public void testNewInstanceWithDefaultConstructor() {
        ConstructorOperation operation = new ConstructorOperation();
        assertDoesNotThrow(operation::newInstanceWithDefaultConstructor);
    }

    @Test
    public void testNewInstanceWithPrivateConstructor() {
        ConstructorOperation operation = new ConstructorOperation();
        assertDoesNotThrow(operation::newInstanceWithPrivateConstructor);
    }
}
