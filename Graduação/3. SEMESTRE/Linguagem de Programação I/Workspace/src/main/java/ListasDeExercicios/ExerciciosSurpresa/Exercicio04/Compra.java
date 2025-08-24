package ListasDeExercicios.ExerciciosSurpresa.Exercicio04;

public class Compra extends Transacao {
    private Integer precoUnit;
    private Fornecedor fornecedor;

    public Compra(String dataTransacao, Produto produto, Fornecedor fornecedor, int qtdeCompra, Integer precoUnit) {
        super(dataTransacao, produto, qtdeCompra);
        setFornecedor(fornecedor);
        setPrecoUnit(precoUnit);
    }

    public Integer getPrecoUnit() {
        return precoUnit;
    }

    public void setPrecoUnit(Integer precoUnit) {
        if(precoUnit <= 0) {
            throw new IllegalArgumentException("Preço unitário inválido!");
        }
        this.precoUnit = precoUnit;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        if(fornecedor == null) {
            throw new IllegalArgumentException("Fornecedor inválido!");
        }
        this.fornecedor = fornecedor;
    }

    public boolean comprar(Produto produto, int qtdeCompra) {
        if(produto.verificarEstoqueExcedente(qtdeCompra)) {
            System.out.println("Estoque excedente.");
            return false;
        } else {
            produto.creditarEstoque(qtdeCompra);
            return true;
        }
    }
}
