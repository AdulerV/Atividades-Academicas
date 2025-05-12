package ListasDeExercicios.Lista02.Questao06;

public class Funcionario {
    private String nome;
    private String cargo;
    private float salario;
    private String departamento;

    Funcionario() {
        this.salario = 0.1f;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        if(salario <= 0) {
            throw new IllegalArgumentException("Salário inválido!");
        }
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void receberAumento(float percentual) {
        if(percentual <= 0) {
            throw new IllegalArgumentException("Percentual de aumento inválido!");
        }
        this.salario += (salario * (percentual / 100));
    }

    public void mudarDepartamento(String novoDepartamento) {
        this.departamento = novoDepartamento;
    }

    public String exibirDados() {
        return "Nome: " + this.nome + " - Cargo: " + this.cargo + " - Salário: R$ " + this.salario + " - Departamento: " + this.departamento;
    }
}
