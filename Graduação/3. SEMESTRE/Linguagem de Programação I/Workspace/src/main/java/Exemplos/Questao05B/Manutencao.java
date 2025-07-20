package Exemplos.Questao05B;

public class Manutencao {
    private int numeroManutencao;
    private Cliente cliente;
    private Equipamento equipamento;

    public Manutencao(Equipamento equipamento, int numeroManutencao) {
        setEquipamento(equipamento);
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        if(equipamento == null) {
            throw new IllegalArgumentException("O equipamento é obrigatório!");
        }
        this.equipamento = equipamento;
    }

    public float obterValor() {
        return equipamento.calcularValorManutencao();
    }
}
