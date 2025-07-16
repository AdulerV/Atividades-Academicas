package ListasDeExercicios.Lista04.Questao04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreteTest {
    @Test
    void deveInserirNumero() {
        FreteNormal frete = new FreteNormal(new Cliente(), 0);
        assertEquals(0, frete.getNumero());
    }

    @Test
    void deveImpedirNumeroNegativo() {
        try {
            FreteNormal frete = new FreteNormal(new Cliente(), -1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Número de frete inválido!", e.getMessage());
        }
    }

    @Test
    void deveInserirValor() {
        FreteNormal frete = new FreteNormal(new Cliente(), 1);
        frete.setValor(0.01f);
        assertEquals(0.01f, frete.getValor());
    }

    @Test
    void deveImpedirValorNegativo() {
        try {
            FreteNormal frete = new FreteNormal(new Cliente(), 1);
            frete.setValor(-0.01f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor de frete inválido!", e.getMessage());
        }
    }

    @Test
    void deveInserirCliente() {
        Cliente cliente = new Cliente();
        FreteNormal frete = new FreteNormal(cliente, 1);
        assertEquals(cliente, frete.getCliente());
    }

    @Test
    void deveImpedirClienteNulo() {
        try {
            FreteNormal frete = new FreteNormal(null, 1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O cliente é obrigatório!", e.getMessage());
        }
    }

    @Test
    void deveCalcularValorFreteNormal() {
        FreteNormal frete = new FreteNormal(new Cliente(), 1);
        frete.setValor(150.0f);
        assertEquals(150.0f, frete.calcularValor());
    }

    @Test
    void deveRetornarClienteAssociado() {
        Cliente cliente = new Cliente();
        FreteNormal frete = new FreteNormal(cliente, 20);
        assertEquals(cliente, frete.getCliente());
    }

    @Test
    void deveRetornarNumeroFrete() {
        FreteNormal frete = new FreteNormal(new Cliente(), 33);
        assertEquals(33, frete.getNumero());
    }
}
