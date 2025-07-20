package Exemplos.Questao05B;

import java.util.ArrayList;

public class Cliente {
    private int codigo;
    private String nome;
    private ArrayList<Manutencao> manutencoes;

    public Cliente() {
        this.manutencoes = new ArrayList<Manutencao>();
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

    public ArrayList<Manutencao> getManutencoes() {
        return manutencoes;
    }

    public void setManutencoes(ArrayList<Manutencao> manutencoes) {
        if(this.manutencoes == null) {
            throw new IllegalArgumentException("Lista de manutencoes inválida!");
        }
        this.manutencoes = manutencoes;
    }

    public int getNumeroManutencoes() {
        return this.manutencoes.size();
    }

    public void adicionarManutencao(Manutencao manutencao) {
        if(manutencao == null || verificarManutencao(manutencao) || verificarNumeroManutencao(manutencao)) {
            throw new IllegalArgumentException("Manutenção inválido!");
        }
        this.manutencoes.add(manutencao);
    }

    public void removerManutencao(Manutencao manutencao) {
        if(!verificarManutencao(manutencao)) {
            throw new IllegalArgumentException("Manutenção não pertence ao cliente!");
        }
        this.manutencoes.remove(manutencao);
    }

    public boolean verificarManutencao(Manutencao manutencao) {
        return this.manutencoes.contains(manutencao);
    }

    public boolean verificarNumeroManutencao(Manutencao manutencao) {
        boolean estado = false;

        for (Manutencao item : this.manutencoes) {
            if(item.getNumeroManutencao() == manutencao.getNumeroManutencao()) {
                estado = true;
                break;
            }
        }
        return estado;
    }

    public ArrayList<Integer> consultarManutencoes() {
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        for (Manutencao manutencao : this.manutencoes) {
            numeros.add(manutencao.getNumeroManutencao());
        }

        return numeros;
    }

    public ArrayList<Float> consultarValoresManutencoes() {
        ArrayList<Float> valores = new ArrayList<Float>();

        for (Manutencao manutencao : this.manutencoes) {
            valores.add(manutencao.obterValor());
        }

        return valores;
    }
}
