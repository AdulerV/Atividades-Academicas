package ListasDeExercicios.Lista02.Questao03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LivroTest {
    Livro livro;

    @BeforeEach
    public void setUp() {
        livro = new Livro();
    }

    @Test
    public void deveTestarNumeroPaginasInvalido() {
        try {
            livro.setNumeroPaginas(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Número de páginas inválido!", e.getMessage());
        }
    }

    @Test
    public void deveTestarMarcacaoPaginaInvalida() {
        try {
            livro.setNumeroPaginas(100);
            livro.marcarPagina(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Página inválida!", e.getMessage());
        }
    }

    @Test
    public void deveTestarMarcacaoMaiorDoQueNumeroPaginas() {
        try {
            livro.setNumeroPaginas(100);
            livro.marcarPagina(101);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Página inválida!", e.getMessage());
        }
    }

    @Test
    public void deveTestarAvancamentoInvalido() {
        try {
            livro.setNumeroPaginas(100);
            livro.marcarPagina(100);
            livro.avancarPagina();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Já está na última página!", e.getMessage());
        }
    }

    @Test
    public void deveTestarRetrocessoInvalido() {
        try {
            livro.setNumeroPaginas(100);
            livro.marcarPagina(1);
            livro.retrocederPagina();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Já está na primeira página!", e.getMessage());
        }
    }

    @Test
    public void deveMarcarPagina() {
        livro.setNumeroPaginas(100);
        livro.marcarPagina(100);
        assertEquals(100, livro.getPaginaAtual());
    }

    @Test
    public void deveAvancarPagina() {
        livro.setNumeroPaginas(100);
        livro.marcarPagina(99);
        livro.avancarPagina();
        assertEquals(100, livro.getPaginaAtual());
    }

    @Test
    public void deveRetrocederPagina() {
        livro.setNumeroPaginas(100);
        livro.marcarPagina(2);
        livro.retrocederPagina();
        assertEquals(1, livro.getPaginaAtual());
    }
}