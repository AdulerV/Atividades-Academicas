package ListasDeExercicios.Lista04.Questao08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoParcialTest {
    @Test
    void deveCalcularMensalidade() {
        AlunoParcial alunoParcial = new AlunoParcial(new Curso(), 1);
        alunoParcial.setNumeroParcelas(10);
        alunoParcial.setValorMensalidade(50.0f);
        alunoParcial.setDesconto(10);
        assertEquals(450.0f, alunoParcial.calcularMensalidade());
    }

    @Test
    void deveArmazenarDesconto() {
        AlunoParcial alunoParcial = new AlunoParcial(new Curso(), 1);
        alunoParcial.setDesconto(40);
        assertEquals(0.4f, alunoParcial.getDesconto());
    }

    @Test
    void deveImpedirDescontoInvalido() {
        try {
            AlunoParcial alunoParcial = new AlunoParcial(new Curso(), 1);
            alunoParcial.setDesconto(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Desconto inválido!", e.getMessage());
        }
    }
}