package ListasDeExercicios.Lista03.Questao03;

public class ProdutoLivro extends Produto {
    ProdutoLivro(String nome, float precoCapa) {
        super(nome, precoCapa);
    }

    @Override
    public float calcularPreco() {
        final float DESCONTO = 0.05f;
        return this.precoBase - (this.precoBase * DESCONTO);
    }
}
