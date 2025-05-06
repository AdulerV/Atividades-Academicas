package ListasDeExercicios.Lista01.Questao05;

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
    public void deveTestarPesoNegativo() {
        try {
            pessoa.setPeso(0);
            fail();
        } catch (IllegalArgumentException exception) {
            assertEquals("Peso inválido!", exception.getMessage());
        }
    }

    @Test
    public void deveTestarAlturaNegativa() {
        try {
            pessoa.setAltura(0);
            fail();
        } catch (IllegalArgumentException exception) {
            assertEquals("Altura inválida!", exception.getMessage());
        }
    }

    @Test
    public void deveTestarSexoInexistente() {
        try {
            pessoa.setSexo("Femininona");
            fail();
        } catch (IllegalArgumentException exception) {
            assertEquals("Sexo inválido!", exception.getMessage());
        }
    }

    @Test
    public void deveEncontrarResultadoFeminino() {
        pessoa.setPeso(57.8f); // IMC ≈ 20
        pessoa.setAltura(1.70f);
        pessoa.setSexo("Feminino");
        assertEquals("Peso normal", pessoa.encontrarResultado());
    }

    @Test
    public void deveEncontrarResultadoMasculino() {
        pessoa.setPeso(57.8f); // IMC ≈ 20
        pessoa.setAltura(1.70f);
        pessoa.setSexo("Masculino");
        assertEquals("Abaixo do peso", pessoa.encontrarResultado());
    }
    @Test
    public void deveEncontrarResultadoFemininoAbaixoDoPeso() {
        pessoa.setPeso(19.09f); // IMC = 19.09 (menor que 19.1)
        pessoa.setAltura(1.0f);
        pessoa.setSexo("Feminino");
        assertEquals("Abaixo do peso", pessoa.encontrarResultado());
    }

    @Test
    public void deveEncontrarResultadoFemininoPesoNormal() {
        pessoa.setPeso(25.79f); // IMC = 25.79 (menor que 25.8)
        pessoa.setAltura(1.0f);
        pessoa.setSexo("Feminino");
        assertEquals("Peso normal", pessoa.encontrarResultado());
    }

    @Test
    public void deveEncontrarResultadoFemininoMarginalmenteAcimaDoPeso() {
        pessoa.setPeso(27.29f); // IMC = 27.29 (menor que 27.3)
        pessoa.setAltura(1.0f);
        pessoa.setSexo("Feminino");
        assertEquals("Marginalmente acima do peso", pessoa.encontrarResultado());
    }

    @Test
    public void deveEncontrarResultadoFemininoAcimaDoPesoIdeal() {
        pessoa.setPeso(32.29f); // IMC = 32.29 (menor que 32.3)
        pessoa.setAltura(1.0f);
        pessoa.setSexo("Feminino");
        assertEquals("Acima do peso ideal", pessoa.encontrarResultado());
    }

    @Test
    public void deveEncontrarResultadoFemininoObeso() {
        pessoa.setPeso(32.31f); // IMC = 32.31 (acima de 32.3)
        pessoa.setAltura(1.0f);
        pessoa.setSexo("Feminino");
        assertEquals("Obeso", pessoa.encontrarResultado());
    }

    @Test
    public void deveEncontrarResultadoMasculinoAbaixoDoPeso() {
        pessoa.setPeso(20.69f); // IMC = 20.69 (menor que 20.7)
        pessoa.setAltura(1.0f);
        pessoa.setSexo("Masculino");
        assertEquals("Abaixo do peso", pessoa.encontrarResultado());
    }

    @Test
    public void deveEncontrarResultadoMasculinoPesoNormal() {
        pessoa.setPeso(26.39f); // IMC = 26.39 (menor que 26.4)
        pessoa.setAltura(1.0f);
        pessoa.setSexo("Masculino");
        assertEquals("Peso normal", pessoa.encontrarResultado());
    }

    @Test
    public void deveEncontrarResultadoMasculinoMarginalmenteAcimaDoPeso() {
        pessoa.setPeso(27.79f); // IMC = 27.79 (menor que 27.8)
        pessoa.setAltura(1.0f);
        pessoa.setSexo("Masculino");
        assertEquals("Marginalmente acima do peso", pessoa.encontrarResultado());
    }

    @Test
    public void deveEncontrarResultadoMasculinoAcimaDoPesoIdeal() {
        pessoa.setPeso(31.09f); // IMC = 31.09 (menor que 31.1)
        pessoa.setAltura(1.0f);
        pessoa.setSexo("Masculino");
        assertEquals("Acima do peso ideal", pessoa.encontrarResultado());
    }

    @Test
    public void deveEncontrarResultadoMasculinoObeso() {
        pessoa.setPeso(31.11f); // IMC = 31.11 (acima de 31.1)
        pessoa.setAltura(1.0f);
        pessoa.setSexo("Masculino");
        assertEquals("Obeso", pessoa.encontrarResultado());
    }
}
