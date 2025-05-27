package ListasDeExercicios.Lista03.Questao03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoRoupaTest {
    ProdutoRoupa produtoRoupa;

    @Test
    public void deveInserirPrecoEtiqueta() {
        produtoRoupa = new ProdutoRoupa("Bermuda", 0.01f);
        assertEquals(0.01f, produtoRoupa.getPrecoBase());
    }

    @Test
    public void deveCalcularPrecoBase() {
        produtoRoupa = new ProdutoRoupa("Bermuda", 50.5f);
        assertEquals(40.40, produtoRoupa.calcularPreco(), 0.01f);
    }

    @Test
    public void deveImpedirPrecoEtiquetaInvalido() {
        try {
            produtoRoupa = new ProdutoRoupa("Bermuda", -0.01f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Preço base inválido!", e.getMessage());
        }
    }
}