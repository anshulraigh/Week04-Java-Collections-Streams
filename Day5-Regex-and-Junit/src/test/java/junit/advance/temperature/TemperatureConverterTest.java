package junit.advance.temperature;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {

    @Test
    public void testCelsiusToFahrenheit() {
        // Test known conversion values
        assertEquals(32.0, TemperatureConverter.celsiusToFahrenheit(0), 0.001);
        assertEquals(212.0, TemperatureConverter.celsiusToFahrenheit(100), 0.001);
        assertEquals(50.0, TemperatureConverter.celsiusToFahrenheit(10), 0.001);
    }

    @Test
    public void testFahrenheitToCelsius() {
        // Test known conversion values
        assertEquals(0.0, TemperatureConverter.fahrenheitToCelsius(32), 0.001);
        assertEquals(100.0, TemperatureConverter.fahrenheitToCelsius(212), 0.001);
        assertEquals(10.0, TemperatureConverter.fahrenheitToCelsius(50), 0.001);
    }
}
