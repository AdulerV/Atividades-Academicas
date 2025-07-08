package Exemplos.Associacao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {
    @Test
    public void deveRetornarEscolaridadeCoordenador() {
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setNome("Doutorado");
        Professor professor = new Professor();
        professor.setEscolaridade(escolaridade);
        Curso curso = new Curso();
        curso.setCoordenacao(professor);
        assertEquals("Doutorado", curso.getNomeEscolaridadeCoordenador());
    }
}