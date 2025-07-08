package ListasDeExercicios.Lista04.Questao02;

import ListasDeExercicios.Lista04.Questao04.FreteNormal;
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
        cliente.setNome("  Maria Souza  ");
        assertEquals("Maria Souza", cliente.getNome());
    }

    @Test
    void deveImpedirNomeInvalido() {
        try {
            Cliente cliente = new Cliente();
            cliente.setNome(" ");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Não é permitido nome vazio!", e.getMessage());
        }
    }

    @Test
    void deveInserirListaContas() {
        Cliente cliente = new Cliente();
        ArrayList<ContaBancaria> contas = new ArrayList<>();
        cliente.setContaBancarias(contas);
        assertEquals(contas, cliente.getContaBancarias());
    }

    @Test
    void deveImpedirListaNulaContas() {
        try {
            Cliente cliente = new Cliente();
            cliente.setContaBancarias(null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Lista de contas bancárias inválida!", e.getMessage());
        }
    }

    @Test
    void deveAdicionarContaBancaria() {
        Cliente cliente = new Cliente();
        ContaBancaria conta = new ContaPoupanca(cliente, 101);
        cliente.adicionarContaBancaria(conta);
        assertEquals(1, cliente.getNumeroContasBancarias());
        assertTrue(cliente.verificarContaBancaria(conta));
    }

    @Test
    void deveImpedirContaBancariaNula() {
        try {
            Cliente cliente = new Cliente();
            cliente.adicionarContaBancaria(null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Conta bancária inválida!", e.getMessage());
        }
    }

    @Test
    void deveImpedirContaBancariaDuplicada() {
        try {
            Cliente cliente = new Cliente();
            ContaBancaria conta = new ContaPoupanca(cliente, 202);
            cliente.adicionarContaBancaria(conta);
            cliente.adicionarContaBancaria(conta);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Conta bancária inválida!", e.getMessage());
        }
    }

    @Test
    void deveImpedirContaBancariaNumeroIgual() {
        try {
            Cliente cliente = new Cliente();
            ContaBancaria conta1 = new ContaPoupanca(cliente, 202);
            ContaBancaria conta2 = new ContaPoupanca(cliente, 202);
            cliente.adicionarContaBancaria(conta1);
            cliente.adicionarContaBancaria(conta2);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Conta bancária inválida!", e.getMessage());
        }
    }

    @Test
    void deveImpedirContaBancaria() {
        try {
            Cliente cliente = new Cliente();
            ContaBancaria conta = new ContaPoupanca(cliente, 202);
            cliente.adicionarContaBancaria(conta);
            cliente.adicionarContaBancaria(conta);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Conta bancária inválida!", e.getMessage());
        }
    }

    @Test
    void deveRemoverContaBancaria() {
        Cliente cliente = new Cliente();
        ContaBancaria conta = new ContaPoupanca(cliente, 303);
        cliente.adicionarContaBancaria(conta);
        cliente.removerContaBancaria(conta);
        assertFalse(cliente.verificarContaBancaria(conta));
    }

    @Test
    void deveImpedirRemocaoContaInexistente() {
        try {
            Cliente cliente = new Cliente();
            ContaBancaria conta = new ContaPoupanca(new Cliente(), 404);
            cliente.removerContaBancaria(conta);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Conta bancária não pertence ao cliente!", e.getMessage());
        }
    }

    @Test
    void deveConsultarNumerosContas() {
        Cliente cliente = new Cliente();
        ContaBancaria conta1 = new ContaPoupanca(cliente, 111);
        ContaBancaria conta2 = new ContaPoupanca(cliente, 222);
        cliente.adicionarContaBancaria(conta1);
        cliente.adicionarContaBancaria(conta2);

        ArrayList<Integer> numeros = cliente.consultarContasBancarias();
        assertTrue(numeros.contains(111));
        assertTrue(numeros.contains(222));
    }

    @Test
    void deveConsultarSaldosContas() {
        Cliente cliente = new Cliente();
        ContaBancaria conta1 = new ContaCorrenteEspecial(cliente, 333, 250.0f);
        conta1.depositar(100);

        ContaBancaria conta2 = new ContaPoupanca(cliente, 444);
        conta2.depositar(200);

        cliente.adicionarContaBancaria(conta1);
        cliente.adicionarContaBancaria(conta2);

        ArrayList<Float> saldos = cliente.consultarSaldosContasBancarias();
        assertEquals(350.0f, saldos.get(0));
        assertEquals(200.0f, saldos.get(1));
    }
}
