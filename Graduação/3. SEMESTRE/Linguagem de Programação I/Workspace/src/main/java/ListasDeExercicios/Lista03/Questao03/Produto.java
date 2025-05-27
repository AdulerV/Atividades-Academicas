package ListasDeExercicios.Lista03.Questao03;

public abstract class Produto {
    protected String nome;
    protected float precoBase;

    Produto(String nome, float precoBase) {
        setNome(nome);
        setPrecoBase(precoBase);
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

    public float getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(float precoBase) {
        if(precoBase <= 0) {
            throw new IllegalArgumentException("Preço base inválido!");
        }
        this.precoBase = precoBase;
    }

    public abstract float calcularPreco();
}
