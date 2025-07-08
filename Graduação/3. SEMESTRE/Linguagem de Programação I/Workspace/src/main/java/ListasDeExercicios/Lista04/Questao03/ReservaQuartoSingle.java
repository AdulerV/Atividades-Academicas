package ListasDeExercicios.Lista04.Questao03;

public class ReservaQuartoSingle extends Reserva{
    public ReservaQuartoSingle(Hospede hospede, int numeroDiasHospedagem) {
        super(hospede, numeroDiasHospedagem);
    }

    @Override
    public float calcularValor() {
        final float FATOR_PRECO_DIA = 50;
        return this.numeroDiasHospedagem * FATOR_PRECO_DIA;
    }
}
