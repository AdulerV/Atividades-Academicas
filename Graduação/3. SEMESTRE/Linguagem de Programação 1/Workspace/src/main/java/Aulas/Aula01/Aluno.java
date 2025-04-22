package Aulas.Aula01;

public class Aluno {

    private String nome;
    private float nota1;
    private float nota2;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota1() {
        return this.nota1;
    }

    public void setNota1(float nota1) {
        if (nota1 < 0) {
            throw new IllegalArgumentException("Nota 1 inválida");
        }
        this.nota1 = nota1;
    }

    public float getNota2() {
        return this.nota2;
    }

    public void setNota2(float nota2) {
        if (nota2 < 0) {
            throw new IllegalArgumentException("Nota 2 inválida");
        }
        this.nota2 = nota2;
    }

    public float somarNotas() {
        return this.nota1 + this.nota2;
    }

    public float calcularMedia() {
        return this.somarNotas();
    }
}
