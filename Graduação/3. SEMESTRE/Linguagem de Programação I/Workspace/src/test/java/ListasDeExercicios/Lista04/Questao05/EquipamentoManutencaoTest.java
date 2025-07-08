package ListasDeExercicios.Lista04.Questao05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EquipamentoManutencaoTest {

    @Test
    void deveInserirNumeroManutencao() {
        Cliente cliente = new Cliente();
        EquipamentoManutencao equipamento = new Monitor(cliente, 0);
        equipamento.setNumeroManutencao(0);
        assertEquals(0, equipamento.getNumeroManutencao());
    }

    @Test
    void deveImpedirNumeroManutencaoNegativo() {
        try {
            Cliente cliente = new Cliente();
            EquipamentoManutencao equipamento = new Monitor(cliente, 1);
            equipamento.setNumeroManutencao(-1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Número de manutenção inválido!", e.getMessage());
        }
    }

    @Test
    void deveInserirValorMaoObraLimite() {
        Cliente cliente = new Cliente();
        EquipamentoManutencao equipamento = new Monitor(cliente, 2);
        equipamento.setValorMaoObra(0.0f);
        assertEquals(0.0f, equipamento.getValorMaoObra());
    }

    @Test
    void deveImpedirValorMaoObraNegativo() {
        try {
            Cliente cliente = new Cliente();
            EquipamentoManutencao equipamento = new Monitor(cliente, 3);
            equipamento.setValorMaoObra(-0.01f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor da mão de obra inválido!", e.getMessage());
        }
    }

    @Test
    void deveRetornarCliente() {
        Cliente cliente = new Cliente();
        EquipamentoManutencao equipamento = new Monitor(cliente, 4);
        assertEquals(cliente, equipamento.getCliente());
    }
}
