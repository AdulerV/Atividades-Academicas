package ListasDeExercicios.Lista02.Questao05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {
    Produto produto;

    @BeforeEach
    public void setUp() {
        produto = new Produto();
    }

    @Test
    public void deveAdicionarEstoque() {
        produto.setQuantidadeEstoque(10);
        produto.adicionarEstoque(5);
        assertEquals(15, produto.getQuantidadeEstoque());
    }

    @Test
    public void deveRemoverEstoque() {
        produto.setQuantidadeEstoque(10);
        produto.removerEstoque(5);
        assertEquals(5, produto.getQuantidadeEstoque());
    }

    @Test
    public void deveAplicarDesconto() {
        produto.setPreco(60.5f);
        produto.aplicarDesconto(10);
        assertEquals(54.45, produto.getPreco(), 0.01);
    }

    @Test
    public void deveExibirDados() {
        produto.setNome("Notebook");
        produto.setPreco(3500.0f);
        produto.setQuantidadeEstoque(15);
        produto.setCategoria("Informática");
        assertEquals("Nome: Notebook - Preço: 3500.0 - Estoque: 15 - Categoria: Informática", produto.exibirDados());
    }

    @Test
    public void deveTestarPrecoNegativo() {
        try {
            produto.setPreco(-0.1f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Preço inválido!", e.getMessage());
        }
    }

    @Test
    public void deveTestarQuantidadeNegativa() {
        try {
            produto.setQuantidadeEstoque(-1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Quantidade de estoque inválida!", e.getMessage());
        }
    }

    @Test
    public void deveTestarAdicaoNegativa() {
        try {
            produto.adicionarEstoque(-1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Quantidade inválida!", e.getMessage());
        }
    }

    @Test
    public void deveTestarRemocaoNegativa() {
        try {
            produto.setQuantidadeEstoque(10);
            produto.removerEstoque(-1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Quantidade inválida ou estoque insuficiente!", e.getMessage());
        }
    }

    @Test
    public void deveTestarRemocaoMaiorEstoque() {
        try {
            produto.setQuantidadeEstoque(10);
            produto.removerEstoque(11);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Quantidade inválida ou estoque insuficiente!", e.getMessage());
        }
    }

    @Test
    public void deveTestarPercentualInvalido() {
        try {
            produto.setPreco(60.5f);
            produto.aplicarDesconto(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Percentual inválido!", e.getMessage());
        }
    }
}