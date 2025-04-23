package ListasDeExercicios.Lista01.Questao04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutomovelTest {
    Automovel automovel;

    @BeforeEach
    public void setUp() {
        automovel = new Automovel();
    }

    @Test
    public void deveTestarQuilometrosRodadosNegativos() {
        try {
            automovel.setQuilometrosRodados(-0.1);
            fail();
        } catch (IllegalArgumentException exception) {
            assertEquals("Quantidade de quilômetros rodados inválida!", exception.getMessage());
        }
    }

    @Test
    public void deveTestarCombustivelConsumidoNegativo() {
        try {
            automovel.setCombustivelConsumido(-0.1);
            fail();
        } catch (IllegalArgumentException exception) {
            assertEquals("Quantidade de combustível consumido inválida!", exception.getMessage());
        }
    }

    @Test
    public void deveCalcularMediaCombustivelGasto() {
        automovel.setQuilometrosRodados(350);
        automovel.setCombustivelConsumido(40);
        assertEquals(8.75, automovel.calcularMediaCombustivelGasto());
    }
}