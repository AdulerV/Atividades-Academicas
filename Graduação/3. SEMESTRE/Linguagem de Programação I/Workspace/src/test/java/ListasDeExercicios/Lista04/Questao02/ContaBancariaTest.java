package ListasDeExercicios.Lista04.Questao02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaBancariaTest {
    @Test
    void deveInserirNumero() {
        ContaBancaria conta = new ContaCorrenteNormal(1);
        conta.setNumero(0);
        assertEquals(0, conta.getNumero());
    }

    @Test
    void deveImpedirNumeroInvalido() {
        try {
            new ContaCorrenteNormal(-1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Número de conta inválido!", e.getMessage());
        }
    }

    @Test
    void deveInserirSaldo() {
        ContaBancaria conta = new ContaCorrenteNormal(1);
        conta.setSaldo(0.01f);
        assertEquals(0.01f, conta.getSaldo());
    }

    @Test
    void deveImpedirSaldoNegativo() {
        try {

            ContaBancaria conta = new ContaCorrenteNormal(1);
            conta.setSaldo(-0.01f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor de saldo inválido!", e.getMessage());
        }
    }

    @Test
    void deveDepositar() {
        Cliente cliente = new Cliente();
        ContaBancaria conta = new ContaCorrenteNormal(1);
        conta.setSaldo(100);
        conta.depositar(0.01f);
        assertEquals(100.01f, conta.getSaldo(), 0.001f);
    }

    @Test
    void deveImpedirDepositoInvalido() {
        try {
            ContaBancaria conta = new ContaCorrenteNormal(1);
            conta.depositar(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor de depósito inválido!", e.getMessage());
        }
    }

    @Test
    void deveSacar() {
        ContaBancaria conta = new ContaCorrenteNormal(1);
        conta.setSaldo(100);
        conta.sacar(99.99f);
        assertEquals(0.01f, conta.getSaldo(), 0.001f);
    }

    @Test
    void deveImpedirSaqueInvalido() {
        try {
            ContaBancaria conta = new ContaCorrenteNormal(1);
            conta.setSaldo(50);
            conta.sacar(50.01f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor de saque inválido!", e.getMessage());
        }
    }

    @Test
    void deveCalcularSaldo() {
        ContaBancaria conta = new ContaCorrenteNormal(1);
        conta.setSaldo(1000);
        assertEquals(1000.0f, conta.calcularSaldo());
    }
}
