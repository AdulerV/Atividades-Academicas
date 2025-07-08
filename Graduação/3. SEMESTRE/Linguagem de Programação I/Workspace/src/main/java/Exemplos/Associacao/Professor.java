package Exemplos.Associacao;

public class Professor extends Pessoa {
    private Curso contratacao;

    public Curso getContratacao() {
        return contratacao;
    }

    public void setContratacao(Curso contratacao) {
        this.contratacao = contratacao;
    }

    public String getTipoEnsinoMinistrado() {
        return getContratacao().getNomeTipoEnsino();
    }

    public String getNomeDiretor() {
        return getContratacao().getNomeDirecao();
    }

    public String getNomeCoordenador() {
        return getContratacao().getNomeCoordenacao();
    }
}
