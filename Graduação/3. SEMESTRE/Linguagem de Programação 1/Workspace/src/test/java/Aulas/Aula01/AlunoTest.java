package Aulas.Aula01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    Aluno aluno;

    @BeforeEach
    public void setUp() {
        aluno = new Aluno() ;
    }

    @Test
    public void deveSomarNotas() {
        aluno.setNota1(2);
        aluno.setNota2(3);
        assertEquals(5, aluno.somarNotas());
    }

    @Test
    public void deveCalculaMedia() {
        aluno.setNota1(8);
        aluno.setNota2(6);
        assertEquals(14, aluno.calcularMedia());
    }

    @Test
    public void deveTestarNota1Negativa() {
        try {
            aluno.setNota1(-1);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nota 1 inválida", e.getMessage());
        }
    }

    @Test
    public void deveTestarNota2Negativa() {
        try {
            aluno.setNota2(-1);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nota 2 inválida", e.getMessage());
        }
    }
}