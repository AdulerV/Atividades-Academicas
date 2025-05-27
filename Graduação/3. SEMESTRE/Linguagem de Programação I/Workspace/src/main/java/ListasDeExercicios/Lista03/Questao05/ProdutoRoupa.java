package ListasDeExercicios.Lista03.Questao05;

public class ProdutoRoupa extends Produto {
    private float desconto;

    ProdutoRoupa(String nome, float precoEtiqueta, int quantidadeEstoque) {
        super(nome, precoEtiqueta, quantidadeEstoque);
        this.desconto = 0;
    }

    ProdutoRoupa(String nome, float precoEtiqueta, int quantidadeEstoque, float desconto) {
        super(nome, precoEtiqueta, quantidadeEstoque);
        setDesconto(desconto);
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        if(desconto <= 0) {
            throw new IllegalArgumentException("Desconto inválido!");
        }
        this.desconto = desconto;
    }

    public float calcularDesconto() {
         return this.precoUnitario * (this.desconto / 100);
    }

    @Override
    public float calcularPrecoTotal() {
        return (this.precoUnitario - calcularDesconto()) * this.quantidadeEstoque;
    }
}
