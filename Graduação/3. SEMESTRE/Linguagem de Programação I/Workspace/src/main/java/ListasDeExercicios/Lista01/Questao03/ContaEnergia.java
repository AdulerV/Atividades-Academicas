package ListasDeExercicios.Lista01.Questao03;

public class ContaEnergia {
    private int numeroQuilowatts;

    public int getNumeroQuilowatts() {
        return  this.numeroQuilowatts;
    }

    public void setNumeroQuilowatts(int numeroQuilowatts) {
        if(numeroQuilowatts < 0) {
            throw new IllegalArgumentException("Número de quilowatts consumidos inválido!");
        }
        this.numeroQuilowatts = numeroQuilowatts;
    }

    public float calcularValorPorQuilowatt() {
        return this.numeroQuilowatts * 0.12f;
    }

    public float calcularValorTotal() {
        final float ICMS = 0.18f;
        return this.calcularValorPorQuilowatt() + (this.calcularValorPorQuilowatt() * ICMS);
    }
}
