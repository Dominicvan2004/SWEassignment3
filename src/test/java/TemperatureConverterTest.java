import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

	@Test
	void celciusToFarenheit() {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(39.2, converter.celsiusToFahrenheit(4));
	}
	@Test
	void fahrenheitToCelsius() {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(5, converter.fahrenheitToCelsius(41));
	}
    @Test 
    void celciusToKelvin() {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(273.15, converter.celciusToKelvin(0));

    }

}
