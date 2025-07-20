package ListasDeExercicios.Lista04.Questao03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaTest {
    @Test
    void deveInserirNumeroDiasHospedagem() {
        Reserva reserva = new ReservaQuartoSingle(1);
        reserva.setNumeroDiasHospedagem(1);
        assertEquals(1, reserva.getNumeroDiasHospedagem());
    }

    @Test
    void deveImpedirNumeroDiasHospedagemInvalido() {
        try {
            Reserva reserva = new ReservaQuartoSingle(1);
            reserva.setNumeroDiasHospedagem(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Número de dias inválido!", e.getMessage());
        }
    }

    @Test
    void deveCalcularValorReserva() {
        Reserva reserva = new ReservaQuartoSingle(1);
        reserva.setNumeroDiasHospedagem(10);
        assertEquals(500, reserva.calcularValor());
    }
}