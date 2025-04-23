package ListasDeExercicios.Lista01.Questao04;

/* Calcular a média de combustível gasto pelo usuário, sendo informado a quantidade de quilômetros rodados e a quantidade de combustível consumido. */

public class Automovel {
    private double quilometrosRodados;
    private double combustivelConsumido;

    public double getQuilometrosRodados() {
        return this.quilometrosRodados;
    }

    public void setQuilometrosRodados(double quilometrosRodados) {
        if(quilometrosRodados < 0) {
            throw new IllegalArgumentException("Quantidade de quilômetros rodados inválida!");
        }
        this.quilometrosRodados = quilometrosRodados;
    }

    public double getCombustivelConsumido() {
        return this.combustivelConsumido;
    }

    public void setCombustivelConsumido(double combustivelConsumido) {
        if(combustivelConsumido < 0) {
            throw new IllegalArgumentException("Quantidade de combustível consumido inválida!");
        }
        this.combustivelConsumido = combustivelConsumido;
    }

    public double calcularMediaCombustivelGasto() {
        return this.quilometrosRodados / this.combustivelConsumido;
    }
}
