package ListasDeExercicios.Lista04.Questao07;

public class FitaEspecial extends FitaEmprestada {
    private float valorAluguelDiario;

    public FitaEspecial(Cliente cliente, String data, int numeroDias, float valorAluguelDiario) {
        super(cliente, data, numeroDias);
        setValorAluguel(valorAluguelDiario);
    }

    public float getValorAluguel() {
        return valorAluguelDiario;
    }

    public void setValorAluguel(float valorAluguelDiario) {
        if(valorAluguelDiario <= 0) {
            throw new IllegalArgumentException("Valor do aluguel inválido!");
        }
        this.valorAluguelDiario = valorAluguelDiario;
    }

    @Override
    public float calcularValorEmprestimo() {
        return this.numeroDias * this.valorAluguelDiario;
    }
}
