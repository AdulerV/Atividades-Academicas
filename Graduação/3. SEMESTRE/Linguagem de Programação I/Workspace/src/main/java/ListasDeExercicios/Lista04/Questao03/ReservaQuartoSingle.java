package ListasDeExercicios.Lista04.Questao03;

public class ReservaQuartoSingle extends Reserva{
    public ReservaQuartoSingle(int numeroDiasHospedagem) {
        super(numeroDiasHospedagem);
    }

    @Override
    public float calcularValor() {
        final float FATOR_PRECO_DIA = 50;
        return this.numeroDiasHospedagem * FATOR_PRECO_DIA;
    }
}
