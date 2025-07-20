package ListasDeExercicios.Lista04.Questao08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoIntegralTest {
    @Test
    void deveCalcularMensalidade() {
        AlunoIntegral alunoIntegral = new AlunoIntegral(new Curso(), 1);
        alunoIntegral.setNumeroParcelas(10);
        assertEquals(10, alunoIntegral.calcularMensalidade());
    }
}