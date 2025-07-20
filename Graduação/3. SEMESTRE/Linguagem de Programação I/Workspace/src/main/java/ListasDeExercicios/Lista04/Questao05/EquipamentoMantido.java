package ListasDeExercicios.Lista04.Questao05;

public abstract class EquipamentoMantido {
    protected int numeroManutencao;
    protected float valorMaoObra;

    public EquipamentoMantido(int numeroManutencao) {
        setNumeroManutencao(numeroManutencao);
    }

    public int getNumeroManutencao() {
        return numeroManutencao;
    }

    public void setNumeroManutencao(int numeroManutencao) {
        if(numeroManutencao < 0) {
            throw new IllegalArgumentException("Número de manutenção inválido!");
        }
        this.numeroManutencao = numeroManutencao;
    }

    public float getValorMaoObra() {
        return valorMaoObra;
    }

    public void setValorMaoObra(float valorMaoObra)
    {
        if(valorMaoObra < 0) {
            throw new IllegalArgumentException("Valor da mão de obra inválido!");
        }
        this.valorMaoObra = valorMaoObra;
    }

    public abstract float calcularValorManutencao();
}
