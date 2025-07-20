package Exemplos.Questao05B;

public abstract class Equipamento {
    protected float valorMaoObra;
    protected Manutencao manutencao;

    public Equipamento(Manutencao manutencao) {
        setManutencao(manutencao);
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

    public Manutencao getManutencao() {
        return manutencao;
    }

    public void setManutencao(Manutencao manutencao) {
        if(manutencao == null) {
            throw new IllegalArgumentException("A manutenção é obrigatória!");
        }

        this.manutencao = manutencao;
    }

    public abstract float calcularValorManutencao();
}
