package ListasDeExercicios.Lista04.Questao04;

import java.util.ArrayList;

public class Cliente {
    private int codigo;
    private String nome;
    private ArrayList<Frete> fretes;

    public Cliente() {
        this.fretes = new ArrayList<Frete>();
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

    public ArrayList<Frete> getFretes() {
        return fretes;
    }

    public void setFretes(ArrayList<Frete> fretes) {
        if(fretes == null) {
            throw new IllegalArgumentException("Lista de fretes inválida!");
        }
        this.fretes = fretes;
    }

    public int obterQuantidadeFretes() {
        return this.fretes.size();
    }

    public void adicionarFrete(Frete frete) {
        if(frete == null || verificarFrete(frete) || verificarNumeroFrete(frete)) {
            throw new IllegalArgumentException("Frete inválido!");
        }
        this.fretes.add(frete);
    }

    public void removerFrete(Frete frete) {
        if(!verificarFrete(frete)) {
            throw new IllegalArgumentException("Frete não pertence ao cliente!");
        }
        this.fretes.remove(frete);
    }

    public boolean verificarFrete(Frete frete) {
        return this.fretes.contains(frete);
    }

    public boolean verificarNumeroFrete(Frete frete) {
        boolean estado = false;

        for (Frete item : this.fretes) {
            if(item.getNumero() == frete.getNumero()) {
                estado = true;
                break;
            }
        }
        return estado;
    }

    public ArrayList<Integer> consultarFretes() {
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        for (Frete frete : this.fretes) {
            numeros.add(frete.getNumero());
        }
        return numeros;
    }

    public ArrayList<Float> consultarValoresFretes() {
        ArrayList<Float> valores = new ArrayList<Float>();

        for (Frete frete : this.fretes) {
            valores.add(frete.calcularValor());
        }
        return valores;
    }
}
