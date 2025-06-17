package ListasDeExercicios.ExerciciosSurpresa.Exercicio02;

public class Aluno extends Pessoa {
    private Curso curso;

    public Aluno(String nome) {
        setNome(nome);
    }

    public Aluno(Cidade cidade) {
        setNaturalidade(cidade);
    }

    public Aluno(Curso curso) {
        setCurso(curso);
    }

    public Aluno(Escolaridade escolaridade) {
        setEscolaridade(escolaridade);
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        if(curso == null) {
            throw new IllegalArgumentException("Aluno sem curso não é permitido!");
        }
        this.curso = curso;
    }

    public String getNomeEstadoEscolaCurso() {
        return curso.getNomeEstadoEscola();
    }

    public String getNomeCoordenadorCurso() {
        return curso.getNomeCoordenador();
    }
}
