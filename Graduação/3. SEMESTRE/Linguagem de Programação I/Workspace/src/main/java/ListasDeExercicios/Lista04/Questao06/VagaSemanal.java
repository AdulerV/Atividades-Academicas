package ListasDeExercicios.Lista04.Questao06;

public class VagaSemanal extends Vaga {
    public VagaSemanal(int numero, int numeroSemanas) {
        super(numero, numeroSemanas);
    }

    @Override
    public float calcularValor() {
        final float FATOR_PRECO_VAGA = 40;
        return this.periodo * FATOR_PRECO_VAGA;
    }
}
