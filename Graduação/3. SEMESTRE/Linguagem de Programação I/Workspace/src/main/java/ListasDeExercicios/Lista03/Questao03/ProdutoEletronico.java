package ListasDeExercicios.Lista03.Questao03;

public class ProdutoEletronico extends Produto {
    ProdutoEletronico(String nome, float precoVarejo) {
        super(nome, precoVarejo);
    }

    @Override
    public float calcularPreco() {
        final float DESCONTO = 0.10f;
        return this.precoBase - (this.precoBase * DESCONTO);
    }
}
