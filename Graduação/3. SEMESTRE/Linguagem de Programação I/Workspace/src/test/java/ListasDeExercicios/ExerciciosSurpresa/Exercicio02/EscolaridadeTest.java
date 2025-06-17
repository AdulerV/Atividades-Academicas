package ListasDeExercicios.ExerciciosSurpresa.Exercicio02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscolaridadeTest {
    Escolaridade escolaridade;

    @Test
    public void deveInserirEnsinoFundamental() {
        escolaridade = new Escolaridade(" Ensino Fundamental ");
        assertEquals("ensino fundamental", escolaridade.getNivelEscolar());
    }

    @Test
    public void deveInserirEnsinoFundamentalIncompleto() {
        escolaridade = new Escolaridade("Ensino Fundamental Incompleto");
        assertEquals("ensino fundamental incompleto", escolaridade.getNivelEscolar());
    }

    @Test
    public void deveInserirEnsinoMedio() {
        escolaridade = new Escolaridade("Ensino Médio");
        assertEquals("ensino médio", escolaridade.getNivelEscolar());
    }

    @Test
    public void deveInserirEnsinoMedioIncompleto() {
        escolaridade = new Escolaridade("ensino médio incompleto");
        assertEquals("ensino médio incompleto", escolaridade.getNivelEscolar());
    }

    @Test
    public void deveInserirSuperiorIncompleto() {
        escolaridade = new Escolaridade("ENSINO SUPERIOR INCOMPLETO");
        assertEquals("ensino superior incompleto", escolaridade.getNivelEscolar());
    }

    @Test
    public void deveInserirBacharelado() {
        escolaridade = new Escolaridade("bacharelado");
        assertEquals("bacharelado", escolaridade.getNivelEscolar());
    }

    @Test
    public void deveInserirLicenciatura() {
        escolaridade = new Escolaridade("licenciatura");
        assertEquals("licenciatura", escolaridade.getNivelEscolar());
    }

    @Test
    public void deveInserirTecnologo() {
        escolaridade = new Escolaridade("tecnólogo");
        assertEquals("tecnólogo", escolaridade.getNivelEscolar());
    }

    @Test
    public void deveInserirEspecializacao() {
        escolaridade = new Escolaridade("especialização");
        assertEquals("especialização", escolaridade.getNivelEscolar());
    }

    @Test
    public void deveInserirMBA() {
        escolaridade = new Escolaridade("MBA");
        assertEquals("mba", escolaridade.getNivelEscolar());
    }

    @Test
    public void deveInserirMestrado() {
        escolaridade = new Escolaridade("mestrado");
        assertEquals("mestrado", escolaridade.getNivelEscolar());
    }

    @Test
    public void deveInserirDoutorado() {
        escolaridade = new Escolaridade("doutorado");
        assertEquals("doutorado", escolaridade.getNivelEscolar());
    }

    @Test
    public void deveImpedirNivelEscolarInvalido() {
        try {
            escolaridade = new Escolaridade("ensino primário");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Escolaridade inválida!", e.getMessage());
        }
    }
}