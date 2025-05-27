package ListasDeExercicios.Lista03.Questao03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoEletronicoTest {
    ProdutoEletronico produtoEletronico;

    @Test
    public void deveInserirNome() {
        produtoEletronico = new ProdutoEletronico("Playstation 5", 4500);
        assertEquals("Playstation 5", produtoEletronico.getNome());
    }

    @Test
    public void deveInserirPrecoBase() {
        produtoEletronico = new ProdutoEletronico("Playstation 5", 0.01f);
        assertEquals(0.01f, produtoEletronico.getPrecoBase());
    }

    @Test
    public void deveCalcularPrecoBase() {
        produtoEletronico = new ProdutoEletronico("Playstation 5", 4500);
        assertEquals(4050, produtoEletronico.calcularPreco());
    }

    @Test
    public void deveRetirarEspacosExtremidades() {
        produtoEletronico = new ProdutoEletronico(" Xbox 360 ", 1000);
        assertEquals("Xbox 360", produtoEletronico.getNome());
    }

    @Test
    public void deveImpedirNomeVazio() {
        try {
            produtoEletronico = new ProdutoEletronico(" ", 1000);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome vazio não é permitido!", e.getMessage());
        }
    }

    @Test
    public void deveImpedirPrecoBaseInvalido() {
        try {
            produtoEletronico = new ProdutoEletronico("Xbox 360", 0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Preço base inválido!", e.getMessage());
        }
    }
}