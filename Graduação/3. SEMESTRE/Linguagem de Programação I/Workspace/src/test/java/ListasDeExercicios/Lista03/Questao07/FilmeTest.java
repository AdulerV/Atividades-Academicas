package ListasDeExercicios.Lista03.Questao07;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FilmeTest {
    Filme filme;

    @Test
    public void deveInserirTitulo() {
        filme = new Filme("A Origem");
        assertEquals("A Origem", filme.getTitulo());
    }

    @Test
    public void deveRetirarEspacosExtremidadesTitulo() {
        filme = new Filme("  O Poderoso Chefão  ");
        assertEquals("O Poderoso Chefão", filme.getTitulo());
    }

    @Test
    public void deveImpedirTituloVazio() {
        try {
            filme = new Filme(" ");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Título vazio não é permitido!", e.getMessage());
        }
    }

    @Test
    public void deveInserirDataPublicacaoValida() {
        filme = new Filme("Matrix", "15/06/1999");
        assertEquals("15/06/1999", filme.getDataPublicacao());
    }

    @Test
    public void deveImpedirDataPublicacaoInvalida() {
        try {
            filme = new Filme("Matrix", "31/02/2020"); // Fevereiro não tem 31
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Data de publicação inválida!", e.getMessage());
        }
    }

    @Test
    public void deveCalcularDataDevolucao() {
        filme = new Filme("Interestelar");
        assertEquals("04/02/2025", filme.calcularDataDevolucao("30/01/2025"));
    }

    @Test
    public void deveImpedirDataEmprestimoInvalida() {
        try {
            filme = new Filme("Blade Runner");
            filme.calcularDataDevolucao("31/02/2025");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Data de empréstimo inválida!", e.getMessage());
        }
    }
}
