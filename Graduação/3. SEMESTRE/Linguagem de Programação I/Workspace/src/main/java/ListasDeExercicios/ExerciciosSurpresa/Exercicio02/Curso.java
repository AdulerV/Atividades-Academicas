package ListasDeExercicios.ExerciciosSurpresa.Exercicio02;

public class Curso {
    private String nome;
    private Professor coordenacao;
    private Escola escola;
    private TipoEnsino tipoEnsino;

    public Curso(String nome) {
        setNome(nome);
    }

    public Curso(Professor coordenacao) {
        setCoordenacao(coordenacao);
    }

    public Curso(Escola escola) {
        setEscola(escola);
    }

    public Curso(TipoEnsino tipoEnsino) {
        setTipoEnsino(tipoEnsino);
    }

    public Curso(String nome, Professor coordenacao, Escola escola) {
        setEscola(escola);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome vazio não é permitido!");
        }
        this.nome = nome.trim();
    }

    public Professor getCoordenacao() {
        return coordenacao;
    }

    public void setCoordenacao(Professor coordenacao) {
        this.coordenacao = coordenacao;
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        if(escola == null) {
            throw new IllegalArgumentException("Curso sem escola não é permitido!");
        }
        this.escola = escola;
    }

    public TipoEnsino getTipoEnsino() {
        return tipoEnsino;
    }

    public void setTipoEnsino(TipoEnsino tipoEnsino) {
        this.tipoEnsino = tipoEnsino;
    }

    public String getNomeCoordenador() {
        if(coordenacao == null) {
            return "Curso sem coordenação!";
        }
        return coordenacao.getNome();
    }

    public String getNivelEscolarCoordenador() {
        if(coordenacao == null) {
            return "Curso sem coordenação!";
        }
        return coordenacao.getNivelEscolarEscolaridade();
    }

    public String getNomeEscola() {
        return escola.getNome();
    }

    public String getNomeCidadeEscola() {
        return escola.getNomeCidade();
    }

    public String getNomeEstadoEscola() {
        return escola.getNomeEstado();
    }

    public String getNomeTipoEnsino() {
        if(tipoEnsino == null) {
            return "Curso sem tipo de ensino";
        }
        return tipoEnsino.getNome();
    }

    public String getNomeDiretor() {
        return escola.getNomeDiretor();
    }
}
