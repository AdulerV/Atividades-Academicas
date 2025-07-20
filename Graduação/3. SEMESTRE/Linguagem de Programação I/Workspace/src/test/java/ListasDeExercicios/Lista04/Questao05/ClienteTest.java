package ListasDeExercicios.Lista04.Questao05;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
    @Test
    void deveInserirCodigo() {
        Cliente cliente = new Cliente();
        cliente.setCodigo(1);
        assertEquals(1, cliente.getCodigo());
    }

    @Test
    void deveImpedirCodigoInvalido() {
        try {
            Cliente cliente = new Cliente();
            cliente.setCodigo(-1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Código inválido!", e.getMessage());
        }
    }

    @Test
    void deveInserirNome() {
        Cliente cliente = new Cliente();
        cliente.setNome("  Maria Joaquina  ");
        assertEquals("Maria Joaquina", cliente.getNome());
    }

    @Test
    void deveImpedirNomeInvalido() {
        try {
            Cliente cliente = new Cliente();
            cliente.setNome("   ");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Não é permitido nome vazio!", e.getMessage());
        }
    }

    @Test
    void deveInserirListaEquipamentos() {
        Cliente cliente = new Cliente();
        ArrayList<EquipamentoMantido> equipamentos = new ArrayList<>();
        cliente.setEquipamentos(equipamentos);
        assertEquals(equipamentos, cliente.getEquipamentos());
    }

    @Test
    void deveImpedirListaEquipamentosInvalida() {
        try {
            Cliente cliente = new Cliente();
            cliente.setEquipamentos(null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Lista de equipamentos inválida!", e.getMessage());
        }
    }

    @Test
    void deveAdicionarEquipamento() {
        Cliente cliente = new Cliente();
        EquipamentoMantido equipamento1 = new Monitor(1);
        cliente.adicionarEquipamento(equipamento1);
        assertTrue(cliente.verificarEquipamentoEmManutencao(equipamento1));
        assertEquals(1, cliente.obterQuantidadeEquipamentos());
    }

    @Test
    void deveImpedirEquipamentoNulo() {
        try {
            Cliente cliente = new Cliente();
                cliente.adicionarEquipamento(null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Equipamento inválido!", e.getMessage());
        }
    }

    @Test
    void deveImpedirEquipamentoDuplicado() {
        try {
            Cliente cliente = new Cliente();
            EquipamentoMantido equipamento1 = new Monitor(2);
            cliente.adicionarEquipamento(equipamento1);
            cliente.adicionarEquipamento(equipamento1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Equipamento inválido!", e.getMessage());
        }
    }

    @Test
    void deveImpedirEquipamentoNumeroIgual() {
        try {
            Cliente cliente = new Cliente();
            EquipamentoMantido equipamento1 = new Monitor(3);
            EquipamentoMantido equipamento2 = new Monitor(3);
            cliente.adicionarEquipamento(equipamento1);
            cliente.adicionarEquipamento(equipamento2);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Equipamento inválido!", e.getMessage());
        }
    }

    @Test
    void deveRemoverEquipamento() {
        Cliente cliente = new Cliente();
        EquipamentoMantido equipamento1 = new Monitor(4);
        cliente.adicionarEquipamento(equipamento1);
        cliente.removerEquipamento(equipamento1);
        assertFalse(cliente.verificarEquipamentoEmManutencao(equipamento1));
    }

    @Test
    void deveImpedirRemoverEquipamentoInexistente() {
        try {
            Cliente cliente = new Cliente();
            EquipamentoMantido equipamento1 = new Monitor(5);
            cliente.removerEquipamento(equipamento1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Equipamento não pertence ao cliente!", e.getMessage());
        }
    }

    @Test
    void deveConsultarEquipamentos() {
        Cliente cliente = new Cliente();
        EquipamentoMantido equipamento1 = new Monitor(6);
        EquipamentoMantido equipamento2 = new Monitor(7);
        cliente.adicionarEquipamento(equipamento1);
        cliente.adicionarEquipamento(equipamento2);
        ArrayList<Integer> numeros = cliente.consultarEquipamentosEmManutencao();
        assertEquals(2, numeros.size());
        assertTrue(numeros.contains(6));
        assertTrue(numeros.contains(7));
    }

    @Test
    void deveConsultarValoresManutencao() {
        Cliente cliente = new Cliente();

        Monitor equipamento1 = new Monitor(8);
        equipamento1.setValorMaoObra(100.0f);

        CPU equipamento2 = new CPU(9);
        equipamento2.setValorMaoObra(200.0f);
        equipamento2.setValorTotalPecasTrocadas(100.0f);

        Impressora equipamento3 = new Impressora(10);
        equipamento3.setValorMaoObra(250.0f);
        equipamento3.setValorTotalPecasTrocadas(120.0f);

        cliente.adicionarEquipamento(equipamento1);
        cliente.adicionarEquipamento(equipamento2);
        cliente.adicionarEquipamento(equipamento3);

        ArrayList<Float> valores = cliente.consultarValoresManutencao();
        assertEquals(3, valores.size());
        assertEquals(equipamento1.calcularValorManutencao(), valores.get(0));
        assertEquals(equipamento2.calcularValorManutencao(), valores.get(1));
        assertEquals(equipamento3.calcularValorManutencao(), valores.get(2));
    }
}
