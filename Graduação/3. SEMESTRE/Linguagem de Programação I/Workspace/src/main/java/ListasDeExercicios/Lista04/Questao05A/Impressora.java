package ListasDeExercicios.Lista04.Questao05A;

public class Impressora extends EquipamentoMantido {
    private float valorTotalPecasTrocadas;

    public Impressora(Cliente cliente, int numeroManutencao) {
        super(cliente, numeroManutencao);
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
