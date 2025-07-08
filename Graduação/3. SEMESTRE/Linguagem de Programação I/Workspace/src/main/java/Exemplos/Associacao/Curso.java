package Exemplos.Associacao;

public class Curso {
    private String nome;
    private Professor coordenacao;
    private Escola escola;
    private TipoEnsino tipoEnsino;

    public TipoEnsino getTipoEnsino() {
        return tipoEnsino;
    }

    public void setTipoEnsino(TipoEnsino tipoEnsino) {
        this.tipoEnsino = tipoEnsino;
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }

    public Professor getCoordenacao() {
        return coordenacao;
    }

    public void setCoordenacao(Professor coordenacao) {
        this.coordenacao = coordenacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeEscolaridadeCoordenador () {
        return this.coordenacao.getNomeEscolaridade();
    }

    public String getNomeEstado(){
        return getEscola().getNomeEstado();
    }

    public String getNomeTipoEnsino() {
        return getTipoEnsino().getTipo();
    }

    public String getNomeCoordenacao() {
        return getCoordenacao().getNome();
    }

    public String getNomeDirecao() {
        return getEscola().getNomeDirecao();
    }
}
