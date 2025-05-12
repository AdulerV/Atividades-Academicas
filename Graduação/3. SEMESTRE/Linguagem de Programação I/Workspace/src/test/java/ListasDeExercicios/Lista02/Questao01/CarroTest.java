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
    public void deveAcelerar() {
        carro.ligar();
        carro.setVelocidadeAtual(10.2f);
        carro.acelerar(5.8f);
        assertEquals(16.0f, carro.getVelocidadeAtual());
    }

    @Test
    public void deveFrear() {
        carro.ligar();
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
        carro.ligar();
        carro.desligar();
        assertEquals(false, carro.isEstado());
        assertEquals(0, carro.getVelocidadeAtual());
    }

    @Test
    public void deveExibirDados() {
        carro.setMarca("BWM");
        carro.setModelo("X5");
        carro.setAno(2009);
        carro.setEstado(true);
        carro.setVelocidadeAtual(100.5f);
        assertEquals("Marca: BWM - Modelo: X5 - Ano: 2009 - Velocidade atual: 100.5 - Estado: ligado", carro.exibirDados());
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
            carro.ligar();
            carro.setVelocidadeAtual(-0.1f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Velocidade inválida!", e.getMessage());
        }
    }

    @Test
    public void deveTestarVelocidadeAtualCarroDesligado() {
        try {
            carro.setVelocidadeAtual(10.5f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O carro está desligado!", e.getMessage());
        }
    }

    @Test
    public void deveTestarAceleracaoNegativa() {
        try {
            carro.ligar();
            carro.acelerar(-0.1f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor inválido!", e.getMessage());
        }
    }

    @Test
    public void deveTestarAceleracaoCarroDesligado() {
        try {
            carro.acelerar(10.5f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O carro está desligado!", e.getMessage());
        }
    }

    @Test
    public void deveTestarFreadaInvalida() {
        try {
            carro.ligar();
            carro.acelerar(10.5f);
            carro.frear(0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor de freada inválido!", e.getMessage());
        }
    }

    @Test
    public void deveTestarFreadaMaiorVelocidade() {
        try {
            carro.ligar();
            carro.setVelocidadeAtual(10.0f);
            carro.frear(10.1f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor de freada inválido!", e.getMessage());
        }
    }

    @Test
    public void deveTestarFreadaCarroDesligado() {
        try {
            carro.ligar();
            carro.setVelocidadeAtual(10.0f);
            carro.desligar();
            carro.frear(5.2f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O carro está desligado!", e.getMessage());
        }
    }

    @Test
    public void deveLigarCarroLigado() {
        try {
            carro.ligar();
            carro.ligar();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O carro já está ligado!", e.getMessage());
        }
    }

    @Test
    public void deveDesligarCarroDesligado() {
        try {
            carro.desligar();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O carro já está desligado!", e.getMessage());
        }
    }
}