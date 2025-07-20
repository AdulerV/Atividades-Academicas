package Exemplos.Questao05B;

public class CPU extends Equipamento {
    private float valorTotalPecasTrocadas;

    public CPU(Manutencao manutencao) {
        super(manutencao);
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
        return this.valorMaoObra + valorTotalPecasTrocadas;
    }
}
