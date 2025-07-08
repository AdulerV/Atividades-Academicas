package ListasDeExercicios.Lista04.Questao03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaQuartoDuploTest {

    @Test
    void deveInserirNumeroRefeicoes() {
        ReservaQuartoDuplo reserva = new ReservaQuartoDuplo(new Hospede(), 1);
        reserva.setNumeroRefeicoes(1);
        assertEquals(1, reserva.getNumeroRefeicoes());
    }

    @Test
    void deveImpedirNumeroRefeicoesNegativo() {
        try {
            ReservaQuartoDuplo reserva = new ReservaQuartoDuplo(new Hospede(), 1);
            reserva.setNumeroRefeicoes(-1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Número de refeições inválido!", e.getMessage());
        }
    }

    @Test
    void deveCalcularValor() {
        ReservaQuartoDuplo reserva = new ReservaQuartoDuplo(new Hospede(), 1);
        reserva.setNumeroDiasHospedagem(3);
        reserva.setNumeroRefeicoes(5);
        assertEquals(290.0f, reserva.calcularValor());
    }

    @Test
    void deveAceitarZeroRefeicoes() {
        ReservaQuartoDuplo reserva = new ReservaQuartoDuplo(new Hospede(), 1);
        reserva.setNumeroDiasHospedagem(2);
        reserva.setNumeroRefeicoes(0);
        assertEquals(160.0f, reserva.calcularValor());
    }
}
