package ListasDeExercicios.Lista03.Questao04;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VooDomesticoTest {
    VooDomestico vooDomestico;

    @Test
    public void deveInserirOrigem() {
        vooDomestico = new VooDomestico("São Paulo", 436, "Rio de Janeiro");
        assertEquals("São Paulo", vooDomestico.getOrigem());
    }

    @Test
    public void deveRetirarEspacosExtremidadeOrigem() {
        vooDomestico = new VooDomestico(" Juiz de Fora ", 489, " São Paulo ");
        assertEquals("Juiz de Fora", vooDomestico.getOrigem());
    }

    @Test
    public void deveInserirDestino() {
        vooDomestico = new VooDomestico("São Paulo", 436, "Rio de Janeiro");
        assertEquals("Rio de Janeiro", vooDomestico.getDestino());
    }

    @Test
    public void deveRetirarEspacosExtremidadesDestino() {
        vooDomestico = new VooDomestico("Juiz de Fora", 489, " São Paulo ");
        assertEquals("São Paulo", vooDomestico.getDestino());
    }

    @Test
    public void deveInserirDistancia() {
        vooDomestico = new VooDomestico("São Paulo", 1, "Rio de Janeiro");
        assertEquals(1, vooDomestico.getDistancia());
    }

    @Test
    public void deveCalcularPreco() {
        vooDomestico = new VooDomestico("São Paulo", 489, "Rio de Janeiro");
        assertEquals(635.7f, vooDomestico.calcularPreco(), 0.01);
    }

    @Test
    public void deveInserirDataVooValida() {
        vooDomestico = new VooDomestico("São Paulo", 489, "Rio de Janeiro", "1/1/2025");
        assertEquals("1/1/2025", vooDomestico.getDataVoo());
    }

    @Test
    public void deveImpedirOrigemVazia() {
        try {
            vooDomestico = new VooDomestico(" ", 489, "Rio de Janeiro");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Local de origem não definido!", e.getMessage());
        }
    }

    @Test
    public void deveImpedirDestinoVazio() {
        try {
            vooDomestico = new VooDomestico("São Paulo", 489, " ");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Local de destino não definido!", e.getMessage());
        }
    }

    @Test
    public void deveImpedirDistanciaInvalida() {
        try {
            vooDomestico = new VooDomestico("São Paulo", 0, "Rio de Janeiro");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Distância inválida!", e.getMessage());
        }
    }

    @Test
    public void deveImpedirDataVooInvalida() {
        try {
            vooDomestico = new VooDomestico("São Paulo", 489, "Rio de Janeiro", "29/2/2025");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Data de voo inválida!", e.getMessage());
        }
    }
}
