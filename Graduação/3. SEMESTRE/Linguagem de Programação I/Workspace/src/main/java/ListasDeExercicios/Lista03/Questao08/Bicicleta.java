package ListasDeExercicios.Lista03.Questao08;

public class Bicicleta extends Veiculo {
    Bicicleta(String marca, String modelo, float precoBase) {
        super(marca, modelo, precoBase);
    }

    @Override
    public float calcularCustos() {
        final float FATO_FIXO_BICICLETA = 1.10f;
        return this.precoBase * FATO_FIXO_BICICLETA;
    }
}
