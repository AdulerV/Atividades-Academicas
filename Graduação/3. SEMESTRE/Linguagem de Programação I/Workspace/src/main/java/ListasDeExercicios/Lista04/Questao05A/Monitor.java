package ListasDeExercicios.Lista04.Questao05A;

public class Monitor extends EquipamentoMantido {
    public Monitor(Cliente cliente, int numeroManutencao) {
        super(cliente, numeroManutencao);
    }

    @Override
    public float calcularValorManutencao() {
        return this.valorMaoObra;
    }
}
