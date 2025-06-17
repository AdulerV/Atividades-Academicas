package ListasDeExercicios.ExerciciosSurpresa.Exercicio02;

public class Professor extends Pessoa {
    private Curso contratacao;

    public Professor(String nome) {
        setNome(nome);
    }

    public Professor(Escolaridade escolaridade) {
        setEscolaridade(escolaridade);
    }

    public Professor(Curso contratacao) {
        setContratacao(contratacao);
    }

    public Professor(String nome, Escolaridade escolaridade, Cidade naturalidade) {
        setNome(nome);
        setEscolaridade(escolaridade);
        setNaturalidade(naturalidade);
    }

    @Override
    public void setEscolaridade(Escolaridade escolaridade) {
        if(escolaridade == null) {
            throw new IllegalArgumentException("Professor sem escolaridade não é permitido!");
        }

        String nivelEscolar = escolaridade.getNivelEscolar();

        if (!nivelEscolar.equals("ensino superior incompleto") && !nivelEscolar.equals("bacharelado") && !nivelEscolar.equals("licenciatura") && !nivelEscolar.equals("tecnólogo") &&  !nivelEscolar.equals("especialização") &&  !nivelEscolar.equals("mba") && !nivelEscolar.equals("mestrado") && !nivelEscolar.equals("doutorado"))
        {
            throw new IllegalArgumentException("Escolaridade inválida!");
        }

        this.escolaridade = escolaridade;
    }

    public Curso getContratacao() {
        return contratacao;
    }

    public void setContratacao(Curso contratacao) {
        this.contratacao = contratacao;
    }

    @Override
    public String getNivelEscolarEscolaridade() {
        return escolaridade.getNivelEscolar();
    }

    public String getNomeTipoEnsinoCurso() {
        return contratacao.getNomeTipoEnsino();
    }

    public String getNomeDiretorEscola() {
        return contratacao.getNomeDiretor();
    }

    public String getNomeCoordenadorCurso() {
        return contratacao.getNomeCoordenador();
    }
}
