package ListasDeExercicios.ExerciciosSurpresa.Exercicio03;

import java.util.ArrayList;

public class Curso {
    private ArrayList<Turma> turmas;
    private ArrayList<Aluno> alunos;

    public Curso() {
        this.turmas = new ArrayList<Turma>();
        this.alunos = new ArrayList<Aluno>();
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void adicionarTurma(Turma turma) {
        if(turma == null) {
            throw new IllegalArgumentException("Turma inválida!");
        }

        if(verificarTurma(turma)) {
            throw new IllegalArgumentException("Turma já cadastrada!");
        }
        this.turmas.add(turma);
    }

    public boolean verificarTurma(Turma turma) {
        return this.turmas.contains(turma);
    }

    public void removerTurma(Turma turma) {
        if(!verificarTurma(turma)) {
            throw new IllegalArgumentException("Turma não cadastrada no curso!");
        }
        this.turmas.remove(turma);
    }

    public void adicionarAluno(Aluno aluno) {
        if(aluno == null) {
            throw new IllegalArgumentException("Aluno inválido!");
        }

        if(verificarAluno(aluno)) {
            throw new IllegalArgumentException("Aluno já cadastrado!");
        }
        this.alunos.add(aluno);
    }

    public boolean verificarAluno(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public void removerAluno(Aluno aluno) {
        if(!verificarAluno(aluno)) {
            throw new IllegalArgumentException("Aluno não cadastrado no curso!");
        }
        this.alunos.remove(aluno);
    }

    public ArrayList<String> listarNomesProfessoresTurmas() {
        ArrayList<String> nomes = new ArrayList<String>();

        for(Turma turma : this.turmas) {
            nomes.add(turma.getNomeProfessor());
        }
        return nomes;
    }

    public ArrayList<ArrayList<String>> listarNomesAlunosTurmas() {
        ArrayList<ArrayList<String>> nomes = new ArrayList<ArrayList<String>>();

        for (Turma turma : this.turmas) {
            nomes.add(turma.listarNomesAlunos());
        }

        return nomes;
    }

    public ArrayList<String> listarNomesAlunosCurso() {
        ArrayList<String> nomes = new ArrayList<String>();

        for (Aluno aluno : this.alunos) {
            nomes.add(aluno.getNome());
        }
        return nomes;
    }

    public ArrayList<String> listarNomesDisciplinasTurmas() {
        ArrayList<String> nomes = new ArrayList<String>();

        for(Turma turma : this.turmas) {
            nomes.add(turma.getNomeDisciplina());
        }
        return nomes;
    }
}
