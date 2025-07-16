package ListasDeExercicios.Lista04.Questao06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VagaSemanalTest {
    @Test
    public void deveCalcularValor() {
        Vaga vaga = new VagaSemanal(1, 5);
        assertEquals(200, vaga.calcularValor());
    }
}