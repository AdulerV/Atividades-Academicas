package ListasDeExercicios.ExerciciosSurpresa.Exercicio01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {
    Professor professor;

    @BeforeEach
    public void setUp() {
        professor = new Professor("Marco Antônio");
    }

    @Test
    public void deveInserirNome() {
        assertEquals("Marco Antônio", professor.getNome());
    }

    @Test
    public void deveInserirNomeTirandoEspacos() {
        professor.setNome("  Sandro Fernandes  ");
        assertEquals("Sandro Fernandes", professor.getNome());
    }

    @Test
    public void deveInserirTitulacao() {
        professor.setTitulacao("Doutorado");
        assertEquals("Doutorado", professor.getTitulacao());
    }

    @Test
    public void deveInserirTitulacaoTirandoEspacos() {
        professor.setTitulacao("  Mestrado  ");
        assertEquals("Mestrado", professor.getTitulacao());
    }

    @Test
    public void deveImpedirNomeVazio() {
        try {
            professor.setNome("");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Não é permitido nome vazio!", e.getMessage());
        }
    }

    @Test
    public void deveImpedirTitulacaoVazia() {
        try {
            professor.setTitulacao("");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Não é permitido titulação vazia!", e.getMessage());
        }
    }
}