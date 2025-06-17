package ListasDeExercicios.ExerciciosSurpresa.Exercicio02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TipoEnsinoTest {
    TipoEnsino tipoEnsino;

    @Test
    public void inserirTipoEnsinoFundamental() {
        tipoEnsino = new TipoEnsino("Ensino Fundamental");
        assertEquals("ensino fundamental", tipoEnsino.getNome());
    }

    @Test
    public void inserirTipoEnsinoMedio() {
        tipoEnsino = new TipoEnsino("ensino médio");
        assertEquals("ensino médio", tipoEnsino.getNome());
    }

    @Test
    public void inserirTipoEnsinoSuperior() {
        tipoEnsino = new TipoEnsino("ENSINO SUPERIOR");
        assertEquals("ensino superior", tipoEnsino.getNome());
    }

    @Test
    public void deveImpedirTipoEnsinoInvalido() {
        try {
            tipoEnsino = new TipoEnsino("ensino primário");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tipo de ensino inválido!", e.getMessage());
        }
    }
}