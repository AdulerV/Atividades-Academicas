package ListasDeExercicios.Lista03.Questao05;

public class ProdutoAlimento extends Produto {
    ProdutoAlimento(String nome, float precoQuilo, int quantidadeQuilos) {
        super(nome, precoQuilo, quantidadeQuilos);
    }

    @Override
    public float calcularPrecoTotal() {
        return this.precoUnitario * this.quantidadeEstoque;
    }
}
