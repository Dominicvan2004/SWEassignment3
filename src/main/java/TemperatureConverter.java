public class TemperatureConverter {

	public double celsiusToFahrenheit(double celcius){
		return(((celcius * 9.0)/5.0)+32);
	}

	public double fahrenheitToCelsius(double fahrenheit){
		return(((fahrenheit-32)*5.0)/9.0);
	}

	public double celciusToKelvin(double celcius){
		return(celcius+273.15);
	}

	
}
