package ListasDeExercicios.Lista03.Questao08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarroTest {
    Carro carro;

    @Test
    public void deveInserirMarca() {
        carro = new Carro("Fiat", "Uno", 30000);
        assertEquals("Fiat", carro.getMarca());
    }

    @Test
    public void deveRetirarEspacosExtremidadesMarca() {
        carro = new Carro(" Ford ", "Ka", 25000);
        assertEquals("Ford", carro.getMarca());
    }

    @Test
    public void deveInserirModelo() {
        carro = new Carro("Fiat", "Uno", 30000);
        assertEquals("Uno", carro.getModelo());
    }

    @Test
    public void deveRetirarEspacosExtremidadesModelo() {
        carro = new Carro("Chevrolet", " Onix ", 45000);
        assertEquals("Onix", carro.getModelo());
    }

    @Test
    public void deveInserirPrecoBase() {
        carro = new Carro("Fiat", "Uno", 0.01f);
        assertEquals(0.01f, carro.getPrecoBase());
    }

    @Test
    public void deveImpedirMarcaVazia() {
        try {
            carro = new Carro(" ", "Civic", 50000);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Marca vazia não é permitido!", e.getMessage());
        }
    }

    @Test
    public void deveImpedirModeloVazio() {
        try {
            carro = new Carro("Honda", " ", 50000);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Modelo vazio não é permitido!", e.getMessage());
        }
    }

    @Test
    public void deveImpedirPrecoBaseInvalido() {
        try {
            carro = new Carro("Honda", "Civic", 0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Preço base inválido!", e.getMessage());
        }
    }

    @Test
    public void deveCalcularCustos() {
        carro = new Carro("Toyota", "Corolla", 50000);
        assertEquals(75000, carro.calcularCustos(), 0.01f);
    }
}
