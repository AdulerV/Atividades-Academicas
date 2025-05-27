package ListasDeExercicios.Lista03.Questao04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VooInternacionalTest {
    VooInternacional vooInternacional;

    @Test
    public void deveCalcularPreco() {
        vooInternacional = new VooInternacional("São Paulo", 9458, "Paris");
        assertEquals(68097.6f, vooInternacional.calcularPreco(), 0.01);
    }
}