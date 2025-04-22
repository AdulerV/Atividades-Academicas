package ListasDeExercicios.Lista01.Questao02;

/* Calcular o salário líquido do funcionário sabendo que este é constituído pelo salário bruto mais o valor das horas extras subtraindo 8% de INSS do total.
Serão informados nesse problema o salário bruto, o valor das horas extras e o número de horas extras. Apresentar ao final o salário líquido. */

public class Funcionario {
    private double salarioBruto;
    private double valorHorasExtras;
    private int numeroHorasExtras;

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalario(double salarioBruto) {
        if(salarioBruto < 0) {
            throw new IllegalArgumentException("Salário bruto inválido!");
        }
        this.salarioBruto = salarioBruto;
    }

    public double getValorHorasExtras() {
        return valorHorasExtras;
    }

    public void setValorHorasExtras(double valorHorasExtras) {
        if(valorHorasExtras < 0) {
            throw new IllegalArgumentException("Valor das horas extras inválido!");
        }
        this.valorHorasExtras = valorHorasExtras;
    }

    public int getNumeroHorasExtras() {
        return numeroHorasExtras;
    }

    public void setNumeroHorasExtras(int numeroHorasExtras) {
        if(numeroHorasExtras < 0) {
            throw new IllegalArgumentException("Número de horas extras inválido!");
        }
        this.numeroHorasExtras = numeroHorasExtras;
    }

    public double calcularHorasExtras() {
        return this.valorHorasExtras * this.numeroHorasExtras;
    }

    public double calcularSalarioLiquido() {
        final double INSS = 0.08;
        double salarioLiquido = this.salarioBruto + this.calcularHorasExtras();
        return salarioLiquido - (salarioLiquido * INSS);
    }
}
