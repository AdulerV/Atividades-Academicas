package ListasDeExercicios.ExerciciosSurpresa.Exercicio03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {
    @Test
    public void deveInserirNome() {
        Pessoa pessoa = new Professor();
        pessoa.setNome("   Marco Antônio   ");
        assertEquals("Marco Antônio", pessoa.getNome());
    }

    @Test
    public void deveImpedirNomeInvalido() {
        try {
            Pessoa pessoa = new Professor();
            pessoa.setNome(" ");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido!", e.getMessage());
        }
    }
}