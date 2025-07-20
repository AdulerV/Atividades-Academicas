package ListasDeExercicios.Lista04.Questao04;

public class FreteNormal extends Frete {
    public FreteNormal(int numero) {
        super(numero);
    }

    @Override
    public float calcularValor() {
        return this.valor;
    }
}
