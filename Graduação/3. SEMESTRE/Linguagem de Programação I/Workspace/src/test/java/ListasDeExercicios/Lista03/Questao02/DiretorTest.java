package ListasDeExercicios.Lista03.Questao02;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DiretorTest {
    Diretor diretor;

    @Test
    public void deveCalcularPagamento() {
        diretor = new Diretor(8000, 15.0f, 40000.00f);
        assertEquals(14000.00f, diretor.calcularPagamento());
    }

    @Test
    public void deveTestarCaminhoFeliz() {
        diretor = new Diretor(8000, 0.01f, 0.01f);
        assertEquals(8000, diretor.calcularPagamento());
    }

    @Test
    public void deveImpedirPercentualInvalido() {
        try {
            diretor = new Diretor(8000, 0f, 40000.00f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Percentual de participação nos lucros inválido!", e.getMessage());
        }
    }

    @Test
    public void deveImpedirLucroInvalido() {
        try {
            diretor = new Diretor(8000, 10.0f, 0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Lucro da empresa inválido!", e.getMessage());
        }
    }
}
