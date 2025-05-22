package ListasDeExercicios.Lista03.Questao02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionariosComumTest {
    FuncionariosComum funcionariosComum;

    @Test
    public void deveInserirSalairoMensal() {
        funcionariosComum = new FuncionariosComum(0.01f);
        assertEquals(0.01f, funcionariosComum.getSalarioMensal());
    }

    @Test
    public void deveCalcularPagamento() {
        funcionariosComum = new FuncionariosComum(1000.05f);
        assertEquals(1000.05f, funcionariosComum.calcularPagamento());
    }

    @Test
    public void deveImpedirSalarioMensalInvalido() {
        try {
            funcionariosComum =  new FuncionariosComum(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Salário mensal inválido!", e.getMessage());
        }
    }
}