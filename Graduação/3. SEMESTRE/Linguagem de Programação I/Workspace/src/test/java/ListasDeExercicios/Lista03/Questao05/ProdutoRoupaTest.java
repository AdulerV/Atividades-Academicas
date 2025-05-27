package ListasDeExercicios.Lista03.Questao05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoRoupaTest {
    ProdutoRoupa produtoRoupa;

    @Test
    public void deveInserirDesconto() {
        produtoRoupa = new ProdutoRoupa("Camisa", 30, 20, 0.01f);
        assertEquals(0.01f, produtoRoupa.getDesconto());
    }

    @Test
    public void deveCalcularDesconto() {
        produtoRoupa = new ProdutoRoupa("Camisa", 30, 20, 10);
        assertEquals(3, produtoRoupa.calcularDesconto());
    }

    @Test
    public void deveCalcularPrecoTotalComDesconto() {
        produtoRoupa = new ProdutoRoupa("Camisa", 30, 20, 10);
        assertEquals(540, produtoRoupa.calcularPrecoTotal());
    }

    @Test
    public void deveCalcularPrecoTotalSemDesconto() {
        produtoRoupa = new ProdutoRoupa("Camisa", 30, 20);
        assertEquals(600, produtoRoupa.calcularPrecoTotal());
    }

    @Test
    public void deveImpedirDescontoInvalido() {
        try {
            produtoRoupa = new ProdutoRoupa("Camisa", 30, 20, 0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Desconto inválido!", e.getMessage());
        }
    }
}