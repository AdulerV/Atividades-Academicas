package ListasDeExercicios.ExerciciosSurpresa.Exercicio03;

import java.util.ArrayList;

public class Turma {
    private Professor professor;
    private ArrayList<Aluno> alunos;
    private Disciplina disciplina;

    public Turma() {
        this.alunos = new ArrayList<Aluno>();
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public String getNomeProfessor() { return this.professor.getNome(); }

    public String getNomeDisciplina() { return this.disciplina.getNome(); }

    public void adicionarAluno(Aluno aluno) {
        if(aluno == null) {
            throw new IllegalArgumentException("Aluno inválido!");
        }

        if(verificarAluno(aluno)) {
            throw new IllegalArgumentException("Aluno já cadastrado!");
        }
        this.alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        if(!verificarAluno(aluno)) {
            throw new IllegalArgumentException("Aluno não cadastrado na turma!");
        }
        this.alunos.remove(aluno);
    }

    public boolean verificarAluno(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public ArrayList<String> listarNomesAlunos() {
        ArrayList<String> nomes = new ArrayList<String>();

        for (Aluno aluno : this.alunos) {
            nomes.add(aluno.getNome());
        }
        return nomes;
    }
}
