package ListasDeExercicios.Lista02.Questao05;

public class Produto {
    private String nome;
    private float preco;
    private int quantidadeEstoque;
    private String categoria;

    Produto() {
<<<<<<< Updated upstream
        this.quantidadeEstoque = 0;
        this.preco = 0;
=======
        this.preco = 0;
        this.quantidadeEstoque = 0;
>>>>>>> Stashed changes
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        if(preco < 0) {
            throw new IllegalArgumentException("Preço inválido!");
        }
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if(quantidadeEstoque < 0) {
            throw new IllegalArgumentException("Quantidade de estoque inválida!");
        }
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void adicionarEstoque(int quantidade) {
        if(quantidade < 0) {
            throw new IllegalArgumentException("Quantidade inválida!");
        }
        this.quantidadeEstoque += quantidade;
    }

    public void removerEstoque(int quantidade) {
        if(quantidade <= 0 || quantidade > this.quantidadeEstoque) {
            throw new IllegalArgumentException("Quantidade inválida ou estoque insuficiente!");
        }
        this.quantidadeEstoque -= quantidade;
    }

    public void aplicarDesconto(float percentual) {
        if(percentual <= 0) {
            throw new IllegalArgumentException("Percentual inválido!");
        }
        this.preco -= (this.preco * (percentual / 100));
    }

    public String exibirDados() {
        return "Nome: " + this.nome + " - Preço: " + this.preco + " - Estoque: " + this.quantidadeEstoque + " - Categoria: " + this.categoria;
    }
}
