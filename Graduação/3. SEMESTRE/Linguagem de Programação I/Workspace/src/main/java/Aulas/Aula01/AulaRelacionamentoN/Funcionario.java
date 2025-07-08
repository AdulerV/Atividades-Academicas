package Aulas.Aula01.AulaRelacionamentoN;

public abstract class Funcionario {
    protected String nome;
    protected float salarioInicial;
    protected Departamento departamento;

    public float getSalarioInicial() {
        return salarioInicial;
    }

    public void setSalarioInicial(float salarioInicial) {
        if(salarioInicial <= 0) {
            throw new IllegalArgumentException("Salário inválido!");
        }
        this.salarioInicial = salarioInicial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Não é permitido nome vazio!");
        }
        this.nome = nome.trim();
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public abstract float calcularSalario();
}
