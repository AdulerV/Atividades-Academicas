package ListasDeExercicios.Lista04.Questao02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaPoupancaTest {
    @Test
    public void deveCalcularJuros() {
        ContaBancaria conta = new ContaPoupanca(123);
        conta.setSaldo(100);
        conta.calcularJuros();
        assertEquals(110.0f, conta.getSaldo(), 0.01);
    }
}