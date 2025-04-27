package ListasDeExercicios.Lista01.Questao02;

public class Funcionario {
    private float salarioBruto;
    private float valorHorasExtras;
    private int numeroHorasExtras;

    public float getSalarioBruto() {
        return this.salarioBruto;
    }

    public void setSalario(float salarioBruto) {
        if(salarioBruto < 0) {
            throw new IllegalArgumentException("Salário bruto inválido!");
        }
        this.salarioBruto = salarioBruto;
    }

    public float getValorHorasExtras() {
        return this.valorHorasExtras;
    }

    public void setValorHorasExtras(float valorHorasExtras) {
        if(valorHorasExtras < 0) {
            throw new IllegalArgumentException("Valor das horas extras inválido!");
        }
        this.valorHorasExtras = valorHorasExtras;
    }

    public int getNumeroHorasExtras() {
        return this.numeroHorasExtras;
    }

    public void setNumeroHorasExtras(int numeroHorasExtras) {
        if(numeroHorasExtras < 0) {
            throw new IllegalArgumentException("Número de horas extras inválido!");
        }
        this.numeroHorasExtras = numeroHorasExtras;
    }

    public float calcularHorasExtras() {
        return this.valorHorasExtras * this.numeroHorasExtras;
    }

    public float calcularSalarioLiquido() {
        final float INSS = 0.08f;
        float salarioLiquido = this.salarioBruto + this.calcularHorasExtras();
        return salarioLiquido - (salarioLiquido * INSS);
    }
}
