package ListasDeExercicios.Lista04.Questao07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FitaEspecialTest {
    @Test
    void deveInserirValorAluguelValido() {
        FitaEspecial fita = new FitaEspecial(new Cliente(), "01/01/2024", 1, 1);
        assertEquals(1, fita.getValorAluguel());
    }

    @Test
    void deveImpedirValorAluguelInvalido() {
        try {
            FitaEspecial fita = new FitaEspecial(new Cliente(), "01/01/2024", 1, 0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor do aluguel inválido!", e.getMessage());
        }
    }

    @Test
    void deveCalcularValorEmprestimoCorreto() {
        FitaEspecial fita = new FitaEspecial(new Cliente(), "01/01/2024", 3, 5.0f);
        assertEquals(15.0f, fita.calcularValorEmprestimo());
    }

}