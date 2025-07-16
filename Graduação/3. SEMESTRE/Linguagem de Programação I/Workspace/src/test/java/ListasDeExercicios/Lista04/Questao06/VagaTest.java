package ListasDeExercicios.Lista04.Questao06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VagaTest {
    @Test
    void deveInserirNumeroValidoLimite() {
        Vaga vaga = new VagaDiaria(1, 1);
        assertEquals(1, vaga.getNumero());
    }

    @Test
    void deveImpedirNumeroInvalido() {
        try {
            Vaga vaga = new VagaDiaria(0, 1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Número inválido!", e.getMessage());
        }
    }

    @Test
    void deveInserirPlacaValida() {
        Vaga vaga = new VagaSemanal(2, 1);
        vaga.setPlaca(" abc1234 ");
        assertEquals("ABC1234", vaga.getPlaca());
    }

    @Test
    void deveImpedirPlacaVazia() {
        try {
            Vaga vaga = new VagaSemanal(2, 1);
            vaga.setPlaca("   ");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Placa inválida!", e.getMessage());
        }
    }

    @Test
    void deveInserirPeriodoValidoLimite() {
        Vaga vaga = new VagaMensal(3, 1);
        assertEquals(1, vaga.getPeriodo());
    }

    @Test
    void deveImpedirPeriodoInvalido() {
        try {
            Vaga vaga = new VagaMensal(3, 0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Período inválido!", e.getMessage());
        }
    }

    @Test
    void deveInserirERecuperarCliente() {
        Cliente cliente = new Cliente();
        Vaga vaga = new VagaDiaria(1, 1);
        vaga.setCliente(cliente);
        assertEquals(cliente, vaga.getCliente());
    }
}
