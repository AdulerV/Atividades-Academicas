package ListasDeExercicios.Lista04.Questao05A;

public abstract class EquipamentoMantido {
    protected int numeroManutencao;
    protected float valorMaoObra;
    protected Cliente cliente;

    public EquipamentoMantido(Cliente cliente, int numeroManutencao) {
        setCliente(cliente);
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public abstract float calcularValorManutencao();
}
