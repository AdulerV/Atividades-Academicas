package ListasDeExercicios.Lista01.Questao01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {
    Funcionario funcionario;

    @BeforeEach
    public void setUp() {
        funcionario = new Funcionario();
    }

    @Test
    public void deveTestarSalarioNegativo() {
        try {
            funcionario.setSalario(-0.1f);
            fail();
        } catch (IllegalArgumentException exception) {
            assertEquals("Salário inicial inválido!", exception.getMessage());
        }
    }

    @Test
    public void deveTestarPorcentagemNegativa() {
        try {
            funcionario.setPorcentagemAumento(-0.1f);
            fail();
        } catch (IllegalArgumentException exception) {
            assertEquals("Porcentagem de aumento inválida!", exception.getMessage());
        }
    }

    @Test
    public void deveCalcularAumento() {
        funcionario.setSalario(1000);
        funcionario.setPorcentagemAumento(50);
        assertEquals(500, funcionario.calcularAumentoSalarial());
    }

    @Test
    public void deveAumentarSalario() {
        funcionario.setSalario(1000);
        funcionario.setPorcentagemAumento(50);
        funcionario.calcularNovoSalario();
        assertEquals(1500, funcionario.getSalario());
    }
}