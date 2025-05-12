package ListasDeExercicios.ListasExtras.Lista01.Questao01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperaturaTest {
    Temperatura temperatura;

    @BeforeEach
    public void setUp() {
        temperatura = new Temperatura();
    }

    @Test
    public void deveConverterCelsiusParaFahrenheit() {
        temperatura.setValor(0);
        temperatura.setUnidadeOrigem("celsius");
        assertEquals(32, temperatura.converterCelsiusParaFahrenheit());
    }

    @Test
    public void deveConverterCelsiusParaKelvin() {
        temperatura.setValor(0);
        temperatura.setUnidadeOrigem("celsius");
        assertEquals(273.15f, temperatura.converterCelsiusParaKelvin());
    }

    @Test
    public void deveConverterFahrenheitParaCelsius() {
        temperatura.setValor(0);
        temperatura.setUnidadeOrigem("fahrenheit");
        assertEquals(-17.78, temperatura.converterFahrenheitParaCelsius(), 0.01);
    }

    @Test
    public void deveConverterFahrenheitParaKelvin() {
        temperatura.setValor(0);
        temperatura.setUnidadeOrigem("fahrenheit");
        assertEquals(255.372, temperatura.converterFahrenheitParaKelvin(), 0.01);
    }

    @Test
    public void deveConverterKelvinParaCelsius() {
        temperatura.setValor(0);
        temperatura.setUnidadeOrigem("kelvin");
        assertEquals(-273.15, temperatura.converterKelvinParaCelsius(), 0.01);
    }

    @Test
    public void deveConverterKelvinParaFahrenheit() {
        temperatura.setValor(0);
        temperatura.setUnidadeOrigem("kelvin");
        assertEquals(-459.67, temperatura.converterKelvinParaFahrenheit(), 0.01);
    }

    @Test
    public void deveExibirConversaoParaCelsius() {
        temperatura.setValor(25);
        temperatura.setUnidadeOrigem("celsius");
        assertEquals("Fahrenheit: 77,00 - Kelvin: 298,15", temperatura.exibirConversao());
    }

    @Test
    public void deveExibirConversaoParaFahrenheit() {
        temperatura.setValor(32);
        temperatura.setUnidadeOrigem("fahrenheit");
        String esperado = "Celsius: 0,00 - Kelvin: 273,15";
        assertEquals(esperado, temperatura.exibirConversao());
    }

    @Test
    public void deveExibirConversaoParaKelvin() {
        temperatura.setValor(273.15f);
        temperatura.setUnidadeOrigem("kelvin");
        String esperado = "Celsius: 0,00 - Fahrenheit: 32,00";
        assertEquals(esperado, temperatura.exibirConversao());
    }

    @Test
    public void deveTestarUnidadeOrigemInvalida() {
        try {
            temperatura.setUnidadeOrigem("Réaumur");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Unidade de origem inválida!", e.getMessage());
        }
    }
}