package ListasDeExercicios.Lista01.Questao03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaEnergiaTest {
    ContaEnergia conta;

    @BeforeEach
    public void setUp() {
        conta = new ContaEnergia();
    }

    @Test
    public void deveTestarNumeroQuilowattsNegativo() {
        try {
            conta.setNumeroQuilowatts(-1);
            fail();
        } catch (IllegalArgumentException exception) {
            assertEquals("Número de quilowatts consumidos inválido!", exception.getMessage());
        }
    }

    @Test
    public void deveCalcularValorPorQuilowatts() {
        conta.setNumeroQuilowatts(200);
        assertEquals(24, conta.calcularValorPorQuilowatt());
    }

    @Test
    public void deveCalcularValorTotal() {
        conta.setNumeroQuilowatts(200);
        assertEquals(28.32, conta.calcularValorTotal());
    }
}