package ListasDeExercicios.ExerciciosSurpresa.Exercicio03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {
    @Test
    public void deveListarNomesProfessoresTurmasCurso() {
        Professor professor1 = new Professor();
        professor1.setNome("Marco Antônio");

        Professor professor2 = new Professor();
        professor2.setNome("Hilton Martins");

        Professor professor3 = new Professor();
        professor3.setNome("Sandro Fernandes");

        Turma turma1 = new Turma();
        turma1.setProfessor(professor1);

        Turma turma2 = new Turma();
        turma2.setProfessor(professor2);

        Turma turma3 = new Turma();
        turma3.setProfessor(professor3);

        Curso curso = new Curso();
        curso.adicionarTurma(turma1);
        curso.adicionarTurma(turma2);
        curso.adicionarTurma(turma3);

        ArrayList<String> resultado = new ArrayList<String>();
        resultado.add("Marco Antônio");
        resultado.add("Hilton Martins");
        resultado.add("Sandro Fernandes");

        assertEquals(resultado, curso.listarNomesProfessoresTurmas());
    }

    @Test
    public void deveListarNomesAlunosTurmasCurso() {
        Turma turma1 = new Turma();

        Aluno aluno1 = new Aluno();
        aluno1.setNome("João Pedro");
        turma1.adicionarAluno(aluno1);

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Arthur de Oliveira");
        turma1.adicionarAluno(aluno2);

        Aluno aluno3 = new Aluno();
        aluno3.setNome("Lucas Souza");
        turma1.adicionarAluno(aluno3);

        Turma turma2 = new Turma();

        Aluno aluno4 = new Aluno();
        aluno4.setNome("Luan Pereira");
        turma2.adicionarAluno(aluno4);

        Aluno aluno5 = new Aluno();
        aluno5.setNome("Nadine de Carvalho");
        turma2.adicionarAluno(aluno5);

        Aluno aluno6 = new Aluno();
        aluno6.setNome("Pedro Faria");
        turma2.adicionarAluno(aluno6);

        Curso curso = new Curso();
        curso.adicionarTurma(turma1);
        curso.adicionarTurma(turma2);

        ArrayList<ArrayList<String>> resultado = new ArrayList<ArrayList<String>>();

        ArrayList<String> listaTurma1 = new ArrayList<String>();
        listaTurma1.add("João Pedro");
        listaTurma1.add("Arthur de Oliveira");
        listaTurma1.add("Lucas Souza");

        ArrayList<String> listaTurma2 = new ArrayList<String>();
        listaTurma2.add("Luan Pereira");
        listaTurma2.add("Nadine de Carvalho");
        listaTurma2.add("Pedro Faria");

        resultado.add(listaTurma1);
        resultado.add(listaTurma2);

        assertEquals(resultado, curso.listarNomesAlunosTurmas());
    }

    @Test
    public void deveListarNomesAlunosCurso() {
        Curso curso = new Curso();

        Aluno aluno1 = new Aluno();
        aluno1.setNome("João Pedro");
        curso.adicionarAluno(aluno1);

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Arthur de Oliveira");
        curso.adicionarAluno(aluno2);

        Aluno aluno3 = new Aluno();
        aluno3.setNome("Lucas Souza");
        curso.adicionarAluno(aluno3);

        ArrayList<String> resultado = new ArrayList<String>();
        resultado.add("João Pedro");
        resultado.add("Arthur de Oliveira");
        resultado.add("Lucas Souza");

        assertEquals(resultado, curso.listarNomesAlunosCurso());
    }

    @Test
    public void deveListarNomesDisciplinasTurmasCurso() {
        Disciplina disciplina1 = new Disciplina();
        disciplina1.setNome("Cálculo 1");

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setNome("Linguagem de Programação 1");

        Disciplina disciplina3 = new Disciplina();
        disciplina3.setNome("Estrutura de Dados");

        Turma turma1 = new Turma();
        turma1.setDisciplina(disciplina1);

        Turma turma2 = new Turma();
        turma2.setDisciplina(disciplina2);

        Turma turma3 = new Turma();
        turma3.setDisciplina(disciplina3);

        Curso curso = new Curso();
        curso.adicionarTurma(turma1);
        curso.adicionarTurma(turma2);
        curso.adicionarTurma(turma3);

        ArrayList<String> resultado = new ArrayList<String>();
        resultado.add("Cálculo 1");
        resultado.add("Linguagem de Programação 1");
        resultado.add("Estrutura de Dados");

        assertEquals(resultado, curso.listarNomesDisciplinasTurmas());
    }

    @Test
    public void deveVerificarAlunoPresenteCurso() {
        Curso curso = new Curso();
        Aluno aluno = new Aluno();
        curso.adicionarAluno(aluno);
        assertTrue(curso.verificarAluno(aluno));
    }

    @Test
    public void deveVerificarAlunoAusenteCurso() {
        Curso curso = new Curso();
        Aluno aluno = new Aluno();
        assertFalse(curso.verificarAluno(aluno));
    }

    @Test
    public void deveVerificarTurmaPresenteCurso() {
        Curso curso = new Curso();
        Turma turma = new Turma();
        curso.adicionarTurma(turma);
        assertTrue(curso.verificarTurma(turma));
    }

    @Test
    public void deveVerificarTurmaAusenteCurso() {
        Curso curso = new Curso();
        Turma turma = new Turma();
        assertFalse(curso.verificarTurma(turma));
    }

    @Test
    public void deveRemoverTurmaCurso() {
        Curso curso = new Curso();

        Turma turma1 = new Turma();
        curso.adicionarTurma(turma1);

        Turma turma2 = new Turma();
        curso.adicionarTurma(turma2);

        curso.removerTurma(turma1);
        assertFalse(curso.verificarTurma(turma1));
        assertTrue(curso.verificarTurma(turma2));
    }

    @Test
    public void deveRemoverAlunoCurso() {
        Curso curso = new Curso();

        Aluno aluno1 = new Aluno();
        curso.adicionarAluno(aluno1);

        Aluno aluno2 = new Aluno();
        curso.adicionarAluno(aluno2);

        curso.removerAluno(aluno1);
        assertFalse(curso.verificarAluno(aluno1));
        assertTrue(curso.verificarAluno(aluno2));
    }

    @Test
    public void deveImpedirTurmaInvalida() {
        try {
            Curso curso = new Curso();
            curso.adicionarTurma(null);
        } catch (IllegalArgumentException e) {
            assertEquals("Turma inválida!", e.getMessage());
        }
    }

    @Test
    public void deveImpedirTurmaDuplicada() {
        try {
            Curso curso = new Curso();
            Turma turma = new Turma();
            curso.adicionarTurma(turma);
            curso.adicionarTurma(turma);
        } catch (IllegalArgumentException e) {
            assertEquals("Turma já cadastrada!", e.getMessage());
        }
    }

    @Test
    public void deveImpedirRemocaoTurmaAusenteCurso() {
        try {
            Curso curso = new Curso();
            Turma turma = new Turma();
            curso.removerTurma(turma);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Turma não cadastrada no curso!", e.getMessage());
        }
    }

    @Test
    public void deveImpedirAlunoInvalido() {
        try {
            Curso curso = new Curso();
            curso.adicionarAluno(null);
        } catch (IllegalArgumentException e) {
            assertEquals("Aluno inválido!", e.getMessage());
        }
    }

    @Test
    public void deveImpedirAlunoDuplicado() {
        try {
            Curso curso = new Curso();
            Aluno aluno = new Aluno();
            curso.adicionarAluno(aluno);
            curso.adicionarAluno(aluno);
        } catch (IllegalArgumentException e) {
            assertEquals("Aluno já cadastrado!", e.getMessage());
        }
    }

    @Test
    public void deveImpedirRemocaoAlunoAusenteCurso() {
        try {
            Curso curso = new Curso();
            Aluno aluno = new Aluno();
            curso.removerAluno(aluno);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Aluno não cadastrado no curso!", e.getMessage());
        }
    }
}