package Exemplos.Questao05B;

public class Monitor extends Equipamento {
    public Monitor(Manutencao manutencao) {
        super(manutencao);
    }

    @Override
    public float calcularValorManutencao() {
        return this.valorMaoObra;
    }
}
