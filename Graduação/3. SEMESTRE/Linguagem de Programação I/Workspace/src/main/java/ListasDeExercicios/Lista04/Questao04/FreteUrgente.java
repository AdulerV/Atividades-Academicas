package ListasDeExercicios.Lista04.Questao04;

public class FreteUrgente extends Frete {
    private final float taxaEntrega;
    private int numeroItens;

    public FreteUrgente(Cliente cliente, int numero) {
        super(cliente, numero);
        this.taxaEntrega = 0.03f;
    }

    public float getTaxaEntrega() {
        return taxaEntrega;
    }

    public int getNumeroItens() {
        return numeroItens;
    }

    public void setNumeroItens(int numeroItens) {
        if(numeroItens <= 0) {
            throw new IllegalArgumentException("Número de itens inválido!");
        }
        this.numeroItens = numeroItens;
    }

    @Override
    public float calcularValor() {
        final float FATOR_PRECO_ITEM = 10;
        return this.valor + (this.valor * this.taxaEntrega) + (FATOR_PRECO_ITEM * this.numeroItens);
    }
}
