package methodexceptionpropagation;

public class ExceptionPropagationDemo {

    public static void method1() {
        int result = 10 / 0; // This will cause ArithmeticException
    }

    public static void method2() {
        method1(); // Calls method1(), propagating exception
    }

    public static void main(String[] args) {
        try {
            method2(); // Calls method2(), exception propagates
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}
