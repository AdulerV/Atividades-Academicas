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

    // Testando a validação das entradas

    @Test
    public void deveTestarPesoNegativo() {
        try {
            pessoa.setPeso(-0.1);
            fail();
        } catch (IllegalArgumentException exception) {
            assertEquals("Peso inválido!", exception.getMessage());
        }
    }

    @Test
    public void deveTestarAlturaNegativa() {
        try {
            pessoa.setAltura(-0.1);
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

    // Encontrando resultados distintos conforme o gênero

    @Test
    public void deveEncontrarResultadoFeminino() {
        pessoa.setPeso(57.8); // IMC ≈ 20
        pessoa.setAltura(1.70);
        pessoa.setSexo("Feminino");
        assertEquals("Peso normal", pessoa.encontrarResultado());
    }

    @Test
    public void deveEncontrarResultadoMasculino() {
        pessoa.setPeso(57.8); // IMC ≈ 20
        pessoa.setAltura(1.70);
        pessoa.setSexo("Masculino");
        assertEquals("Abaixo do peso", pessoa.encontrarResultado());
    }

    // Resultados para sexo feminino

    @Test
    public void deveEncontrarResultadoFemininoAbaixoDoPeso() {
        pessoa.setPeso(48.0); // IMC ≈ 16.6
        pessoa.setAltura(1.70);
        pessoa.setSexo("Feminino");
        assertEquals("Abaixo do peso", pessoa.encontrarResultado());
    }

    @Test
    public void deveEncontrarResultadoFemininoPesoNormal() {
        pessoa.setPeso(65.0); // IMC ≈ 22.5
        pessoa.setAltura(1.70);
        pessoa.setSexo("Feminino");
        assertEquals("Peso normal", pessoa.encontrarResultado());
    }

    @Test
    public void deveEncontrarResultadoFemininoMarginalmenteAcimaDoPeso() {
        pessoa.setPeso(75.0); // IMC ≈ 25.95
        pessoa.setAltura(1.70);
        pessoa.setSexo("Feminino");
        assertEquals("Marginalmente acima do peso", pessoa.encontrarResultado());
    }

    @Test
    public void deveEncontrarResultadoFemininoAcimaDoPesoIdeal() {
        pessoa.setPeso(85.0); // IMC ≈ 29.4
        pessoa.setAltura(1.70);
        pessoa.setSexo("Feminino");
        assertEquals("Acima do peso ideal", pessoa.encontrarResultado());
    }

    @Test
    public void deveEncontrarResultadoFemininoObeso() {
        pessoa.setPeso(95.0); // IMC ≈ 32.9
        pessoa.setAltura(1.70);
        pessoa.setSexo("Feminino");
        assertEquals("Obeso", pessoa.encontrarResultado());
    }

    // Resultados para sexo masculino

    @Test
    public void deveEncontrarResultadoMasculinoAbaixoDoPeso() {
        pessoa.setPeso(54.0); // IMC ≈ 18.7
        pessoa.setAltura(1.70);
        pessoa.setSexo("Masculino");
        assertEquals("Abaixo do peso", pessoa.encontrarResultado());
    }

    @Test
    public void deveEncontrarResultadoMasculinoPesoNormal() {
        pessoa.setPeso(74.0); // IMC ≈ 25.6
        pessoa.setAltura(1.70);
        pessoa.setSexo("Masculino");
        assertEquals("Peso normal", pessoa.encontrarResultado());
    }

    @Test
    public void deveEncontrarResultadoMasculinoMarginalmenteAcimaDoPeso() {
        pessoa.setPeso(78.0); // IMC ≈ 27.0
        pessoa.setAltura(1.70);
        pessoa.setSexo("Masculino");
        assertEquals("Marginalmente acima do peso", pessoa.encontrarResultado());
    }

    @Test
    public void deveEncontrarResultadoMasculinoAcimaDoPesoIdeal() {
        pessoa.setPeso(88.0); // IMC ≈ 30.4
        pessoa.setAltura(1.70);
        pessoa.setSexo("Masculino");
        assertEquals("Acima do peso ideal", pessoa.encontrarResultado());
    }

    @Test
    public void deveEncontrarResultadoMasculinoObeso() {
        pessoa.setPeso(95.0); // IMC ≈ 32.9
        pessoa.setAltura(1.70);
        pessoa.setSexo("Masculino");
        assertEquals("Obeso", pessoa.encontrarResultado());
    }
}