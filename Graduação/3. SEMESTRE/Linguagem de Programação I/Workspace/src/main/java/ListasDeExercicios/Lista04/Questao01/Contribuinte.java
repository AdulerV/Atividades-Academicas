package ListasDeExercicios.Lista04.Questao01;

import java.util.ArrayList;

public class Contribuinte {
    private int codigo;
    private String nome;
    private ArrayList<Imovel> imoveis;

    public Contribuinte() {
        this.imoveis = new ArrayList<Imovel>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if(codigo < 0) {
            throw new IllegalArgumentException("Código inválido!");
        }
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Não é permitido nome vazio!");
        }
        this.nome = nome.trim();
    }

    public ArrayList<Imovel> getImoveis() {
        return imoveis;
    }

    public void setImoveis(ArrayList<Imovel> imoveis) {
        if(imoveis == null) {
            throw new IllegalArgumentException("Lista de imóveis inválida!");
        }
        this.imoveis = imoveis;
    }

    public int obterQuantidadeImoveis() {
        return this.imoveis.size();
    }

    public void adicionarImovel(Imovel imovel) {
        if(imovel == null || verificarImovel(imovel)) {
            throw new IllegalArgumentException("Imóvel inválido!");
        }
        this.imoveis.add(imovel);
    }

    public void removerImovel(Imovel imovel) {
        if(!verificarImovel(imovel)) {
            throw new IllegalArgumentException("Imóvel não pertence ao contribuinte!");
        }
        this.imoveis.remove(imovel);
    }

    public boolean verificarImovel(Imovel imovel) {
        return this.imoveis.contains(imovel);
    }

    public ArrayList<Float> consultarValoresImoveis() {
        ArrayList<Float> valores = new ArrayList<Float>();

        for (Imovel imovel : this.imoveis) {
            valores.add(imovel.calcularValor());
        }
        return valores;
    }

    public float calcularValorTotalImoveis() {
        float soma = 0;

        for (Imovel imovel : this.imoveis) {
            soma += imovel.calcularValor();
        }
        return soma;
    }
}


