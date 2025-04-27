package ListasDeExercicios.Lista02.Questao01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {
    Carro carro;

    @BeforeEach
    public void setUp() {
        carro = new Carro();
    }

    @Test
    public void deveTestarAnoNegativo() {
        try {
            carro.setAno(-1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Ano inválido!", e.getMessage());
        }
    }

    @Test
    public void deveTestarVelocidadeNegativa() {
        try {
            carro.setVelocidadeAtual(-0.1f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Velocidade inválida!", e.getMessage());
        }
    }

    @Test
    public void deveTestarAceleracaoNegativa() {
        try {
            carro.acelerar(-0.1f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor inválido!", e.getMessage());
        }
    }

    @Test
    public void deveTestarFreadaInvalida() {
        try {
            carro.frear(0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor de freada inválido!", e.getMessage());
        }
    }

    @Test
    public void deveTestarFreadaMaiorDoQueVelocidade() {
        try {
            carro.setVelocidadeAtual(10.0f);
            carro.frear(10.1f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor de freada inválido!", e.getMessage());
        }
    }

    @Test
    public void deveAcelearar() {
        carro.setVelocidadeAtual(10.2f);
        carro.acelerar(5.8f);
        assertEquals(16.0f, carro.getVelocidadeAtual());
    }

    @Test
    public void deveFrear() {
        carro.setVelocidadeAtual(10.2f);
        carro.frear(5.8f);
        assertEquals(4.4f, carro.getVelocidadeAtual(), 0.1f);
    }

    @Test
    public void deveLigar() {
        carro.ligar();
        assertEquals(true, carro.isEstado());
    }

    @Test
    public void deveDesligar() {
        carro.desligar();
        assertEquals(false, carro.isEstado());
        assertEquals(0, carro.getVelocidadeAtual());
    }
}