package ListasDeExercicios.Lista03.Questao07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RevistaTest {
    Revista revista;

    @Test
    public void deveCalcularDataDevolucao() {
        revista = new Revista("Interestelar");
        assertEquals("06/02/2025", revista.calcularDataDevolucao("30/01/2025"));
    }
}