package ListasDeExercicios.Lista04.Questao01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CasaTest {

    @Test
    void deveCalcularValorCasa() {
        Casa casa = new Casa();
        casa.setMetragemQuadrada(100);
        casa.setMetragemQuadradaConstrucao(50);
        assertEquals(5500, casa.calcularValor());
    }

    @Test
    void deveImpedirMetragemConstrucaoInvalida() {
        try {
            Casa casa = new Casa();
            casa.setMetragemQuadradaConstrucao(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Metragem quadrada da construção inválida!", e.getMessage());
        }
    }
}
