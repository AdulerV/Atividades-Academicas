package ListasDeExercicios.ExerciciosSurpresa.Exercicio02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {
    Curso curso;
    Professor coordenacao;
    Escolaridade escolaridade;

    // b) Qual a escolaridade do coordenador de um curso?
    @Test
    public void deveInserirEscolaridadeCoordenador() {
        escolaridade = new Escolaridade("Doutorado");
        coordenacao = new Professor(escolaridade);
        curso = new Curso(coordenacao);
        assertEquals("doutorado", curso.getNivelEscolarCoordenador());
    } //

    @Test
    public void deveTestarNomeCoordenadorAusente() {
        curso = new Curso(coordenacao);
        assertEquals("Curso sem coordenação!", curso.getNomeCoordenador());
    }

    @Test
    public void deveTestarEscolaridadeCoordenadorAusente() {
        curso = new Curso(coordenacao);
        assertEquals("Curso sem coordenação!", curso.getNivelEscolarCoordenador());
    }
}