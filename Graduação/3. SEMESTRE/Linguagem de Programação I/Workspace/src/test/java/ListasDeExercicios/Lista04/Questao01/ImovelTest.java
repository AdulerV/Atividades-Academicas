package ListasDeExercicios.Lista04.Questao01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImovelTest {
    @Test
    void deveInserirMetragem() {
        Imovel lote = new Lote();
        lote.setMetragemQuadrada(1);
        assertEquals(1, lote.getMetragemQuadrada());
    }

    @Test
    void deveImpedirMetragemInvalida() {
        try {
            Imovel lote = new Lote();
            lote.setMetragemQuadrada(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Metragem quadrada inválida!", e.getMessage());
        }
    }

    @Test
    void deveCalcularValorImovel() {
        Imovel lote = new Lote();
        lote.setMetragemQuadrada(100);
        assertEquals(3000.0f, lote.calcularValor());
    }
}
