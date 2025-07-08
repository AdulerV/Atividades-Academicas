package ListasDeExercicios.Lista04.Questao01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApartamentoTest {

    @Test
    void deveCalcularValorApartamento() {
        Apartamento apartamento = new Apartamento();
        apartamento.setMetragemQuadrada(100);
        apartamento.setAndar(1);
        assertEquals(3999.8, apartamento.calcularValor(), 0.1f);
    }

    @Test
    void deveImpedirAndarInvalido() {
        try {
            Apartamento apartamento = new Apartamento();
            apartamento.setAndar(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Andar do apartamento inválido!", e.getMessage());
        }
    }
}