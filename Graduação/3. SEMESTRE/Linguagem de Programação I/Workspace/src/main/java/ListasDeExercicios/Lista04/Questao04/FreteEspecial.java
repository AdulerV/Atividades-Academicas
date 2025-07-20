package ListasDeExercicios.Lista04.Questao04;

public class FreteEspecial extends Frete {
    private final float taxaEntrega;

    public FreteEspecial(int numero) {
        super(numero);
        this.taxaEntrega = 0.03f;
    }

    public float getTaxaEntrega() {
        return taxaEntrega;
    }

    @Override
    public float calcularValor() {
        return this.valor + (this.valor * this.taxaEntrega);
    }
}
