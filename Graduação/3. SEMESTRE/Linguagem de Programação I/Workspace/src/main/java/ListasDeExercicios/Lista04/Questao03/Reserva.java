package ListasDeExercicios.Lista04.Questao03;

public abstract class Reserva {
    protected int numeroDiasHospedagem;

    public Reserva(int numeroDiasHospedagem) {
        setNumeroDiasHospedagem(numeroDiasHospedagem);
    }

    public int getNumeroDiasHospedagem() {
        return numeroDiasHospedagem;
    }

    public void setNumeroDiasHospedagem(int numeroDiasHospedagem) {
        if(numeroDiasHospedagem <= 0) {
            throw new IllegalArgumentException("Número de dias inválido!");
        }
        this.numeroDiasHospedagem = numeroDiasHospedagem;
    }

    public abstract float calcularValor();
}
