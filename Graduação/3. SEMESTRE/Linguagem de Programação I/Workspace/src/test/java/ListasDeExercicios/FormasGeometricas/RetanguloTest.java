package ListasDeExercicios.FormasGeometricas;

import ListasDeExercicios.FormasGeometricas.Retangulo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RetanguloTest {
    Retangulo retangulo;

    @BeforeEach
    public void setUp() {
        retangulo = new Retangulo();
    }

    @Test
    public void deveInserirAltura() {
        retangulo.setAltura(0.1f);
        assertEquals(0.1f, retangulo.getAltura());
    }

    @Test
    public void deveInserirLargura() {
        retangulo.setLargura(0.1f);
        assertEquals(0.1f, retangulo.getLargura());
    }

    @Test
    public void deveCalcularArea() {
            retangulo.setAltura(3);
            retangulo.setLargura(5);
            assertEquals(15, retangulo.calcularArea());
    }

    @Test
    public void deveCalcularPerimetro() {
        retangulo.setAltura(7);
        retangulo.setLargura(11);
        assertEquals(36, retangulo.calcularPerimetro());
    }

    @Test
    public void deveImpedirQuadrado() {
        try {
            retangulo.setAltura(10);
            retangulo.setLargura(10);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Não é aceito um quadrado!", e.getMessage());
        }
    }

    @Test
    public void deveImpedirLarguraInvalida() {
        try {
            retangulo.setLargura(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Largura inválida!", e.getMessage());
        }
    }

    @Test
    public void deveImpedirAlturaInvalida() {
        try {
            retangulo.setAltura(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Altura inválida!", e.getMessage());
        }
    }
}