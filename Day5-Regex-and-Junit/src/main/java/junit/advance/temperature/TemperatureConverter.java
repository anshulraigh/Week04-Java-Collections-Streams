package junit.advance.temperature;

public class TemperatureConverter {

    /**
     * Converts Celsius to Fahrenheit.
     * Formula: (celsius * 9/5) + 32
     *
     * @param celsius temperature in Celsius
     * @return equivalent temperature in Fahrenheit
     */
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    /**
     * Converts Fahrenheit to Celsius.
     * Formula: (fahrenheit - 32) * 5/9
     *
     * @param fahrenheit temperature in Fahrenheit
     * @return equivalent temperature in Celsius
     */
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }
}
