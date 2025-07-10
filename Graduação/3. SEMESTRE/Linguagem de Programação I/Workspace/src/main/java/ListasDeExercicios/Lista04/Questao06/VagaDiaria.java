package ListasDeExercicios.Lista04.Questao06;

public class VagaDiaria extends Vaga {
    public VagaDiaria(int numero, int numeroDias) {
        super(numero, numeroDias);
    }

    @Override
    public float calcularValor() {
        final float FATOR_PRECO_VAGA = 10;
        return this.periodo * FATOR_PRECO_VAGA;
    }
}