package ListasDeExercicios.Lista04.Questao07;

import java.util.ArrayList;

public class Cliente {
    private int codigo;
    private String nome;
    private ArrayList<FitaEmprestada> fitas;

    public Cliente() {
        this.fitas = new ArrayList<FitaEmprestada>();
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

    public ArrayList<FitaEmprestada> getFitas() {
        return fitas;
    }

    public void setFitas(ArrayList<FitaEmprestada> fitas) {
        if(fitas == null) {
            throw new IllegalArgumentException("Lista de fitas inválida!");
        }
        this.fitas = fitas;
    }

    public int getNumeroFitasEmprestadas() {
        return this.fitas.size();
    }

    public void adicionarFitaEmprestada(FitaEmprestada fita) {
        if(fita == null || verificarFitaEmprestada(fita)) {
            throw new IllegalArgumentException("Fita inválida!");
        }
        this.fitas.add(fita);
    }

    public void removerFitaEmprestada(FitaEmprestada fita) {
        if(!verificarFitaEmprestada(fita)) {
            throw new IllegalArgumentException("Fita não pertence ao cliente!");
        }
        this.fitas.remove(fita);
    }

    public boolean verificarFitaEmprestada(FitaEmprestada fita) {
        return this.fitas.contains(fita);
    }

    public ArrayList<Float> consultarValorEmprestimosFitas() {
        ArrayList<Float> valores = new ArrayList<Float>();

        for (FitaEmprestada fita : this.fitas) {
            valores.add(fita.calcularValorEmprestimo());
        }
        return valores;
    }

    public float calcularValorTotalEmprestimos() {
        float soma = 0;

        for (FitaEmprestada fita : this.fitas) {
            soma += fita.calcularValorEmprestimo();
        }
        return soma;
    }
}
