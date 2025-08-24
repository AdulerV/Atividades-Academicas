package ListasDeExercicios.ExerciciosSurpresa.Exercicio04;

public class Venda extends Transacao {
    private Cliente cliente;

    public Venda(String dataTransacao, Cliente cliente, Produto produto, int qtdeVendida) {
        super(dataTransacao, produto, qtdeVendida);
        setCliente(cliente);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        if(cliente == null) {
            throw new IllegalArgumentException("Cliente inválido!");
        }
        this.cliente = cliente;
    }

    public boolean vender(Produto produto, int qtdeVendida) {
        if(produto.verificarEstoqueInsuficiente(qtdeVendida)) {
            System.out.println("Estoque insuficiente.");
            return false;
        } else {
            produto.debitarEstoque(qtdeVendida);
            System.out.println("Valor venda = " + produto.calcularValorVenda(qtdeVendida));

            if(produto.verificarEstoqueBaixo()) {
                System.out.println("Estoque baixo.");
            }
        }
        return true;
    }
}
