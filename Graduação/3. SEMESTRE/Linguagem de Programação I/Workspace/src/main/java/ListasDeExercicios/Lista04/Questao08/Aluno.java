package ListasDeExercicios.Lista04.Questao08;

public abstract class Aluno {
    protected int matricula;
    protected String nome;
    protected String endereco;
    protected Curso curso;
    protected int numeroParcelas;
    protected float valorMensalidade;

    public Aluno(Curso curso, int matricula) {
        setCurso(curso);
       setMatricula(matricula);
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        if(matricula <= 0) {
            throw new IllegalArgumentException("Matrícula inválida!");
        }
        this.matricula = matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if(nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Não é permitido nome vazio!");
        }
        this.nome = nome.trim();
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        if(endereco.trim().isEmpty()) {
            throw new IllegalArgumentException("Não é permitido endereço vazio!");
        }
        this.endereco = endereco.trim();
    }

    public Curso getCurso() {
        return this.curso;
    }

    public void setCurso(Curso curso) {
        if(curso == null) {
            throw new IllegalArgumentException("O aluno deve obrigatoriamente ter um curso!");
        }
        this.curso = curso;
    }

    public int getNumParcelas() {
        return this.numeroParcelas;
    }

    public void setNumParcelas(int numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }

    public float getValorMensalidade() {
        return this.valorMensalidade;
    }

    public void setValorMensalidade(float valorMensalidade) {
        this.valorMensalidade = valorMensalidade;
    }

    public abstract float calcularMensalidade();
}
