package methodexceptionpropagation;

import org.junit.Test;

public class ExceptionPropagationDemoTest {

    @Test(expected = ArithmeticException.class)
    public void testMethod1ThrowsException() {
        ExceptionPropagationDemo.method1();
    }

    @Test(expected = ArithmeticException.class)
    public void testMethod2PropagatesException() {
        ExceptionPropagationDemo.method2();
    }
}
