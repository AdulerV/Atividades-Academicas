package ListasDeExercicios.Lista03.Questao05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoAlimentoTest {
    ProdutoAlimento produtoAlimento;

    @Test
    public void deveCalcularPrecoTotal() {
        produtoAlimento = new ProdutoAlimento("Arroz", 20.75f, 20);
        assertEquals(415, produtoAlimento.calcularPrecoTotal());
    }
}