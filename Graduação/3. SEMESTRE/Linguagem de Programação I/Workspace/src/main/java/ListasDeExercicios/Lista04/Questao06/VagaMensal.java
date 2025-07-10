package ListasDeExercicios.Lista04.Questao06;

public class VagaMensal extends Vaga {
    public VagaMensal(int numero, int numeroMeses) {
        super(numero, numeroMeses);
    }

    @Override
    public float calcularValor() {
        final float FATOR_PRECO_VAGA = 150;
        return this.periodo * FATOR_PRECO_VAGA;
    }
}
