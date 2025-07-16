package ListasDeExercicios.Lista04.Questao07;

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
    void deveInserirListaFitas() {
        Cliente cliente = new Cliente();
        ArrayList<FitaEmprestada> fitas = new ArrayList<>();
        cliente.setFitas(fitas);
        assertEquals(fitas, cliente.getFitas());
    }

    @Test
    void deveImpedirListaFitasInvalida() {
        try {
            Cliente cliente = new Cliente();
            cliente.setFitas(null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Lista de fitas inválida!", e.getMessage());
        }
    }

    @Test
    void deveAdicionarFita() {
        Cliente cliente = new Cliente();
        FitaEmprestada fita = new FitaEspecial(cliente, "01/01/2024", 2, 5.0f);
        cliente.adicionarFitaEmprestada(fita);
        assertEquals(1, cliente.getNumeroFitasEmprestadas());
    }

    @Test
    void deveImpedirFitaNula() {
        try {
            Cliente cliente = new Cliente();
            cliente.adicionarFitaEmprestada(null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Fita inválida!", e.getMessage());
        }
    }

    @Test
    void deveImpedirFitaDuplicada() {
        try {
            Cliente cliente = new Cliente();
            FitaEmprestada fita = new FitaEspecial(cliente, "01/01/2024", 2, 5.0f);
            cliente.adicionarFitaEmprestada(fita);
            cliente.adicionarFitaEmprestada(fita);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Fita inválida!", e.getMessage());
        }
    }

    @Test
    void deveRemoverFita() {
        Cliente cliente = new Cliente();
        FitaEmprestada fita = new FitaEspecial(cliente, "01/01/2024", 2, 5.0f);
        cliente.adicionarFitaEmprestada(fita);
        cliente.removerFitaEmprestada(fita);
        assertFalse(cliente.verificarFitaEmprestada(fita));
    }

    @Test
    void deveImpedirRemoverFitaInexistente() {
        try {
            Cliente cliente = new Cliente();
            FitaEmprestada fita = new FitaEspecial(cliente, "01/01/2024", 2, 5.0f);
            cliente.removerFitaEmprestada(fita);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Fita não pertence ao cliente!", e.getMessage());
        }
    }

    @Test
    void deveCalcularValorTotalEmprestimos() {
        Cliente cliente = new Cliente();

        FitaEmprestada fita1 = new FitaEspecial(cliente, "01/01/2024", 2, 5.0f); // 10.0
        FitaEmprestada fita2 = new FitaEspecial(cliente, "01/01/2024", 3, 7.0f); // 21.0

        cliente.adicionarFitaEmprestada(fita1);
        cliente.adicionarFitaEmprestada(fita2);

        assertEquals(31.0f, cliente.calcularValorTotalEmprestimos());
    }
}
