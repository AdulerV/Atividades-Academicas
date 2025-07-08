package Exemplos.Associacao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {
    @Test
    public void deveRetornarEstadoNaturalidadeAluno() {
        Estado estado = new Estado();
        estado.setNome("Minas Gerais");
        Cidade cidade = new Cidade();
        cidade.setEstado(estado);
        Pessoa aluno = new Pessoa();
        aluno.setNaturalidade(cidade);
        assertEquals("Minas Gerais", aluno.getNomeEstadoNaturalidade());
    }

    @Test
    public void deveRetornarEstadoAlunoEstuda() {
        Estado estado = new Estado();
        estado.setNome("Rio de Janeiro");
        Cidade cidade = new Cidade();
        cidade.setEstado(estado);
        Escola escola = new Escola();
        escola.setCidade(cidade);
        Curso curso = new Curso();
        curso.setEscola(escola);
        Aluno aluno = new Aluno();
        aluno.setCurso(curso);
        assertEquals("Rio de Janeiro", aluno.getNomeEstadoEstudado());
    }

    @Test
    public void deveRetornarCoordenadorCursoAluno() {
        Professor professor = new Professor();
        professor.setNome("João da Silva");
        Curso curso = new Curso();
        curso.setCoordenacao(professor);
        Aluno aluno = new Aluno();
        aluno.setCurso(curso);
        assertEquals("João da Silva", aluno.getNomeCoordenadorCurso());
    }
}