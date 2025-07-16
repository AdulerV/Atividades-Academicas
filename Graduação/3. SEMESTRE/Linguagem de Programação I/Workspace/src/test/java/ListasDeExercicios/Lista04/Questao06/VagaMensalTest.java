package ListasDeExercicios.Lista04.Questao06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VagaMensalTest {
    @Test
    public void deveCalcularValor() {
        Vaga vaga = new VagaMensal(1, 5);
        assertEquals(750, vaga.calcularValor());
    }
}