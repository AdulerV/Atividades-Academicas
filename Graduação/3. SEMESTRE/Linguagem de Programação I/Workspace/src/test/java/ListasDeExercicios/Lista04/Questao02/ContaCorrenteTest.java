package ListasDeExercicios.Lista04.Questao02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaCorrenteTest {
    @Test
    public void deveAplicarTaxaManutencaoMensal() {
        ContaBancaria conta = new ContaCorrenteNormal(123);
        conta.setSaldo(100);
        conta.calcularJuros();
        assertEquals(90.55f, conta.getSaldo(), 0.01);
    }
}