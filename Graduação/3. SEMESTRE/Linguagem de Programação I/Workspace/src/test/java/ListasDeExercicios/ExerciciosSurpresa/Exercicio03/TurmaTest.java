package ListasDeExercicios.ExerciciosSurpresa.Exercicio03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TurmaTest {
    @Test
    public void deveInserirNomeProfessorTurma() {
        Professor professor = new Professor();
        professor.setNome("Marco Antônio");
        Turma turma = new Turma();
        turma.setProfessor(professor);
        assertEquals("Marco Antônio", turma.getNomeProfessor());
    }

    @Test
    public void deveListarNomesAlunosTurma() {
        Turma turma = new Turma();

        Aluno aluno1 = new Aluno();
        aluno1.setNome("João Pedro");
        turma.adicionarAluno(aluno1);

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Arthur de Oliveira");
        turma.adicionarAluno(aluno2);

        Aluno aluno3 = new Aluno();
        aluno3.setNome("Lucas Souza");
        turma.adicionarAluno(aluno3);

        ArrayList<String> resultado = new ArrayList<String>();
        resultado.add("João Pedro");
        resultado.add("Arthur de Oliveira");
        resultado.add("Lucas Souza");

        assertEquals(resultado, turma.listarNomesAlunos());
    }

    @Test
    public void deveVerificarAlunoPresenteTurma() {
        Turma turma = new Turma();
        Aluno aluno = new Aluno();
        turma.adicionarAluno(aluno);
        assertTrue(turma.verificarAluno(aluno));
    }

    @Test
    public void deveVerificarAlunoAusenteTurma() {
        Turma turma = new Turma();
        Aluno aluno = new Aluno();
        assertFalse(turma.verificarAluno(aluno));
    }

    @Test
    public void deveRemoverAlunoTurma() {
        Turma turma = new Turma();

        Aluno aluno1 = new Aluno();
        turma.adicionarAluno(aluno1);

        Aluno aluno2 = new Aluno();
        turma.adicionarAluno(aluno2);

        turma.removerAluno(aluno1);
        assertFalse(turma.verificarAluno(aluno1));
        assertTrue(turma.verificarAluno(aluno2));
    }

    @Test
    public void deveImpedirAlunoInvalido() {
        try {
            Turma turma = new Turma();
            turma.adicionarAluno(null);
        } catch (IllegalArgumentException e) {
            assertEquals("Aluno inválido!", e.getMessage());
        }
    }

    @Test
    public void deveImpedirAlunoDuplicado() {
        try {
            Turma turma = new Turma();
            Aluno aluno = new Aluno();
            turma.adicionarAluno(aluno);
            turma.adicionarAluno(aluno);
        } catch (IllegalArgumentException e) {
            assertEquals("Aluno já cadastrado!", e.getMessage());
        }
    }

    @Test
    public void deveImpedirRemocaoAlunoAusenteTurma() {
        try {
            Turma turma = new Turma();
            Aluno aluno = new Aluno();
            turma.removerAluno(aluno);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Aluno não cadastrado na turma!", e.getMessage());
        }
    }
}