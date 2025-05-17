package ListasDeExercicios.FormasGeometricas;

import ListasDeExercicios.FormasGeometricas.Circulo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {
    Circulo circulo;

    @BeforeEach
    public void setUp() {
        circulo = new Circulo();
    }

    @Test
    public void deveInserirRaio() {
        circulo.setRaio(0.1f);
        assertEquals(0.1f, circulo.getRaio());
    }

    @Test
    public void deveCalculaArea() {
        circulo.setRaio(5);
        assertEquals(78.5, circulo.calcularArea());
    }

    @Test
    public void deveCalcularPerimetro() {
        circulo.setRaio(3);
        assertEquals(18.84, circulo.calcularPerimetro(), 0.01);
    }

    @Test
    public void deveImpedirRaioInvalido() {
        try {
            circulo.setRaio(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Raio inválido!", e.getMessage());
        }
    }
}