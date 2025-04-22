package Exemplos.Aluno;

public class Aluno {
    private int matricula;
    private String nome;
    private double nota1;
    private double nota2;

    public Aluno(double nota1, double nota2) {
        if(verificarNota(nota1) && verificarNota(nota2)) {
            setNota1(nota1);
            setNota2(nota2);
        } else {
            throw new RuntimeException("Notas inválidas!");
        }
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return this.nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return this.nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public boolean verificarNota(double nota) {
        if(nota >= 0 && nota <= 10) {
            return true;
        }
        return false;
    }

    public double somarNotas() {
        return this.nota1 + this.nota2;
    }
}
