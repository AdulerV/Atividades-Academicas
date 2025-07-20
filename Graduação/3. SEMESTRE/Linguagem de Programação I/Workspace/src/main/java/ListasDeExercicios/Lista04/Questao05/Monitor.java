package ListasDeExercicios.Lista04.Questao05;

public class Monitor extends EquipamentoMantido {
    public Monitor(int numeroManutencao) {
        super(numeroManutencao);
    }

    @Override
    public float calcularValorManutencao() {
        return this.valorMaoObra;
    }
}
