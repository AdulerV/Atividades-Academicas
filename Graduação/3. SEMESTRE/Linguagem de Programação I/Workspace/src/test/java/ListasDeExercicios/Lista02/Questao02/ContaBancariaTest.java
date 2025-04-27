package ListasDeExercicios.Lista02.Questao02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaBancariaTest {
    ContaBancaria conta;

    @BeforeEach
    public void setUp() {
        conta = new ContaBancaria();
    }

    @Test
    public void deveTestarSaldoNegativo() {
        try {
            conta.setSaldo(-0.1f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Saldo inválido!", e.getMessage());
        }
    }

    @Test
    public void deveTestarNumeroContaNegativo() {
        try {
            conta.setNumeroConta(-1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Número da conta inválido!", e.getMessage());
        }
    }

    @Test
    public void deveTestarDepositoNegativo() {
        try {
            conta.depositar(-0.1f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor inválido!", e.getMessage());
        }
    }

    @Test
    public void deveTestarSaqueNegativo() {
        try {
            conta.sacar(-0.1f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor inválido!", e.getMessage());
        }
    }

    @Test
    public void deveTestarSaqueMaiorDoQueSaldo() {
        try {
            conta.setSaldo(1000.0f);
            conta.sacar(1000.1f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor inválido!", e.getMessage());
        }
    }

    @Test
    public void deveDepositar() {
        conta.setSaldo(1000.5f);
        conta.depositar(100.5f);
        assertEquals(1101, conta.getSaldo());
    }

    @Test
    public void deveSacar() {
        conta.setSaldo(1000.5f);
        conta.sacar(100.2f);
        assertEquals(900.3f, conta.getSaldo());
    }
}