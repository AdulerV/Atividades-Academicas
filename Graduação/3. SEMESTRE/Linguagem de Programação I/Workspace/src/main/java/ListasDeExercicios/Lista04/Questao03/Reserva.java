package ListasDeExercicios.Lista04.Questao03;

public abstract class Reserva {
    protected int numeroDiasHospedagem;
    protected Hospede hospede;

    public Reserva(Hospede hospede, int numeroDiasHospedagem) {
        setHospede(hospede);
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

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        if(hospede == null) {
            throw new IllegalArgumentException("O hóspede é obrigatório!");
        }
        this.hospede = hospede;
    }

    public abstract float calcularValor();
}
