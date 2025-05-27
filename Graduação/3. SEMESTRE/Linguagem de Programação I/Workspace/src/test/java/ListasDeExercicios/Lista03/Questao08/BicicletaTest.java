package ListasDeExercicios.Lista03.Questao08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BicicletaTest {
    Bicicleta bicicleta;

    @Test
    public void deveCalcularCustos() {
        bicicleta = new Bicicleta("Caloi", "Vulcan", 1155);
        assertEquals(1270.5, bicicleta.calcularCustos(), 0.01f);
    }
}