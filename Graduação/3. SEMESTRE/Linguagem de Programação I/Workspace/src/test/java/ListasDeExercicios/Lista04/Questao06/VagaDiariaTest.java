package ListasDeExercicios.Lista04.Questao06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VagaDiariaTest {
    @Test
    public void deveCalcularValor() {
        Vaga vaga = new VagaDiaria(1, 5);
        assertEquals(50, vaga.calcularValor());
    }
}