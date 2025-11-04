
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversorTemperaturaTest {

    private final ConversorTemperatura conversor = new ConversorTemperatura();

    @Test
    public void deveConverterZeroCelsiusParaTrintaEDoisFahrenheit() {
        
        assertEquals(32.0, conversor.celsiusParaFahrenheit(0.0), 0.001); 
    }
    

    @Test
    public void deveConverterTrintaEDoisFahrenheitParaZeroCelsius() {
        
        assertEquals(100.0, conversor.fahrenheitParaCelsius(212.0), 0.001); 
    }
}