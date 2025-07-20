package ListasDeExercicios.Lista04.Questao04;

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
    void deveImpedirCodigoNegativo() {
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
        cliente.setNome("  Joana ");
        assertEquals("Joana", cliente.getNome());
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
    void deveDefinirListaFretes() {
        Cliente cliente = new Cliente();
        ArrayList<Frete> listaFretes = new ArrayList<>();
        cliente.setFretes(listaFretes);
        assertEquals(listaFretes, cliente.getFretes());
    }

    @Test
    void deveImpedirListaFretesNula() {
        try {
            Cliente cliente = new Cliente();
            cliente.setFretes(null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Lista de fretes inválida!", e.getMessage());
        }
    }

    @Test
    void deveAdicionarFrete() {
        Cliente cliente = new Cliente();
        FreteNormal frete1 = new FreteNormal(1);
        cliente.adicionarFrete(frete1);
        assertTrue(cliente.verificarFrete(frete1));
        assertEquals(1, cliente.obterQuantidadeFretes());
    }

    @Test
    void deveImpedirAdicionarFreteNulo() {
        try {
            Cliente cliente = new Cliente();
            cliente.adicionarFrete(null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Frete inválido!", e.getMessage());
        }
    }

    @Test
    void deveImpedirFreteDuplicado() {
        try {
            Cliente cliente = new Cliente();
            FreteNormal frete1 = new FreteNormal(2);
            cliente.adicionarFrete(frete1);
            cliente.adicionarFrete(frete1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Frete inválido!", e.getMessage());
        }
    }

    @Test
    void deveImpedirFreteNumeroIgual() {
        try {
            Cliente cliente = new Cliente();
            FreteNormal frete1 = new FreteNormal(2);
            FreteNormal frete2 = new FreteNormal(2);
            cliente.adicionarFrete(frete1);
            cliente.adicionarFrete(frete2);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Frete inválido!", e.getMessage());
        }
    }

    @Test
    void deveRemoverFreteExistente() {
        Cliente cliente = new Cliente();
        FreteNormal frete1 = new FreteNormal(3);
        cliente.adicionarFrete(frete1);
        cliente.removerFrete(frete1);
        assertFalse(cliente.verificarFrete(frete1));
    }

    @Test
    void deveImpedirRemoverFreteInexistente() {
        try {
            Cliente cliente = new Cliente();
            FreteNormal frete1 = new FreteNormal(4);
            cliente.removerFrete(frete1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Frete não pertence ao cliente!", e.getMessage());
        }
    }

    @Test
    void deveConsultarFretes() {
        Cliente cliente = new Cliente();
        FreteNormal frete1 = new FreteNormal(11);
        FreteNormal frete2 = new FreteNormal(12);
        cliente.adicionarFrete(frete1);
        cliente.adicionarFrete(frete2);
        ArrayList<Integer> numeros = cliente.consultarFretes();
        assertEquals(2, numeros.size());
        assertTrue(numeros.contains(11));
        assertTrue(numeros.contains(12));
    }

    @Test
    void deveConsultarValoresFretes() {
        Cliente cliente = new Cliente();
        FreteNormal frete1 = new FreteNormal(21);
        FreteNormal frete2 = new FreteNormal(22);
        cliente.adicionarFrete(frete1);
        cliente.adicionarFrete(frete2);
        ArrayList<Float> valores = cliente.consultarValoresFretes();
        assertEquals(2, valores.size());
        assertEquals(frete1.calcularValor(), valores.get(0));
        assertEquals(frete2.calcularValor(), valores.get(1));
    }
}