package ListasDeExercicios.Lista03.Questao08;

public class Carro extends Veiculo {
    Carro(String marca, String modelo, float precoBase) {
        super(marca, modelo, precoBase);
    }

    @Override
    public float calcularCustos() {
        final float FATOR_FIXO_CARRO = 1.50f;
        return this.precoBase * FATOR_FIXO_CARRO;
    }
}
