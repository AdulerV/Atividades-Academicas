package ListasDeExercicios.Lista04.Questao08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {
    @Test
    void deveInserirMatriculaValidaLimite() {
        Aluno aluno = new AlunoIntegral(new Curso(), 1);
        assertEquals(1, aluno.getMatricula());
    }

    @Test
    void deveImpedirMatriculaInvalida() {
        try {
            Aluno aluno = new AlunoIntegral(new Curso(), 0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Matrícula inválida!", e.getMessage());
        }
    }

    @Test
    void deveInserirNomeValido() {
        Aluno aluno = new AlunoIntegral(new Curso(), 1);
        aluno.setNome("  Maria Joaquina ");
        assertEquals("Maria Joaquina", aluno.getNome());
    }

    @Test
    void deveImpedirNomeVazio() {
        try {
            Aluno aluno = new AlunoIntegral(new Curso(), 1);
            aluno.setNome("   ");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Não é permitido nome vazio!", e.getMessage());
        }
    }

    @Test
    void deveInserirEnderecoValido() {
        Aluno aluno = new AlunoIntegral(new Curso(), 1);
        aluno.setEndereco("  Rua das Flores 123 ");
        assertEquals("Rua das Flores 123", aluno.getEndereco());
    }

    @Test
    void deveImpedirEnderecoVazio() {
        try {
            Aluno aluno = new AlunoIntegral(new Curso(), 1);
            aluno.setEndereco("   ");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Não é permitido endereço vazio!", e.getMessage());
        }
    }

    @Test
    void deveInserirCursoValido() {
        Curso curso = new Curso();
        Aluno aluno = new AlunoIntegral(curso, 1);
        assertEquals(curso, aluno.getCurso());
    }

    @Test
    void deveImpedirCursoNulo() {
        try {
            Aluno aluno = new AlunoIntegral(null, 1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O aluno deve obrigatoriamente ter um curso!", e.getMessage());
        }
    }

    @Test
    void deveDefinirNumeroParcelasEValorMensalidade() {
        Aluno aluno = new AlunoIntegral(new Curso(), 1);
        aluno.setNumParcelas(10);
        aluno.setValorMensalidade(500.0f);
        assertEquals(10, aluno.getNumParcelas());
        assertEquals(500.0f, aluno.getValorMensalidade());
    }


}
