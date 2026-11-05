import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

	@Test
	void celciusToFarenheit() {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(39.3, converter.celsiusToFahrenheit(4));
	}
	@Test
	void fahrenheitToCelsius() {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(3, converter.fahrenheitToCelsius(39.2));
	}
    @Test 
    void celciusToKelvin() {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(0, converter.celciusToKelvin(0));

    }

}
