package ListasDeExercicios.ExerciciosSurpresa.Exercicio02;

public abstract class Pessoa {
    protected String nome;
    protected Escolaridade escolaridade;
    protected Cidade naturalidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome vazio não é permitido!");
        }
        this.nome = nome.trim();
    }

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public Cidade getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(Cidade naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getNivelEscolarEscolaridade() {
        if(escolaridade == null) {
            return "Pessoa sem escolaridade";
        }
        return escolaridade.getNivelEscolar();
    }

    public String getNomeNaturalidade() {
        return naturalidade.getNome();
    }

    public String getNomeEstado() {
        return naturalidade.getNomeEstado();
    }
}
