package ListasDeExercicios.ExerciciosSurpresa.Exercicio04;

import java.util.ArrayList;

public class Produto {
    private String nome;
    private int qtdeEstoque;
    private Integer precoUnit;
    private int estoqueMinimo;
    private int estoqueMaximo;
    private ArrayList<String> historico;

    public Produto(String nome, int qtdeEstoque, Integer precoUnit, int estoqueMinimo, int estoqueMaximo) {
        setNome(nome);
        setQtdeEstoque(qtdeEstoque);
        setPrecoUnit(precoUnit);
        setEstoqueMinimo(estoqueMinimo);
        setEstoqueMaximo(estoqueMaximo);
        this.historico = new ArrayList<String>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome inválido!");
        }
        this.nome = nome.trim();
    }

    public int getQtdeEstoque() {
        return qtdeEstoque;
    }

    public void setQtdeEstoque(int qtdeEstoque) {
        if(qtdeEstoque < 0) {
            throw new IllegalArgumentException("Quantidade em estoque inválida!");
        }
        this.qtdeEstoque = qtdeEstoque;
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

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(int estoqueMinimo) {
        if(estoqueMinimo < 0 || estoqueMinimo > this.estoqueMaximo) {
            throw new IllegalArgumentException("Estoque mínimo inválido!");
        }
        this.estoqueMinimo = estoqueMinimo;
    }

    public int getEstoqueMaximo() {
        return estoqueMaximo;
    }

    public void setEstoqueMaximo(int estoqueMaximo) {
        if(estoqueMaximo < 0 || estoqueMaximo < this.estoqueMinimo) {
            throw new IllegalArgumentException("Estoque máximo inválido!");
        }
        this.estoqueMaximo = estoqueMaximo;
    }

    public ArrayList<String> getHistorico() {
        return historico;
    }

    public void setHistorico(ArrayList<String> historico) {
        this.historico = historico;
    }

    public void registrarHistorico(String transacao) {
        if(this.historico.contains(transacao)) {
            throw new IllegalArgumentException("Dados da transação já registrados!");
        }
        this.historico.add(transacao);
    }

    public void debitarEstoque(int quantidade) {
        if(quantidade <= 0 || quantidade > this.qtdeEstoque) {
            throw new IllegalArgumentException("Quantidade a ser debitada inválida!");
        }
        this.qtdeEstoque -= quantidade;
    }

    public String exibirHistorico() {
        return this.historico.toString();
    }

    public void creditarEstoque(int quantidade) {
        if(quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade a ser creditada inválida!");
        }
        this.qtdeEstoque += quantidade;
    }

    public boolean verificarEstoqueBaixo() {
        return (this.qtdeEstoque < this.estoqueMinimo);
    }

    public boolean verificarEstoqueInsuficiente(int quantidade) {
        return (quantidade > this.qtdeEstoque);
    }

    public boolean verificarEstoqueExcedente(int quantidade) {
        return ((quantidade + this.qtdeEstoque) > this.estoqueMaximo);
    }

    public float calcularValorVenda(int quantidade) {
        return this.precoUnit * quantidade;
    }

    public void vender(String dataVenda, Cliente cliente, int qtdeVendida) {
        Venda venda = new Venda(dataVenda, cliente, this, qtdeVendida);
        if(venda.vender(this, qtdeVendida)) {
            String dadosTransacao = "Data de venda: " + venda.getDataTransacao() + " | Nome do cliente: " + venda.getCliente().getNome() + " | CPF: " + venda.getCliente().getCpf() + " | Quantidade vendida: " + venda.getQtde();
            registrarHistorico(dadosTransacao);
        }
    }

    public void comprar(String dataCompra, Fornecedor fornecedor, int qtdeCompra, Integer precoUnit) {
        Compra compra = new Compra(dataCompra, this, fornecedor, qtdeCompra, precoUnit);
        if(compra.comprar(this, qtdeCompra)) {
            String dadosTransacao = "Data de compra: " + compra.getDataTransacao() + " | Nome do cliente: " + compra.getFornecedor().getNome() + " | CNPJ: " + compra.getFornecedor().getCnpj() + " | Quantidade comprada: " + compra.getQtde() + " | Preço Unitário " + compra.getPrecoUnit();
            registrarHistorico(dadosTransacao);
        }
    }
}
