package ListasDeExercicios.Lista04.Questao01;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ContribuinteTest {
    @Test
    void deveInserirCodigo() {
        Contribuinte contribuinte = new Contribuinte();
        contribuinte.setCodigo(1);
        assertEquals(1, contribuinte.getCodigo());
    }

    @Test
    void deveImpedirCodigoInvalido() {
        try {
            Contribuinte contribuinte = new Contribuinte();
            contribuinte.setCodigo(-1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Código inválido!", e.getMessage());
        }
    }

    @Test
    void deveInserirNome() {
        Contribuinte contribuinte = new Contribuinte();
        contribuinte.setNome("  João da Silva  ");
        assertEquals("João da Silva", contribuinte.getNome());
    }

    @Test
    void deveImpedirNomeInvalido() {
        try {
            Contribuinte contribuinte = new Contribuinte();
            contribuinte.setNome(" ");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Não é permitido nome vazio!", e.getMessage());
        }
    }

    @Test
    void deveInserirLista() {
        Contribuinte contribuinte = new Contribuinte();
        ArrayList<Imovel> imoveis = new ArrayList<Imovel>();
        contribuinte.setImoveis(imoveis);
        assertEquals(imoveis, contribuinte.getImoveis());
    }

    @Test
    void deveImpedirListaInvalida() {
        try {
            Contribuinte contribuinte = new Contribuinte();
            contribuinte.setImoveis(null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Lista de imóveis inválida!", e.getMessage());
        }
    }

    @Test
    void deveAdicionarImovel() {
        Contribuinte contribuinte = new Contribuinte();
        Lote lote = new Lote();
        lote.setMetragemQuadrada(100);
        contribuinte.adicionarImovel(lote);

        assertEquals(1, contribuinte.obterQuantidadeImoveis());
        assertTrue(contribuinte.verificarImovel(lote));
    }

    @Test
    void deveImpedirImovelNulo() {
        try {
            Contribuinte contribuinte = new Contribuinte();
            contribuinte.adicionarImovel(null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Imóvel inválido!", e.getMessage());
        }
    }

    @Test
    void deveImpedirImovelDuplicado() {
        try {
            Contribuinte contribuinte = new Contribuinte();
            Casa casa = new Casa();
            casa.setMetragemQuadrada(100);
            casa.setMetragemQuadradaConstrucao(50);
            contribuinte.adicionarImovel(casa);
            contribuinte.adicionarImovel(casa);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Imóvel inválido!", e.getMessage());
        }
    }

    @Test
    void deveRemoverImovel() {
        Contribuinte contribuinte = new Contribuinte();
        Apartamento apartamento = new Apartamento();
        apartamento.setMetragemQuadrada(60);
        apartamento.setAndar(2);
        contribuinte.adicionarImovel(apartamento);
        contribuinte.removerImovel(apartamento);
        assertFalse(contribuinte.verificarImovel(apartamento));
    }

    @Test
    void deveImpedirRemoverImovelNaoExistente() {
        try {
            Contribuinte contribuinte = new Contribuinte();
            Casa casa = new Casa();
            contribuinte.removerImovel(casa);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Imóvel não pertence ao contribuinte!", e.getMessage());
        }
    }

    @Test
    void deveCalcularValoresDosImoveis() {
        Contribuinte contribuinte = new Contribuinte();

        Lote lote = new Lote();
        lote.setMetragemQuadrada(100);
        contribuinte.adicionarImovel(lote);

        Casa casa = new Casa();
        casa.setMetragemQuadrada(50);
        casa.setMetragemQuadradaConstrucao(50);
        contribuinte.adicionarImovel(casa);

        Apartamento apartamento = new Apartamento();
        apartamento.setMetragemQuadrada(60);
        apartamento.setAndar(1);
        contribuinte.adicionarImovel(apartamento);

        ArrayList<Float> valores = contribuinte.consultarValoresImoveis();
        assertEquals(3, valores.size());
        assertEquals(3000.0f, valores.get(0));
        assertEquals(4000.0f, valores.get(1));
        assertEquals(2399.9f, valores.get(2), 0.01f);
    }

    @Test
    void deveCalcularValorTotalDosImoveis() {
        Contribuinte contribuinte = new Contribuinte();

        Lote lote = new Lote();
        lote.setMetragemQuadrada(100);
        contribuinte.adicionarImovel(lote);

        Casa casa = new Casa();
        casa.setMetragemQuadrada(50);
        casa.setMetragemQuadradaConstrucao(50);
        contribuinte.adicionarImovel(casa);

        Apartamento apartamento = new Apartamento();
        apartamento.setMetragemQuadrada(60);
        apartamento.setAndar(1);
        contribuinte.adicionarImovel(apartamento);

        assertEquals(9399.9f, contribuinte.calcularValorTotalImoveis(), 0.01f);
    }

    @Test
    public void deveRetornarImovelAusente() {
        Contribuinte contribuinte = new Contribuinte();
        assertEquals(0, contribuinte.obterQuantidadeImoveis());
    }

    @Test
    public void deveInserirUmImovel() {
        Contribuinte contribuinte = new Contribuinte();
        Imovel lote = new Lote();
        contribuinte.adicionarImovel(lote);
        assertEquals(1, contribuinte.obterQuantidadeImoveis());
    }

    @Test
    public void deveInserirMaisDeUmImovel() {
        Contribuinte contribuinte = new Contribuinte();
        Imovel lote = new Lote();
        contribuinte.adicionarImovel(lote);

        Imovel casa = new Casa();
        contribuinte.adicionarImovel(casa);

        Imovel apartamento = new Apartamento();
        contribuinte.adicionarImovel(apartamento);

        assertEquals(3, contribuinte.obterQuantidadeImoveis());
    }
}
