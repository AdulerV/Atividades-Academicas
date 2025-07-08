package Exemplos.Associacao;

public class Escola {
    private String nome;
    private Professor direcao;
    private Cidade cidade;

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getDirecao() {
        return direcao;
    }

    public void setDirecao(Professor direcao) {
        this.direcao = direcao;
    }

    public String getNomeEscolaridadeDirecao(){
        return getDirecao().getNomeEscolaridade();

    }
    public String  getNomeEstado(){
        return getCidade().getNomeEstado();
    }

    public String getNomeDirecao() {
        return getDirecao().getNome();
    }
}
