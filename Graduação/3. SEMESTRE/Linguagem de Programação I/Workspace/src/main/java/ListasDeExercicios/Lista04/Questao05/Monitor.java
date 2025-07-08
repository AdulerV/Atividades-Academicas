package ListasDeExercicios.Lista04.Questao05;

public class Monitor extends EquipamentoManutencao {
    public Monitor(Cliente cliente, int numeroManutencao) {
        super(cliente, numeroManutencao);
    }

    @Override
    public float calcularValorManutencao() {
        return this.valorMaoObra;
    }
}
