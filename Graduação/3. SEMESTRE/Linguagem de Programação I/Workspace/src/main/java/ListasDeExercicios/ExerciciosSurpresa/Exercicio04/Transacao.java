package ListasDeExercicios.ExerciciosSurpresa.Exercicio04;

public abstract class Transacao {
    protected String dataTransacao;
    protected int qtde;
    protected Produto produto;

    public Transacao(String dataTransacao, Produto produto, int qtde) {
        setDataTransacao(dataTransacao);
        setProduto(produto);
        setQtde(qtde);
    }

    public String getDataTransacao() {
        return dataTransacao;
    }

    public void setDataTransacao(String dataTransacao) {
        if(dataTransacao.trim().isEmpty()) {
            throw new IllegalArgumentException("Data de transação inválida!");
        }
        this.dataTransacao = dataTransacao.trim();
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        if(qtde <= 0) {
            throw new IllegalArgumentException("Quantidade inválida!");
        }
        this.qtde = qtde;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        if(produto == null) {
            throw new IllegalArgumentException("Produto inválido!");
        }
        this.produto = produto;
    }
}
