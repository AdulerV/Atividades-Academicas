package ListasDeExercicios.Lista01.Questao03;

/* A partir do número de quilowatts consumidos, calcular o valor a ser pago de energia elétrica, sabendo-se que o valor a pagar por quilowatt é de 0,12.
Apresentar o valor total a ser pago pelo usuário acrescido de 18% de ICMS. */

public class ContaEnergia {
    private int numeroQuilowatts;

    public int getNumeroQuilowatts() {
        return numeroQuilowatts;
    }

    public void setNumeroQuilowatts(int numeroQuilowatts) {
        if(numeroQuilowatts < 0) {
            throw new IllegalArgumentException("Número de quilowatts consumidos inválido!");
        }
        this.numeroQuilowatts = numeroQuilowatts;
    }

    public double calcularValorPorQuilowatt() {
        return this.numeroQuilowatts * 0.12;
    }

    public double calcularValorTotal() {
        final double ICMS = 0.18;
        return this.calcularValorPorQuilowatt() + (this.calcularValorPorQuilowatt() * ICMS);
    }
}
