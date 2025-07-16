package ListasDeExercicios.Lista04.Questao07;

public class FitaCatalogo extends FitaEmprestada {
    public FitaCatalogo(Cliente cliente, String data, int numeroDias) {
        super(cliente, data, numeroDias);
    }

    @Override
    public float calcularValorEmprestimo() {
        final float FATOR_PRECO_EMPRESTIMO = 5;
        return this.numeroDias * FATOR_PRECO_EMPRESTIMO;
    }
}
