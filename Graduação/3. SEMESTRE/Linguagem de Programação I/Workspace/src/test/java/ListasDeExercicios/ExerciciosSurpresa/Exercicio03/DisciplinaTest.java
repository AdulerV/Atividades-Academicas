package ListasDeExercicios.ExerciciosSurpresa.Exercicio03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DisciplinaTest {
    @Test
    public void deveInserirNome() {
        Disciplina disciplina = new Disciplina();
        disciplina.setNome("   Estrutura de Dados   ");
        assertEquals("Estrutura de Dados", disciplina.getNome());
    }

    @Test
    public void deveImpedirNomeInvalido() {
        try {
            Disciplina disciplina = new Disciplina();
            disciplina.setNome(" ");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome da disciplina inválido!", e.getMessage());
        }
    }
}