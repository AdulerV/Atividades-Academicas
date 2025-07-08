package ListasDeExercicios.Lista04.Questao01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoteTest {

    @Test
    void deveCalcularValorLote() {
        Lote lote = new Lote();
        lote.setMetragemQuadrada(100);
        assertEquals(3000.0f, lote.calcularValor());
    }
}