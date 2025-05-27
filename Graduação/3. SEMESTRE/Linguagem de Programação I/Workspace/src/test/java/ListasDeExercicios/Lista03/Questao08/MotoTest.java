package ListasDeExercicios.Lista03.Questao08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotoTest {
    Moto moto;

    @Test
    public void deveCalcularCustos() {
        moto = new Moto("Honda", "PCX", 17975);
        assertEquals(22468.75f, moto.calcularCustos(), 0.01f);
    }
}