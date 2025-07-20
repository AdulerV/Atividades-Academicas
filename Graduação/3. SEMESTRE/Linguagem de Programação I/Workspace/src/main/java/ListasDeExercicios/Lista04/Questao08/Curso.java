package ListasDeExercicios.Lista04.Questao08;

import java.util.ArrayList;

public class Curso {
    private int codigo;
    private String descricao;
    private float cargaHoraria;
    private ArrayList<Aluno> alunos;

    public Curso() {
        this.alunos = new ArrayList<Aluno>();
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        if (codigo <= 0) {
            throw new IllegalArgumentException("Código inválido!");
        }
        this.codigo = codigo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("Descrição inválida!");
        }
        this.descricao = descricao.trim();
    }

    public float getCargaHoraria() {
        return this.cargaHoraria;
    }

    public void setCargaHoraria(float cargaHoraria) {
        if (cargaHoraria <= 0) {
            throw new IllegalArgumentException("Carga horária inválida!");
        }
        this.cargaHoraria = cargaHoraria;
    }

    public ArrayList<Aluno> getAlunos() {
        return this.alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public int obterQuantidadeAlunos() {
        return this.alunos.size();
    }

    public void adicionarAluno(Aluno aluno) {
        if(aluno == null || verificarAluno(aluno) || verificarMatriculaAluno(aluno)) {
            throw new IllegalArgumentException("Aluno inválido!");
        }
        this.alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        if(!verificarAluno(aluno)) {
            throw new IllegalArgumentException("Aluno não está matriculado no curso!");
        }
        this.alunos.remove(aluno);
    }

    public boolean verificarAluno(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public boolean verificarMatriculaAluno(Aluno aluno) {
        boolean estado = false;

        for (Aluno elemento : this.alunos) {
            if(elemento.getMatricula() == aluno.getMatricula()) {
                estado = true;
                break;
            }
        }
        return estado;
    }

    public ArrayList<Integer> consultarAlunosPorMatricula() {
        ArrayList<Integer> matriculas = new ArrayList<Integer>();
        for (Aluno aluno : this.alunos) {
            matriculas.add(aluno.getMatricula());
        }
        return matriculas;
    }

    public ArrayList<String> consultarAlunosPorNome() {
        ArrayList<String> nomes = new ArrayList<String>();
        for (Aluno aluno : this.alunos) {
            nomes.add(aluno.getNome());
        }
        return nomes;
    }

    public ArrayList<String> consultarAlunosPorEndereco() {
        ArrayList<String> enderecos = new ArrayList<String>();
        for (Aluno aluno : this.alunos) {
            enderecos.add(aluno.getEndereco());
        }
        return enderecos;
    }

    public ArrayList<Curso> consultarAlunosPorCurso() {
        ArrayList<Curso> cursos = new ArrayList<Curso>();
        for (Aluno aluno : this.alunos) {
            cursos.add(aluno.getCurso());
        }
        return cursos;
    }

    public ArrayList<Integer> consultarAlunosPorNumeroParcelas() {
        ArrayList<Integer> numeroParcelas = new ArrayList<Integer>();
        for (Aluno aluno : this.alunos) {
            numeroParcelas.add(aluno.getNumeroParcelas());
        }
        return numeroParcelas;
    }

    public ArrayList<Float> consultarAlunosPorValorMensalidade() {
        ArrayList<Float> valorMensalidade = new ArrayList<Float>();
        for (Aluno aluno : this.alunos) {
            valorMensalidade.add(aluno.getValorMensalidade());
        }
        return valorMensalidade;
    }
}
