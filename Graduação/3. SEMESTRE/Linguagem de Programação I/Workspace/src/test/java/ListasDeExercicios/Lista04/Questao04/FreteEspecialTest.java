package ListasDeExercicios.Lista04.Questao04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreteEspecialTest {

    @Test
    void deveCalcularValorComTaxaEntrega() {
        FreteEspecial freteEspecial = new FreteEspecial(new Cliente(), 10);
        freteEspecial.setValor(200.0f);
        assertEquals(206.0f, freteEspecial.calcularValor());
    }
}
