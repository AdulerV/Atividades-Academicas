package Exemplos.Associacao;

public class Aluno extends Pessoa {
    private Curso curso;

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getNomeEstadoEstudado(){
        return getCurso().getNomeEstado();
    }

    public String getNomeCoordenadorCurso() {
        return getCurso().getNomeCoordenacao();
    }
}

