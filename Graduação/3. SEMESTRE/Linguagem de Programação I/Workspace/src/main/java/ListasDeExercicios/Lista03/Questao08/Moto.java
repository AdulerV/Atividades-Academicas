package ListasDeExercicios.Lista03.Questao08;

public class Moto extends Veiculo {
    Moto(String marca, String modelo, float precoBase) {
        super(marca, modelo, precoBase);
    }

    @Override
    public float calcularCustos() {
        final float FATO_FIXO_MOTO = 1.25f;
        return this.precoBase * FATO_FIXO_MOTO;
    }
}
