package ListasDeExercicios.ExerciciosSurpresa.Exercicio01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AlunoEnsinoMedioTest {
    AlunoEnsinoMedio alunoEnsinoMedio;

    @BeforeEach
    public void setUp() {
        alunoEnsinoMedio = new AlunoEnsinoMedio();
    }

    @Test
    public void deveInserirNotas() {
        float[] notas = {0, 0};
        alunoEnsinoMedio.setNotas(notas);
        assertEquals("[0.0, 0.0]", Arrays.toString(alunoEnsinoMedio.getNotas()));
    }

    @Test
    public void deveInserirMatricula() {
        alunoEnsinoMedio.setMatricula(0);
        assertEquals(0, alunoEnsinoMedio.getMatricula());
    }

    @Test
    public void deveCalcularMedia() {
        float[] notas = {6.2f, 7.5f};
        alunoEnsinoMedio.setNotas(notas);
        assertEquals(6.85, alunoEnsinoMedio.calcularMedia(), 0.01);
    }

    @Test
    public void deveVerificarAprovado() {
        float[] notas = {6, 6};
        alunoEnsinoMedio.setNotas(notas);
        assertEquals(true, alunoEnsinoMedio.verificarAprovacao());
    }

    @Test
    public void deveVerificarReprovado() {
        float[] notas = {5.9f, 6};
        alunoEnsinoMedio.setNotas(notas);
        assertEquals(false, alunoEnsinoMedio.verificarAprovacao());
    }

    @Test
    public void deveExibirDadosAprovado() {
        float[] notas = {6, 6};
        alunoEnsinoMedio.setNotas(notas);
        alunoEnsinoMedio.setNome("João da Silva");
        alunoEnsinoMedio.setMatricula(1001);
        assertEquals("Nome: João da Silva - Matrícula: 1001 - Aprovação: Aprovado", alunoEnsinoMedio.exibirDados());
    }

    @Test
    public void deveExibirDadosReprovado() {
        float[] notas = {6, 5.9f};
        alunoEnsinoMedio.setNotas(notas);
        alunoEnsinoMedio.setNome("João da Silva");
        alunoEnsinoMedio.setMatricula(1001);
        assertEquals("Nome: João da Silva - Matrícula: 1001 - Aprovação: Reprovado", alunoEnsinoMedio.exibirDados());
    }

    @Test
    public void deveImpedirNota1Negativa() {
        try {
            float[] notas = {-0.1f, 0};
            alunoEnsinoMedio.setNotas(notas);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nota 1 inválida!", e.getMessage());
        }
    }

    @Test
    public void deveImpedirNota2Negativa() {
        try {
            float[] notas = {0, -0.1f};
            alunoEnsinoMedio.setNotas(notas);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nota 2 inválida!", e.getMessage());
        }
    }

    @Test
    public void deveImpedirMatriculaNegativa() {
        try {
            alunoEnsinoMedio.setMatricula(-1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Número de matrícula inválido!", e.getMessage());
        }
    }
}