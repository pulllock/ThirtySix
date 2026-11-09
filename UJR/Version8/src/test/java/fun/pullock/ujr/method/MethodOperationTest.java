package fun.pullock.ujr.method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;


public class MethodOperationTest {

    @Test
    public void testInvokePublicMethod() {
        MethodOperation operation = new MethodOperation();
        assertDoesNotThrow(operation::invokePublicMethod);
    }

    @Test
    public void testInvokePrivateMethod() {
        MethodOperation operation = new MethodOperation();
        assertDoesNotThrow(operation::invokePrivateMethod);
    }
}
