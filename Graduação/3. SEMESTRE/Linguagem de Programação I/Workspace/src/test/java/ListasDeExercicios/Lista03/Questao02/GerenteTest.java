package ListasDeExercicios.Lista03.Questao02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GerenteTest {
    Gerente gerente;

    @Test
    public void deveInserirBonusFixo() {
        gerente = new Gerente(1000.05f, 0.01f);
        assertEquals(0.01f, gerente.getBonusFixo());
    }

    @Test
    public void deveCalcularPagamento() {
        gerente = new Gerente(1000.05f, 100.2f);
        assertEquals(1100.25f, gerente.calcularPagamento());
    }

    @Test
    public void deveImpedirBonusFixoInvalido() {
        try {
            gerente = new Gerente(1000.05f, 0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Bônus fixo inválido!", e.getMessage());
        }
    }
}