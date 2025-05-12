package ListasDeExercicios.Lista02.Questao04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {
    Pessoa pessoa;

    @BeforeEach
    public void setUp() {
        pessoa = new Pessoa();
    }

    @Test
    public void deveEnvelhecer() {
        pessoa.setIdade(5);
        pessoa.envelhecer();
        assertEquals(6, pessoa.getIdade());
    }

    @Test
    public void deveCrescer() {
        pessoa.setIdade(15);
        pessoa.setAltura(1.60f);
        pessoa.crescer(20.1f);
        assertEquals(1.80f, pessoa.getAltura(), 0.01);
    }

    @Test
    public void deveGanharPeso() {
        pessoa.setPeso(100);
        pessoa.ganharPeso(1.9f);
        assertEquals(101.9f, pessoa.getPeso());
    }

    @Test
    public void devePerderPeso() {
        pessoa.setPeso(100);
        pessoa.perderPeso(1.90f);
        assertEquals(98.1f, pessoa.getPeso());
    }

    @Test
    public void deveExibirDados() {
        pessoa.setNome("Ana");
        pessoa.setIdade(28);
        pessoa.setAltura(1.65f);
        pessoa.setPeso(60.0f);
        assertEquals("Nome: Ana - Idade: 28 - Altura: 1.65 - Peso: 60.0", pessoa.exibirDados());
    }

    @Test
    public void deveTestarIdadeNegativa() {
        try {
            pessoa.setIdade(-1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Idade inválida!", e.getMessage());
        }
    }

    @Test
    public void deveTestarAlturaInvalida() {
        try {
            pessoa.setAltura(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Altura inválida!", e.getMessage());
        }
    }

    @Test
    public void deveTestarPesoInvalido() {
        try {
            pessoa.setPeso(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Peso inválido!", e.getMessage());
        }
    }

    @Test
    public void deveTestarCrescimentoNegativo() {
        try {
            pessoa.setAltura(1.80f);
            pessoa.crescer(-0.1f);
        } catch (IllegalArgumentException e) {
            assertEquals("Valor inválido ou pessoa com mais de 21 anos!", e.getMessage());
        }
    }

    @Test
    public void deveTestarCrescimentoIdadeInvalida() {
        try {
            pessoa.setIdade(21);
            pessoa.setAltura(1.80f);
            pessoa.crescer(10);
        } catch (IllegalArgumentException e) {
            assertEquals("Valor inválido ou pessoa com mais de 21 anos!", e.getMessage());
        }
    }

    @Test
    public void deveGanharPesoNegativo() {
        try {
            pessoa.setPeso(10);
            pessoa.ganharPeso(-1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Quantidade de quilogramas inválido!", e.getMessage());
        }
    }

    @Test
    public void devePerderPesoNegativo() {
        try {
            pessoa.setPeso(10);
            pessoa.ganharPeso(-1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Quantidade de quilogramas inválido!", e.getMessage());
        }
    }
}