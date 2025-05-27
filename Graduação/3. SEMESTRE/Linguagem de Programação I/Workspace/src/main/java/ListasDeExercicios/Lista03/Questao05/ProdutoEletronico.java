package ListasDeExercicios.Lista03.Questao05;

public class ProdutoEletronico extends Produto {
    ProdutoEletronico(String nome, float precoUnitario, int quantidadeEstoque) {
        super(nome, precoUnitario, quantidadeEstoque);
    }

    @Override
    public float calcularPrecoTotal() {
        return this.precoUnitario * this.quantidadeEstoque;
    }
}
