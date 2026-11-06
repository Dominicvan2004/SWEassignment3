import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

	@Test
	void celciusToFarenheit() {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(32, converter.celsiusToFahrenheit(0));
	}
	@Test
	void fahrenheitToCelsius() {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(100, converter.fahrenheitToCelsius(212));
	}
    @Test 
    void celciusToKelvin() {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(273.15, converter.celciusToKelvin(0));

    }

}
