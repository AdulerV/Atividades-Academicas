package ListasDeExercicios.Lista03.Questao06;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContaCorrenteTest {
    ContaCorrente contaCorrente;

    @Test
    public void deveInserirNumeroConta() {
        contaCorrente = new ContaCorrente(0, 100, "João da Silva");
        assertEquals(0, contaCorrente.getNumeroConta());
    }

    @Test
    public void deveInserirSaldo() {
        contaCorrente = new ContaCorrente(123, 0.01f, "João da Silva");
        assertEquals(0.01f, contaCorrente.getSaldo());
    }

    @Test
    public void deveInserirTitular() {
        contaCorrente = new ContaCorrente(123, 100, "João da Silva");
        assertEquals("João da Silva", contaCorrente.getTitular());
    }

    @Test
    public void deveRetirarEspacosExtremidadesTitular() {
        contaCorrente = new ContaCorrente(123, 100, " Maria Silva ");
        assertEquals("Maria Silva", contaCorrente.getTitular());
    }

    @Test
    public void deveDepositarValorMinimo() {
        contaCorrente = new ContaCorrente(123, 100, "João da Silva");
        contaCorrente.depositar(0.76f);
        assertEquals(100.01f, contaCorrente.getSaldo(), 0.01);
    }

    @Test
    public void deveSacarValorMaximo() {
        contaCorrente = new ContaCorrente(123, 100, "João da Silva");
        contaCorrente.sacar(100);
        assertEquals(0f, contaCorrente.getSaldo(), 0.01);
    }

    @Test
    public void deveSacarValorMinimo() {
        contaCorrente = new ContaCorrente(123, 100, "João da Silva");
        contaCorrente.sacar(0.01f);
        assertEquals(99.99f, contaCorrente.getSaldo(), 0.01);
    }

    @Test
    public void deveAplicarTaxaManutencaoMensal() {
        contaCorrente = new ContaCorrente(123, 100, "João da Silva");
        contaCorrente.calcularJuros();
        assertEquals(90.55f, contaCorrente.getSaldo(), 0.01);
    }

    @Test
    public void deveImpedirNumeroContaNegativo() {
        try {
            contaCorrente = new ContaCorrente(-1, 100, "João da Silva");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Número de conta inválido!", e.getMessage());
        }
    }

    @Test
    public void deveImpedirSaldoNegativo() {
        try {
            contaCorrente = new ContaCorrente(123, -0.01f, "João da Silva");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Saldo da conta inválido!", e.getMessage());
        }
    }

    @Test
    public void deveImpedirTitularVazio() {
        try {
            contaCorrente = new ContaCorrente(123, 100, " ");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome vazio não é permitido!", e.getMessage());
        }
    }

    @Test
    public void deveImpedirDepositoInvalido() {
        contaCorrente = new ContaCorrente(123, 100, "João da Silva");
        try {
            contaCorrente.depositar(0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor de depósito inválido!", e.getMessage());
        }
    }

    @Test
    public void deveImpedirDepositoSaldoNegativado() {
        contaCorrente = new ContaCorrente(123, 0, "João da Silva");
        try {
            contaCorrente.depositar(0.74f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor de depósito inválido!", e.getMessage());
        }
    }

    @Test
    public void deveImpedirSaqueMaiorSaldo() {
        contaCorrente = new ContaCorrente(123, 100, "João da Silva");
        try {
            contaCorrente.sacar(100.01f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor de saque maior que saldo atual!", e.getMessage());
        }
    }

    @Test
    public void deveImpedirSaqueInvalido() {
        contaCorrente = new ContaCorrente(123, 100, "João da Silva");
        try {
            contaCorrente.sacar(0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor de saque inválido!", e.getMessage());
        }
    }
}
