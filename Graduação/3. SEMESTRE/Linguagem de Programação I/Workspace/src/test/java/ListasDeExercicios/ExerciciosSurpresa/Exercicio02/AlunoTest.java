package ListasDeExercicios.ExerciciosSurpresa.Exercicio02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {
    Aluno aluno;
    Cidade cidade;
    Estado estado;
    Escola escola;
    Curso curso;
    Professor professor;

    // d) Qual o estado de naturalidade de um aluno?
    @Test
    public void deveInserirEstadoNaturalidade() {
        estado = new Estado("Minas Gerais");
        cidade = new Cidade("Juiz de Fora", estado);
        aluno = new Aluno(cidade);
        assertEquals("Minas Gerais", aluno.getNomeEstado());
    } //

    // f) Qual o estado em que um aluno estuda?
    @Test
    public void deveInserirEstadoAlunoEstuda() {
        estado = new Estado("Minas Gerais");
        cidade = new Cidade("Juiz de Fora", estado);
        escola = new Escola("IF Sudeste MG", null, cidade);
        curso = new Curso(escola);
        aluno = new Aluno(curso);
        assertEquals("Minas Gerais", aluno.getNomeEstadoEscolaCurso());
    } //

    // h) Quem é o coordenador do curso de um aluno?
    @Test
    public void deveInserirCoordenadorCurso() {
        professor = new Professor("Marco Antônio");
        curso = new Curso(professor);
        aluno = new Aluno(curso);
        assertEquals("Marco Antônio", aluno.getNomeCoordenadorCurso());
    } //
}