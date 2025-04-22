package Exemplos.Aluno;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {
    Aluno aluno;

    @Test
    public void deveTestarConstrutor() {
        tratarExcecao(10, 10);
        tratarExcecao(0, 0);
        tratarExcecao(-0.1, 5);
        tratarExcecao(5, -0.1);
        tratarExcecao(10.1, 5);
        tratarExcecao(5, 10.1);
    }

    @Test
    public void deveSomarNotas() {
        aluno = new Aluno(10, 10);
        double soma = aluno.somarNotas();
        Assertions.assertEquals(20, soma);
    }

    public void tratarExcecao(double nota1, double nota2) {
        try {
            aluno = new Aluno(nota1, nota2);
        } catch (RuntimeException exception) {
            System.out.println(exception.getMessage());
        }
    }
}