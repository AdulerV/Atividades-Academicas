package ListasDeExercicios.ExerciciosSurpresa.Exercicio01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {
    Professor professor;

    @BeforeEach
    public void setUp() {
        professor = new Professor();
    }

    @Test
    public void deveInserirNome() {
        professor.setNome("Marco Antônio");
        assertEquals("Marco Antônio", professor.getNome());
    }

    @Test
    public void deveInserirTitulacao() {
        professor.setNome("Doutorado");
        assertEquals("Doutorado", professor.getNome());
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
            assertEquals("Não é permitida titulação vazia!", e.getMessage());
        }
    }
}