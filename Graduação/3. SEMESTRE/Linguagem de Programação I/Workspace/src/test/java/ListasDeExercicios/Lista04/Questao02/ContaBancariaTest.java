package ListasDeExercicios.Lista04.Questao02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaBancariaTest {

    @Test
    void deveInserirNumero() {
        Cliente cliente = new Cliente();
        ContaBancaria conta = new ContaCorrenteNormal(cliente, 1);
        conta.setNumero(0);
        assertEquals(0, conta.getNumero());
    }

    @Test
    void deveImpedirNumeroInvalido() {
        try {
            Cliente cliente = new Cliente();
            new ContaCorrenteNormal(cliente, -1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Número de conta inválido!", e.getMessage());
        }
    }

    @Test
    void deveInserirSaldo() {
        Cliente cliente = new Cliente();
        ContaBancaria conta = new ContaCorrenteNormal(cliente, 1);
        conta.setSaldo(0.01f);
        assertEquals(0.01f, conta.getSaldo());
    }

    @Test
    void deveImpedirSaldoNegativo() {
        try {
            Cliente cliente = new Cliente();
            ContaBancaria conta = new ContaCorrenteNormal(cliente, 1);
            conta.setSaldo(-0.01f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor de saldo inválido!", e.getMessage());
        }
    }

    @Test
    void deveInserirCliente() {
        Cliente cliente = new Cliente();
        ContaBancaria conta = new ContaCorrenteNormal(cliente, 1);
        assertEquals(cliente, conta.getCliente());
    }

    @Test
    void deveImpedirClienteNulo() {
        try {
            new ContaCorrenteNormal(null, 1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O cliente é obrigatório!", e.getMessage());
        }
    }

    @Test
    void deveDepositar() {
        Cliente cliente = new Cliente();
        ContaBancaria conta = new ContaCorrenteNormal(cliente, 1);
        conta.setSaldo(100);
        conta.depositar(0.01f);
        assertEquals(100.01f, conta.getSaldo(), 0.001f);
    }

    @Test
    void deveImpedirDepositoInvalido() {
        try {
            Cliente cliente = new Cliente();
            ContaBancaria conta = new ContaCorrenteNormal(cliente, 1);
            conta.depositar(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor de depósito inválido!", e.getMessage());
        }
    }

    @Test
    void deveSacar() {
        Cliente cliente = new Cliente();
        ContaBancaria conta = new ContaCorrenteNormal(cliente, 1);
        conta.setSaldo(100);
        conta.sacar(99.99f);
        assertEquals(0.01f, conta.getSaldo(), 0.001f);
    }

    @Test
    void deveImpedirSaqueInvalido() {
        try {
            Cliente cliente = new Cliente();
            ContaBancaria conta = new ContaCorrenteNormal(cliente, 1);
            conta.setSaldo(50);
            conta.sacar(50.01f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor de saque inválido!", e.getMessage());
        }
    }

    @Test
    void deveCalcularSaldo() {
        Cliente cliente = new Cliente();
        ContaBancaria conta = new ContaCorrenteNormal(cliente, 1);
        conta.setSaldo(1000);
        assertEquals(1000.0f, conta.calcularSaldo());
    }
}
