package ListasDeExercicios.Lista03.Questao02;

public abstract class Funcionario {
    protected float salarioMensal;

    Funcionario(float salarioMensal) {
        setSalarioMensal(salarioMensal);
    }

    public float getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(float salarioMensal) {
        if(salarioMensal <= 0) {
            throw new IllegalArgumentException("Salário mensal inválido!");
        }
        this.salarioMensal = salarioMensal;
    }

    public abstract float calcularPagamento();
}
