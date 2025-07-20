package ListasDeExercicios.Lista04.Questao05;

public class Impressora extends EquipamentoMantido {
    private float valorTotalPecasTrocadas;

    public Impressora(int numeroManutencao) {
        super(numeroManutencao);
    }

    public float getValorTotalPecasTrocadas() {
        return valorTotalPecasTrocadas;
    }

    public void setValorTotalPecasTrocadas(float valorTotalPecasTrocadas) {
        if(valorTotalPecasTrocadas < 0) {
            throw new IllegalArgumentException("Valor total das peças trocadas inválido!");
        }
        this.valorTotalPecasTrocadas = valorTotalPecasTrocadas;
    }

    @Override
    public float calcularValorManutencao() {
        return this.valorMaoObra + this.valorTotalPecasTrocadas;
    }
}
