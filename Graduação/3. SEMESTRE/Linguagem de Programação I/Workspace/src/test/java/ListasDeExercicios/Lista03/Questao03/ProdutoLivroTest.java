package ListasDeExercicios.Lista03.Questao03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoLivroTest {
    ProdutoLivro produtoLivro;

    @Test
    public void deveCalcularPrecoBase() {
        produtoLivro = new ProdutoLivro("Senhor dos Anéis", 20.5f);
        assertEquals(19.48, produtoLivro.calcularPreco(), 0.01f);
    }
}