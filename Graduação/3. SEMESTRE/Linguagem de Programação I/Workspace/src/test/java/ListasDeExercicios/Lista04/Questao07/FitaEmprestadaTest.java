package ListasDeExercicios.Lista04.Questao07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FitaEmprestadaTest {
    @Test
    void deveInserirNomeFilme() {
        FitaEmprestada fita = new FitaCatalogo("01/01/2024", 1);
        fita.setNomeFilme("  Matrix ");
        assertEquals("Matrix", fita.getNomeFilme());
    }

    @Test
    void deveImpedirNomeFilmeVazio() {
        try {
            FitaEmprestada fita = new FitaCatalogo("01/01/2024", 1);
            fita.setNomeFilme("   ");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Não é permitido nome do filme vazio!", e.getMessage());
        }
    }

    @Test
    void deveInserirDataValida() {
        FitaEmprestada fita = new FitaCatalogo(" 10/10/2023 ", 1);
        assertEquals("10/10/2023", fita.getData());
    }

    @Test
    void deveImpedirDataVazia() {
        try {
            FitaEmprestada fita = new FitaCatalogo("", 1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Não é permitido data vazia!", e.getMessage());
        }
    }

    @Test
    void deveInserirNumeroDiasLimite() {
        FitaEmprestada fita = new FitaCatalogo("01/01/2024", 1);
        assertEquals(1, fita.getNumeroDias());
    }

    @Test
    void deveImpedirNumeroDiasInvalido() {
        try {
            FitaEmprestada fita = new FitaCatalogo("01/01/2024", 0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Número de dias do empréstimo inválido!", e.getMessage());
        }
    }
}
