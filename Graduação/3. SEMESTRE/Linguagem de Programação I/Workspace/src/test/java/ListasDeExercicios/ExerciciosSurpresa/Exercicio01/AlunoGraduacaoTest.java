package ListasDeExercicios.ExerciciosSurpresa.Exercicio01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoGraduacaoTest {
    AlunoGraduacao alunoGraduacao;

    @BeforeEach
    public void setUp() {
        alunoGraduacao = new AlunoGraduacao("João da Silva");
    }

    @Test
    public void deveVerificarAprovado() {
        float[] notas = {7, 7};
        alunoGraduacao.setNotas(notas);
        assertEquals(true, alunoGraduacao.verificarAprovacao());
    }

    @Test
    public void deveVerificarReprovado() {
        float[] notas = {6.9f, 7};
        alunoGraduacao.setNotas(notas);
        assertEquals(false, alunoGraduacao.verificarAprovacao());
    }

    @Test
    public void deveExibirDadosAprovado() {
        float[] notas = {7, 7};
        alunoGraduacao.setNotas(notas);
        alunoGraduacao.setMatricula(1001);
        assertEquals("Nome: João da Silva - Matrícula: 1001 - Aprovação: Aprovado", alunoGraduacao.exibirDados());
    }

    @Test
    public void deveExibirDadosReprovado() {
        float[] notas = {7, 6.9f};
        alunoGraduacao.setNotas(notas);
        alunoGraduacao.setMatricula(1001);
        assertEquals("Nome: João da Silva - Matrícula: 1001 - Aprovação: Reprovado", alunoGraduacao.exibirDados());
    }
}