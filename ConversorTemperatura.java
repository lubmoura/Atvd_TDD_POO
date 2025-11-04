public class ConversorTemperatura {
    
    public double celsiusParaFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }

    public double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * (5.0 / 9.0);
    }
}
