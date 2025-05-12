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
    public void deveMarcarPagina() {
        livro.abrir();
        livro.setNumeroPaginas(100);
        livro.marcarPagina(100);
        assertEquals(100, livro.getPaginaAtual());
    }

    @Test
    public void deveAvancarPagina() {
        livro.abrir();
        livro.setNumeroPaginas(100);
        livro.marcarPagina(99);
        livro.avancarPagina();
        assertEquals(100, livro.getPaginaAtual());
    }

    @Test
    public void deveRetrocederPagina() {
        livro.abrir();
        livro.setNumeroPaginas(100);
        livro.marcarPagina(2);
        livro.retrocederPagina();
        assertEquals(1, livro.getPaginaAtual());
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
    public void deveExibirDados() {
        livro.setTitulo("Dom Casmurro");
        livro.setAutor("Machado de Assis");
        livro.setAnoPublicacao(1899);
        livro.setNumeroPaginas(256);
        livro.setGenero("Romance");
        livro.setEstado(true);
        livro.marcarPagina(45);
        assertEquals("Título: Dom Casmurro - Autor: Machado de Assis - Ano de Publicação: 1899 - Número de Páginas: 256 - Página atual: 45 - Gênero: Romance - Estado: Aberto", livro.exibirDados());
    }

    @Test
    public void deveAbrirLivroAberto() {
        try {
            livro.setEstado(true);
            livro.abrir();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O livro já está aberto!", e.getMessage());
        }
    }

    @Test
    public void deveFecharLivroFechado() {
        try {
            livro.setEstado(false);
            livro.fechar();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O livro já está fechado!", e.getMessage());
        }
    }

    @Test
    public void deveTestarMarcacaoPaginaInvalida() {
        try {
            livro.abrir();
            livro.setNumeroPaginas(100);
            livro.marcarPagina(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Página inválida!", e.getMessage());
        }
    }

    @Test
    public void deveTestarMarcacaoMaiorNumeroPaginas() {
        try {
            livro.abrir();
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
            livro.abrir();
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
            livro.abrir();
            livro.setNumeroPaginas(100);
            livro.marcarPagina(1);
            livro.retrocederPagina();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Já está na primeira página!", e.getMessage());
        }
    }

    @Test
    public void deveVerificarLivroFechado() {
        try {
            livro.setNumeroPaginas(200);
            livro.marcarPagina(100);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O livro está fechado!", e.getMessage());
        }
    }
}