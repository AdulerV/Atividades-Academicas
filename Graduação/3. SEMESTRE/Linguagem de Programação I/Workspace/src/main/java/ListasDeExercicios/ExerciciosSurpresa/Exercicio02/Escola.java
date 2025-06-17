package ListasDeExercicios.ExerciciosSurpresa.Exercicio02;

public class Escola {
    private String nome;
    private Professor direcao;
    private Cidade cidade;

    public Escola(String nome) {
        setNome(nome);
    }

    public Escola(Professor direcao) {
        setDirecao(direcao);
    }

    public Escola(Cidade cidade) {
        setCidade(cidade);
    }

    public Escola(String nome, Professor direcao, Cidade cidade) {
        setDirecao(direcao);
        setCidade(cidade);
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

    public Professor getDirecao() {
        return direcao;
    }

    public void setDirecao(Professor direcao) {
        this.direcao = direcao;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        if(cidade == null) {
            throw new IllegalArgumentException("Escola sem cidade não é permitido!");
        }
        this.cidade = cidade;
    }

    public String getNomeDiretor() {
        if(direcao == null) {
            return "Escola sem direção!";
        }
        return direcao.getNome();
    }

    public String getNivelEscolarDiretor() {
        if(direcao == null) {
            return "Escola sem direção!";
        }
        return direcao.getNivelEscolarEscolaridade();
    }

    public String getNomeCidade() {
        return cidade.getNome();
    }

    public String getNomeNaturalidade() {
        return cidade.getNome();
    }

    public String getNomeEstado() {
        return cidade.getNomeEstado();
    }
}
