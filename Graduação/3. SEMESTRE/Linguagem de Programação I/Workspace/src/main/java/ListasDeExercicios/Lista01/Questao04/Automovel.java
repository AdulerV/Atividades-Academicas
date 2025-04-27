package ListasDeExercicios.Lista01.Questao04;

public class Automovel {
    private float quilometrosRodados;
    private float combustivelConsumido;

    public float getQuilometrosRodados() {
        return this.quilometrosRodados;
    }

    public void setQuilometrosRodados(float quilometrosRodados) {
        if(quilometrosRodados < 0) {
            throw new IllegalArgumentException("Quantidade de quilômetros rodados inválida!");
        }
        this.quilometrosRodados = quilometrosRodados;
    }

    public float getCombustivelConsumido() {
        return this.combustivelConsumido;
    }

    public void setCombustivelConsumido(float combustivelConsumido) {
        if(combustivelConsumido < 0) {
            throw new IllegalArgumentException("Quantidade de combustível consumido inválida!");
        }
        this.combustivelConsumido = combustivelConsumido;
    }

    public float calcularMediaCombustivelGasto() {
        return this.quilometrosRodados / this.combustivelConsumido;
    }
}
