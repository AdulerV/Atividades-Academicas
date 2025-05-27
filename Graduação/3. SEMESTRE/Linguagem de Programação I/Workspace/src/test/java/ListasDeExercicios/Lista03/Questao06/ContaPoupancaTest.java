package ListasDeExercicios.Lista03.Questao06;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContaPoupancaTest {
    ContaPoupanca contaPoupanca;

    @Test
    public void deveDepositarValorMinimo() {
        contaPoupanca = new ContaPoupanca(123, 100, "João da Silva");
        contaPoupanca.depositar(0.01f);
        assertEquals(100.01f, contaPoupanca.getSaldo(), 0.01);
    }

    @Test
    public void deveSacarValorMaximo() {
        contaPoupanca = new ContaPoupanca(123, 100, "João da Silva");
        contaPoupanca.sacar(100);
        assertEquals(0.0f, contaPoupanca.getSaldo(), 0.01);
    }

    @Test
    public void deveSacarValorMinimo() {
        contaPoupanca = new ContaPoupanca(123, 100, "João da Silva");
        contaPoupanca.sacar(0.01f);
        assertEquals(99.99f, contaPoupanca.getSaldo(), 0.01);
    }

    @Test
    public void deveCalcularJuros() {
        contaPoupanca = new ContaPoupanca(123, 100, "João da Silva");
        contaPoupanca.calcularJuros();
        assertEquals(110.0f, contaPoupanca.getSaldo(), 0.01);
    }

    @Test
    public void deveImpedirDepositoInvalido() {
        try {
            contaPoupanca = new ContaPoupanca(123, 100, "João da Silva");
            contaPoupanca.depositar(0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor de déposito inválido!", e.getMessage());
        }
    }

    @Test
    public void deveImpedirSaqueMaiorSaldo() {
        try {
            contaPoupanca = new ContaPoupanca(123, 100, "João da Silva");
            contaPoupanca.sacar(100.01f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor de saque maior que o saldo atual!", e.getMessage());
        }
    }

    @Test
    public void deveImpedirSaqueInvalido() {
        try {
            contaPoupanca = new ContaPoupanca(123, 100, "João da Silva");
            contaPoupanca.sacar(0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor de saque inválido!", e.getMessage());
        }
    }
}
