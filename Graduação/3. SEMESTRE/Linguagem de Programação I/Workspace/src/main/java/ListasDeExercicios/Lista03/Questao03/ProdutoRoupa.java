package ListasDeExercicios.Lista03.Questao03;

public class ProdutoRoupa extends Produto {
    ProdutoRoupa(String nome, float precoEtiqueta) {
        super(nome, precoEtiqueta);
    }

    @Override
    public float calcularPreco() {
        final float DESCONTO = 0.20f;
        return this.precoBase - (this.precoBase * DESCONTO);
    }
}
