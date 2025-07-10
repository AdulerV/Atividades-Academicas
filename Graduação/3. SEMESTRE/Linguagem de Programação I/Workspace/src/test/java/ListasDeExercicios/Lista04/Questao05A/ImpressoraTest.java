package ListasDeExercicios.Lista04.Questao05A;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImpressoraTest {
    @Test
    void deveInserirValorTotalPecasTrocadas() {
        Cliente cliente = new Cliente();
        Impressora impressora = new Impressora(cliente, 6);
        impressora.setValorTotalPecasTrocadas(0.0f);
        assertEquals(0.0f, impressora.getValorTotalPecasTrocadas());
    }

    @Test
    void deveImpedirValorTotalPecasTrocadasNegativo() {
        try {
            Cliente cliente = new Cliente();
            Impressora impressora = new Impressora(cliente, 7);
            impressora.setValorTotalPecasTrocadas(-0.01f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor total das peças trocadas inválido!", e.getMessage());
        }
    }

    @Test
    void deveCalcularValorManutencaoImpressora() {
        Cliente cliente = new Cliente();
        Impressora impressora = new Impressora(cliente, 8);
        impressora.setValorMaoObra(100.0f);
        impressora.setValorTotalPecasTrocadas(50.0f);
        assertEquals(150.0f, impressora.calcularValorManutencao());
    }
}