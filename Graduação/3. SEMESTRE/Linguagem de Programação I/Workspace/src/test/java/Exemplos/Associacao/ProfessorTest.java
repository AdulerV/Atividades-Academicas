package Exemplos.Associacao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {
    @Test
    public void deveRetornarEscolaridadeProfessor() {
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setNome("Mestrado");
        Professor professor = new Professor();
        professor.setEscolaridade(escolaridade);
        assertEquals("Mestrado", professor.getNomeEscolaridade());
    }

    @Test
    public void deveRetornarCidadeNascimentoProfessor() {
        Cidade cidade = new Cidade();
        cidade.setNome("Juiz de Fora");
        Professor professor = new Professor();
        professor.setNaturalidade(cidade);
        assertEquals("Juiz de Fora", professor.getNomeNaturalidade());
    }

    @Test
    public void deveRetornarTipoEnsinoContratado() {
        TipoEnsino tipoEnsino = new TipoEnsino();
        tipoEnsino.setTipo("Ensino Medio");
        Curso curso = new Curso();
        curso.setTipoEnsino(tipoEnsino);
        Professor professor = new Professor();
        professor.setContratacao(curso);
        assertEquals("Ensino Medio", professor.getTipoEnsinoMinistrado());
    }

    @Test
    public void deveRetornarDiretorDoProfessor() {
        Professor diretor = new Professor();
        diretor.setNome("Pedro Pereira");
        Escola escola = new Escola();
        escola.setDirecao(diretor);
        Curso curso = new Curso();
        curso.setEscola(escola);
        Professor professor = new Professor();
        professor.setContratacao(curso);
        assertEquals("Pedro Pereira", professor.getNomeDiretor());
    }

    @Test
    public void deveRetornarCoordenadorDoProfessor() {
        Professor coordenador = new Professor();
        coordenador.setNome("Maria Clara");
        Curso curso = new Curso();
        curso.setCoordenacao(coordenador);
        Professor professor = new Professor();
        professor.setContratacao(curso);
        assertEquals("Maria Clara", professor.getNomeCoordenador());
    }
}