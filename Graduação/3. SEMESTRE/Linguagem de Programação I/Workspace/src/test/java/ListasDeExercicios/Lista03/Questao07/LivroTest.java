package ListasDeExercicios.Lista03.Questao07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LivroTest {
    Livro livro;

    @Test
    public void deveCalcularDataDevolucao() {
        livro = new Livro("Interestelar");
        assertEquals("14/02/2025", livro.calcularDataDevolucao("30/01/2025"));
    }
}