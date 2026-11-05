public class TemperatureConverter {

	public double celsiusToFahrenheit(double celcius){
		return(((celcius * 9)/5)+32);
	}

	public double fahrenheitToCelsius(double fahrenheit){
		return(((fahrenheit-32)*5)/9);
	}

	public double celciusToKelvin(double celcius){
		return(celcius+273.15);
	}

	
}
