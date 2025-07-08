package Exemplos.Associacao;

public class Pessoa {
    private String nome;
    private Escolaridade escolaridade;
    private Cidade naturalidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cidade getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(Cidade naturalidade) {
        this.naturalidade = naturalidade;
    }

    public Escolaridade getEscolaridade() {
        return this.escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getNomeEscolaridade() {
        if (this.escolaridade == null) {
            return "Pessoa sem escolaridade";
        }
        else {
            return this.escolaridade.getNome();
        }
    }

    public String getNomeNaturalidade(){
        return getNaturalidade().getNome();
    }

    public String getNomeEstadoNaturalidade(){
        return getNaturalidade().getNomeEstado();
    }
}
