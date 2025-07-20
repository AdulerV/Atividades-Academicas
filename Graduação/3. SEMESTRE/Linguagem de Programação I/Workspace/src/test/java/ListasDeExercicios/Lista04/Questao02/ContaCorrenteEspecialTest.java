package ListasDeExercicios.Lista04.Questao02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaCorrenteEspecialTest {
    @Test
    void deveInserirLimiteCredito() {
        ContaCorrenteEspecial conta = new ContaCorrenteEspecial(1, 1);
        assertEquals(1, conta.getLimiteCredito());
    }

    @Test
    void deveImpedirLimiteCreditoInvalido() {
        try {
            ContaCorrenteEspecial conta = new ContaCorrenteEspecial(1, 0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Limite de crédito inválido!", e.getMessage());
        }
    }

    @Test
    void deveCalcularSaldo() {
        ContaBancaria conta = new ContaCorrenteEspecial(1, 2500);
        conta.setSaldo(1000);
        assertEquals(3500, conta.calcularSaldo());
    }
}