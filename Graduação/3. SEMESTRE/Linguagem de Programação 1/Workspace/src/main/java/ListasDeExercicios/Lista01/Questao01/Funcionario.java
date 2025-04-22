package ListasDeExercicios.Lista01.Questao01;

/* Calcular o aumento que será dado a um funcionário, a partir do salário atual e a porcentagem de aumento.
Apresentar o novo valor do salário e o valor do aumento. */

public class Funcionario {
    private double salario;
    private double porcentagemAumento;

    public void setSalario(double salarioInicial) {
        if(salarioInicial < 0) {
            throw new IllegalArgumentException("Salário inicial inválido!");
        }
        this.salario = salarioInicial;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setPorcentagemAumento(double porcentagemAumento) {
        if(porcentagemAumento < 0) {
            throw new IllegalArgumentException("Porcentagem de aumento inválida!");
        }
        this.porcentagemAumento = porcentagemAumento;
    }

    public double getPorcentagemAumento() {
        return this.porcentagemAumento;
    }

    public double calcularAumentoSalarial() {
        return this.salario * (this.porcentagemAumento / 100);
    }

    public void aumentarSalario() {
        this.salario += calcularAumentoSalarial();
    }
}
