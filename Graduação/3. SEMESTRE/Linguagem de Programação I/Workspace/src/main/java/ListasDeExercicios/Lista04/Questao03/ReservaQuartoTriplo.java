package ListasDeExercicios.Lista04.Questao03;

public class ReservaQuartoTriplo extends Reserva{
    private float numeroRefeicoes;

    public ReservaQuartoTriplo(int numeroDiasHospedagem) {
        super(numeroDiasHospedagem);
    }

    public float getNumeroRefeicoes() {
        return numeroRefeicoes;
    }

    public void setNumeroRefeicoes(float numeroRefeicoes) {
        if(numeroRefeicoes < 0) {
            throw new IllegalArgumentException("Número de refeições inválido!");
        }
        this.numeroRefeicoes = numeroRefeicoes;
    }

    @Override
    public float calcularValor() {
        final float FATOR_PRECO_DIA = 100, FATOR_PRECO_REFEICAO = 10;
        return (this.numeroDiasHospedagem * FATOR_PRECO_DIA) + (this.numeroRefeicoes * FATOR_PRECO_REFEICAO) ;
    }
}
