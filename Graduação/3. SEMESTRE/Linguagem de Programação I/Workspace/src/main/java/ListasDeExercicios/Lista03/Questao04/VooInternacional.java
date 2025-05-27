package ListasDeExercicios.Lista03.Questao04;

public class VooInternacional extends Voo {
    VooInternacional(String origem, int distancia, String destino) {
        super(origem, distancia, destino);
    }

    VooInternacional(String origem, int distancia, String destino, String dataVoo) {
        super(origem, distancia, destino, dataVoo);
    }

    @Override
    public float calcularPreco() {
        final float FATOR_PRECO_INTERNACIONAL = 1.20f;
        final float TAXA_CONVERSAO_MOEDA = 6;
        return this.distancia * FATOR_PRECO_INTERNACIONAL * TAXA_CONVERSAO_MOEDA;
    }
}
