package ListasDeExercicios.Lista04.Questao04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreteUrgenteTest {

    @Test
    void deveRetornarTaxaEntrega() {
        FreteUrgente freteUrgente = new FreteUrgente(new Cliente(), 1);
        assertEquals(0.03f, freteUrgente.getTaxaEntrega());
    }

    @Test
    void deveDefinirNumeroItens() {
        FreteUrgente freteUrgente = new FreteUrgente(new Cliente(), 2);
        freteUrgente.setNumeroItens(1);
        assertEquals(1, freteUrgente.getNumeroItens());
    }

    @Test
    void deveImpedirNumeroItensInvalido() {
        try {
            FreteUrgente freteUrgente = new FreteUrgente(new Cliente(), 3);
            freteUrgente.setNumeroItens(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Número de itens inválido!", e.getMessage());
        }
    }

    @Test
    void deveCalcularValorFreteUrgente() {
        FreteUrgente freteUrgente = new FreteUrgente(new Cliente(), 4);
        freteUrgente.setValor(100.0f);
        freteUrgente.setNumeroItens(2);
        assertEquals(123.0f, freteUrgente.calcularValor());
    }
}