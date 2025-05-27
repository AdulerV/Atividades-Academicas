package ListasDeExercicios.Lista03.Questao05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoEletronicoTest {
    ProdutoEletronico produtoEletronico;

    @Test
    public void deveInserirNome() {
        produtoEletronico = new ProdutoEletronico("Playstation 5", 10, 10);
        assertEquals("Playstation 5", produtoEletronico.getNome());
    }

    @Test
    public void deveInserirPrecoUnitario() {
        produtoEletronico = new ProdutoEletronico("Playstation 5", 0, 10);
        assertEquals(0, produtoEletronico.getPrecoUnitario());
    }

    @Test
    public void deveInserirQuantidadeEstoque() {
        produtoEletronico = new ProdutoEletronico("Playstation 5", 0, 0);
        assertEquals(0, produtoEletronico.getQuantidadeEstoque());
    }

    @Test
    public void deveRetirarEspacosExtremidadesNome() {
        produtoEletronico = new ProdutoEletronico(" Playstation 4 ", 0, 0);
        assertEquals("Playstation 4", produtoEletronico.getNome());
    }

    @Test
    public void deveCalcularPrecoTotal() {
        produtoEletronico = new ProdutoEletronico("Playstation 5", 4500.75f, 10);
        assertEquals(45007.5, produtoEletronico.calcularPrecoTotal());
    }

    @Test
    public void deveComprarProdutos() {
        produtoEletronico = new ProdutoEletronico("Playstation 5", 4500, 10);
        produtoEletronico.comprarProduto(10);
        assertEquals(0, produtoEletronico.getQuantidadeEstoque());
    }

    @Test
    public void deveImpedirNomeVazio() {
        try {
            produtoEletronico = new ProdutoEletronico(" ", 0, 0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome vazio não é permitido!", e.getMessage());
        }
    }

    @Test
    public void deveImpedirPrecoUnitarioInvalido() {
        try {
            produtoEletronico = new ProdutoEletronico("Playstation 4", -0.01f, 0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Preço unitário inválido!", e.getMessage());
        }
    }

    @Test
    public void deveImpedirQuantidadeEstoqueInvalida() {
        try {
            produtoEletronico = new ProdutoEletronico("Playstation 4", 0, -1);
        } catch (IllegalArgumentException e) {
            assertEquals("Quantidade em estoque inválida!", e.getMessage());
        }
    }

    @Test
    public void deveImpedirQuantidadeCompradaInvalida() {
        try {
            produtoEletronico = new ProdutoEletronico("Playstation 5", 4500, 10);
            produtoEletronico.comprarProduto(0);
        } catch (IllegalArgumentException e) {
            assertEquals("Quantidade a comprar inválida!", e.getMessage());
        }
    }

    @Test
    public void deveImpedirQuantidadeCompradaMaiorEstoque() {
        try {
            produtoEletronico = new ProdutoEletronico("Playstation 5", 4500, 10);
            produtoEletronico.comprarProduto(11);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Quantidade a comprar maior que saldo atual!", e.getMessage());
        }
    }
}
