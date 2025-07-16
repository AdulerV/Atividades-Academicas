package ListasDeExercicios.Lista04.Questao06;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
    @Test
    void deveInserirCodigoLimite() {
        Cliente cliente = new Cliente();
        cliente.setCodigo(0);
        assertEquals(0, cliente.getCodigo());
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
    void deveInserirNomeValido() {
        Cliente cliente = new Cliente();
        cliente.setNome("  Joana Silva  ");
        assertEquals("Joana Silva", cliente.getNome());
    }

    @Test
    void deveImpedirNomeVazio() {
        try {
            Cliente cliente = new Cliente();
            cliente.setNome("   ");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Não é permitido nome vazio!", e.getMessage());
        }
    }

    @Test
    void deveInserirListaVagas() {
        Cliente cliente = new Cliente();
        ArrayList<Vaga> lista = new ArrayList<>();
        cliente.setVagas(lista);
        assertEquals(lista, cliente.getVagas());
    }

    @Test
    void deveImpedirListaVagasNula() {
        try {
            Cliente cliente = new Cliente();
            cliente.setVagas(null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Lista de vagas inválida!", e.getMessage());
        }
    }

    @Test
    void deveAdicionarVaga() {
        Cliente cliente = new Cliente();
        Vaga vaga1 = new VagaDiaria(1, 1);
        cliente.adicionarVaga(vaga1);
        assertEquals(1, cliente.getNumeroVagas());
        assertTrue(cliente.verificarVaga(vaga1));
    }

    @Test
    void deveImpedirVagaNula() {
        try {
            Cliente cliente = new Cliente();
            cliente.adicionarVaga(null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Vaga inválida!", e.getMessage());
        }
    }

    @Test
    void deveImpedirVagaDuplicada() {
        try {
            Cliente cliente = new Cliente();
            Vaga vaga1 = new VagaDiaria(1, 1);
            vaga1.setCliente(cliente);
            cliente.adicionarVaga(vaga1);
            cliente.adicionarVaga(vaga1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Vaga inválida!", e.getMessage());
        }
    }

    @Test
    void deveImpedirNumeroVagaDuplicado() {
        try {
            Cliente cliente = new Cliente();
            Vaga vaga1 = new VagaDiaria(1, 1);
            Vaga vaga2 = new VagaSemanal(1, 1);
            cliente.adicionarVaga(vaga1);
            cliente.adicionarVaga(vaga2);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Vaga inválida!", e.getMessage());
        }
    }

    @Test
    void deveRemoverVaga() {
        Cliente cliente = new Cliente();
        Vaga vaga1 = new VagaDiaria(1, 1);
        cliente.adicionarVaga(vaga1);
        cliente.removerVaga(vaga1);
        assertFalse(cliente.verificarVaga(vaga1));
    }

    @Test
    void deveImpedirRemocaoVagaInexistente() {
        try {
            Cliente cliente = new Cliente();
            Vaga vaga1 = new VagaDiaria(1, 1);
            cliente.removerVaga(vaga1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Vaga não pertence ao cliente!", e.getMessage());
        }
    }

    @Test
    void deveConsultarNumerosDasVagas() {
        Cliente cliente = new Cliente();
        Vaga vaga1 = new VagaDiaria(1, 1);
        Vaga vaga2 = new VagaSemanal(2, 1);
        cliente.adicionarVaga(vaga1);
        cliente.adicionarVaga(vaga2);
        ArrayList<Integer> esperado = new ArrayList<>();
        esperado.add(1);
        esperado.add(2);
        assertEquals(esperado, cliente.consultarVagas());
    }

    @Test
    void deveConsultarValoresDasVagas() {
        Cliente cliente = new Cliente();

        VagaDiaria vaga1 = new VagaDiaria(1, 3);

        VagaSemanal vaga2 = new VagaSemanal(2, 2);

        cliente.adicionarVaga(vaga1);
        cliente.adicionarVaga(vaga2);

        ArrayList<Float> esperado = new ArrayList<>();
        esperado.add(30.0f);
        esperado.add(80.0f);

        assertEquals(esperado, cliente.consultarValoresVagas());
    }

    @Test
    void deveCalcularValorTotalVagas() {
        Cliente cliente = new Cliente();

        VagaDiaria vaga1 = new VagaDiaria(1, 3);
        vaga1.setCliente(cliente);

        VagaSemanal vaga2 = new VagaSemanal( 2, 2);
        vaga2.setCliente(cliente);

        VagaMensal vaga3 = new VagaMensal(3, 1);
        vaga3.setCliente(cliente);

        cliente.adicionarVaga(vaga1);
        cliente.adicionarVaga(vaga2);
        cliente.adicionarVaga(vaga3);

        assertEquals(260.0f, cliente.calcularValorTotalVagas());
    }
}
