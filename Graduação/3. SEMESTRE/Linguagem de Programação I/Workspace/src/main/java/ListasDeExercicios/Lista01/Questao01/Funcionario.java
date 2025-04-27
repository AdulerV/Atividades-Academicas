package ListasDeExercicios.Lista01.Questao01;

public class Funcionario {
    private float salarioInicial;
    private float porcentagemAumento;

    public void setSalario(float salarioInicial) {
        if(salarioInicial < 0) {
            throw new IllegalArgumentException("Salário inicial inválido!");
        }
        this.salarioInicial = salarioInicial;
    }

    public float getSalario() {
        return this.salarioInicial;
    }

    public void setPorcentagemAumento(float porcentagemAumento) {
        if(porcentagemAumento < 0) {
            throw new IllegalArgumentException("Porcentagem de aumento inválida!");
        }
        this.porcentagemAumento = porcentagemAumento;
    }

    public float getPorcentagemAumento() {
        return this.porcentagemAumento;
    }

    public float calcularAumentoSalarial() {
        return this.salarioInicial * (this.porcentagemAumento / 100);
    }

    public float calcularNovoSalario() {
        return this.salarioInicial + calcularAumentoSalarial();
    }
}
