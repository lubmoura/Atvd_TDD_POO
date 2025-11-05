package com.luana.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ConversorTemperaturaTest {

    @Test
    public void deveConverterZeroCelsiusParaTrintaEDoisFahrenheit() {
        ConversorTemperatura conversor = new ConversorTemperatura();
        double resultado = conversor.celsiusParaFahrenheit(0);
        assertEquals(32.0, resultado, 0.0001);
    }

    @Test
    public void deveConverterTrintaEDoisFahrenheitParaZeroCelsius() {
        ConversorTemperatura conversor = new ConversorTemperatura();
        double resultado = conversor.fahrenheitParaCelsius(32);
        assertEquals(0.0, resultado, 0.0001);
    }
}
