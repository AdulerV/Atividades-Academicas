package ListasDeExercicios.Lista04.Questao06;

import java.util.ArrayList;

public class Cliente {
    private int codigo;
    private String nome;
    private ArrayList<Vaga> vagas;

    public Cliente() {
        this.vagas = new ArrayList<Vaga>();
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

    public ArrayList<Vaga> getVagas() {
        return vagas;
    }

    public void setVagas(ArrayList<Vaga> vagas) {
        if (vagas == null) {
            throw new IllegalArgumentException("Lista de vagas inválida!");
        }
        this.vagas = vagas;
    }

    public int obterQuantidadeVagas() {
        return this.vagas.size();
    }

    public void adicionarVaga(Vaga vaga) {
        if (vaga == null || verificarVaga(vaga) || verificarNumeroVaga(vaga)) {
            throw new IllegalArgumentException("Vaga inválida!");
        }
        this.vagas.add(vaga);
    }

    public void removerVaga(Vaga vaga) {
        if (!verificarVaga(vaga)) {
            throw new IllegalArgumentException("Vaga não pertence ao cliente!");
        }
        this.vagas.remove(vaga);
    }

    public boolean verificarVaga(Vaga vaga) {
        return this.vagas.contains(vaga);
    }

    public boolean verificarNumeroVaga(Vaga vaga) {
        boolean estado = false;

        for (Vaga item : this.vagas) {
            if(item.getNumero() == vaga.getNumero()) {
                estado = true;
                break;
            }
        }
        return estado;
    }

    public ArrayList<Integer> consultarVagas() {
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        for (Vaga vaga : this.vagas) {
            numeros.add(vaga.getNumero());
        }
        return numeros;
    }

    public ArrayList<Float> consultarValoresVagas() {
        ArrayList<Float> valores = new ArrayList<Float>();

        for (Vaga vaga : this.vagas) {
            valores.add(vaga.calcularValor());
        }
        return valores;
    }

    public float calcularValorTotalVagas() {
        float soma = 0;

        for (Vaga vaga : this.vagas) {
            soma += vaga.calcularValor();
        }
        return soma;
    }
}
