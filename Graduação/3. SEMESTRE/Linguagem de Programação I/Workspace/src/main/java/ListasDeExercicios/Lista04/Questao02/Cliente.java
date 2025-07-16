package ListasDeExercicios.Lista04.Questao02;

import java.util.ArrayList;

public class Cliente {
    private int codigo;
    private String nome;
    private ArrayList<ContaBancaria> contasBancarias;

    public Cliente() {
        this.contasBancarias = new ArrayList<ContaBancaria>();
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

    public ArrayList<ContaBancaria> getContaBancarias() {
        return contasBancarias;
    }

    public void setContaBancarias(ArrayList<ContaBancaria> contasBancarias) {
        if(contasBancarias == null) {
            throw new IllegalArgumentException("Lista de contas bancárias inválida!");
        }
        this.contasBancarias = contasBancarias;
    }

    public int getNumeroContasBancarias() {
        return this.contasBancarias.size();
    }

    public void adicionarContaBancaria(ContaBancaria contaBancaria) {
        if(contaBancaria == null || verificarContaBancaria(contaBancaria) || verificarNumeroContaBancaria(contaBancaria)) {
            throw new IllegalArgumentException("Conta bancária inválida!");
        }
        this.contasBancarias.add(contaBancaria);
    }

    public void removerContaBancaria(ContaBancaria contaBancaria) {
        if(!verificarContaBancaria(contaBancaria)) {
            throw new IllegalArgumentException("Conta bancária não pertence ao cliente!");
        }
        this.contasBancarias.remove(contaBancaria);
    }

    public boolean verificarContaBancaria(ContaBancaria contaBancaria) {
        return this.contasBancarias.contains(contaBancaria);
    }

    public boolean verificarNumeroContaBancaria(ContaBancaria contaBancaria) {
        boolean estado = false;

        for (ContaBancaria conta: this.contasBancarias) {
            if(conta.getNumero() == contaBancaria.getNumero()) {
                estado = true;
                break;
            }
        }
        return estado;
    }


    public ArrayList<Integer> consultarContasBancarias() {
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        for (ContaBancaria contaBancaria : this.contasBancarias) {
            numeros.add(contaBancaria.getNumero());
        }
        return numeros;
    }

    public ArrayList<Float> consultarSaldosContasBancarias() {
        ArrayList<Float> saldos = new ArrayList<Float>();

        for (ContaBancaria contaBancaria : this.contasBancarias) {
            saldos.add(contaBancaria.calcularSaldo());
        }
        return saldos;
    }
}
