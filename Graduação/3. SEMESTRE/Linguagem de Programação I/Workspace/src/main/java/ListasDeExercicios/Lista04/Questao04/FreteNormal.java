package ListasDeExercicios.Lista04.Questao04;

public class FreteNormal extends Frete {
    public FreteNormal(Cliente cliente, int numero) {
        super(cliente, numero);
    }

    @Override
    public float calcularValor() {
        return this.valor;
    }
}
