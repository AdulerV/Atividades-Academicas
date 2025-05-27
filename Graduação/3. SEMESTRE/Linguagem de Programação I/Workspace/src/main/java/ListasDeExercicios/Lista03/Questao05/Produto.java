package ListasDeExercicios.Lista03.Questao05;

public abstract class Produto {
    protected String nome;
    protected float precoUnitario;
    protected int quantidadeEstoque;

    Produto(String nome, float precoUnitario, int quantidadeEstoque) {
        setNome(nome);
        setPrecoUnitario(precoUnitario);
        setQuantidadeEstoque(quantidadeEstoque);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome vazio não é permitido!");
        }
        this.nome = nome.trim();
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        if(precoUnitario < 0) {
            throw new IllegalArgumentException("Preço unitário inválido!");
        }
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if(quantidadeEstoque < 0) {
            throw new IllegalArgumentException("Quantidade em estoque inválida!");
        }
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void comprarProduto(int quantidadeComprada) {
        if (quantidadeComprada <= 0) {
            throw new IllegalArgumentException("Quantidade a comprar inválida!");
        }

        if(quantidadeComprada > this.quantidadeEstoque) {
            throw new IllegalArgumentException("Quantidade a comprar maior que saldo atual!");
        }

        this.quantidadeEstoque -= quantidadeComprada;
    }

    public abstract float calcularPrecoTotal();
}
