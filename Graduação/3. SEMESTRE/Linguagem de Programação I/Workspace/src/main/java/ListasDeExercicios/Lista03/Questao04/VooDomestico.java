package ListasDeExercicios.Lista03.Questao04;

public class VooDomestico extends Voo {
    VooDomestico(String origem, int distancia, String destino) {
        super(origem, distancia, destino);
    }

    VooDomestico(String origem, int distancia, String destino, String dataVoo) {
        super(origem, distancia, destino, dataVoo);
    }

    @Override
    public float calcularPreco() {
        final float FATOR_PRECO_DOMESTICO = 1.30f;
        return this.distancia * FATOR_PRECO_DOMESTICO;
    }
}
