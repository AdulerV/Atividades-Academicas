package ListasDeExercicios.Lista04.Questao03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class HospedeTest {

    @Test
    void deveInserirCodigo() {
        Hospede hospede = new Hospede();
        hospede.setCodigo(1);
        assertEquals(1, hospede.getCodigo());
    }

    @Test
    void deveImpedirCodigoInvalido() {
        try {
            Hospede hospede = new Hospede();
            hospede.setCodigo(-1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Código inválido!", e.getMessage());
        }
    }

    @Test
    void deveInserirNome() {
        Hospede hospede = new Hospede();
        hospede.setNome("  Maria Joaquina  ");
        assertEquals("Maria Joaquina", hospede.getNome());
    }

    @Test
    void deveImpedirNomeInvalido() {
        try {
            Hospede hospede = new Hospede();
            hospede.setNome("   ");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Não é permitido nome vazio!", e.getMessage());
        }
    }

    @Test
    void deveInserirListaReservas() {
        Hospede hospede = new Hospede();
        ArrayList<Reserva> reservas = new ArrayList<>();
        hospede.setReservas(reservas);
        assertEquals(reservas, hospede.getReservas());
    }

    @Test
    void deveImpedirListaReservasInvalida() {
        try {
            Hospede hospede = new Hospede();
            hospede.setReservas(null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Lista de reservas inválida!", e.getMessage());
        }
    }

    @Test
    void deveAdicionarReserva() {
        Hospede hospede = new Hospede();
        Reserva reserva = new ReservaQuartoSingle(hospede, 1);
        hospede.adicionarReserva(reserva);
        assertEquals(1, hospede.getNumeroReservas());
        assertTrue(hospede.verificarReserva(reserva));
    }

    @Test
    void deveImpedirReservaNula() {
        try {
            Hospede hospede = new Hospede();
            hospede.adicionarReserva(null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Reserva inválida!", e.getMessage());
        }
    }

    @Test
    void deveImpedirReservaDuplicada() {
        try {
            Hospede hospede = new Hospede();
            Reserva reserva = new ReservaQuartoSingle(new Hospede(), 1);
            hospede.adicionarReserva(reserva);
            hospede.adicionarReserva(reserva);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Reserva inválida!", e.getMessage());
        }
    }

    @Test
    void deveRemoverReserva() {
        Hospede hospede = new Hospede();
        Reserva reserva = new ReservaQuartoSingle(new Hospede(), 1);
        hospede.adicionarReserva(reserva);
        hospede.removerReserva(reserva);
        assertFalse(hospede.verificarReserva(reserva));
    }

    @Test
    void deveImpedirRemoverReservaInexistente() {
        try {
            Hospede hospede = new Hospede();
            Reserva reserva = new ReservaQuartoSingle(new Hospede(), 1);
            hospede.removerReserva(reserva);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Reserva não pertence ao cliente!", e.getMessage());
        }
    }

    @Test
    void deveCalcularValorTotalReservas() {
        Hospede hospede = new Hospede();

        ReservaQuartoSingle single = new ReservaQuartoSingle(new Hospede(), 1);
        single.setNumeroDiasHospedagem(3);
        hospede.adicionarReserva(single);

        ReservaQuartoDuplo duplo = new ReservaQuartoDuplo(new Hospede(), 2);
        duplo.setNumeroDiasHospedagem(2);
        duplo.setNumeroRefeicoes(4);
        hospede.adicionarReserva(duplo);

        ReservaQuartoTriplo triplo = new ReservaQuartoTriplo(new Hospede(), 3);
        triplo.setNumeroDiasHospedagem(5);
        triplo.setNumeroRefeicoes(8);
        hospede.adicionarReserva(triplo);

        assertEquals(930.0f, hospede.calcularValorTotalImoveis());
    }
}
