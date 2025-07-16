package ListasDeExercicios.Lista04.Questao03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaQuartoTriploTest {
    @Test
    void deveInserirNumeroRefeicoes() {
        ReservaQuartoTriplo reserva = new ReservaQuartoTriplo(new Hospede(), 1);
        reserva.setNumeroRefeicoes(1);
        assertEquals(1, reserva.getNumeroRefeicoes());
    }

    @Test
    void deveImpedirNumeroRefeicoesNegativo() {
        try {
            ReservaQuartoTriplo reserva = new ReservaQuartoTriplo(new Hospede(), 1);
            reserva.setNumeroRefeicoes(-1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Número de refeições inválido!", e.getMessage());
        }
    }

    @Test
    void deveCalcularValor() {
        ReservaQuartoTriplo reserva = new ReservaQuartoTriplo(new Hospede(), 1);
        reserva.setNumeroDiasHospedagem(3);
        reserva.setNumeroRefeicoes(5);
        assertEquals(350.0f, reserva.calcularValor());
    }

    @Test
    void deveAceitarZeroRefeicoes() {
        ReservaQuartoTriplo reserva = new ReservaQuartoTriplo(new Hospede(), 1);
        reserva.setNumeroDiasHospedagem(2);
        reserva.setNumeroRefeicoes(0);
        assertEquals(200.0f, reserva.calcularValor());
    }
}