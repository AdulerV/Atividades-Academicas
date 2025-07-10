package ListasDeExercicios.Lista04.Questao05A;

import java.util.ArrayList;

public class Cliente {
    private int codigo;
    private String nome;
    private ArrayList<EquipamentoMantido> equipamentos;

    public Cliente() {
        this.equipamentos = new ArrayList<EquipamentoMantido>();
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

    public ArrayList<EquipamentoMantido> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(ArrayList<EquipamentoMantido> equipamentos) {
        if(equipamentos == null) {
            throw new IllegalArgumentException("Lista de equipamentos inválida!");
        }
        this.equipamentos = equipamentos;
    }

    public int getNumeroEquipamentos() {
        return this.equipamentos.size();
    }

    public void adicionarEquipamento(EquipamentoMantido equipamento) {
        if(equipamento == null || verificarEquipamentoEmManutencao(equipamento) || verificarNumeroEquipamentoEmManutencao(equipamento)) {
            throw new IllegalArgumentException("Equipamento inválido!");
        }
        this.equipamentos.add(equipamento);
    }

    public void removerEquipamento(EquipamentoMantido equipamento) {
        if(!verificarEquipamentoEmManutencao(equipamento)) {
            throw new IllegalArgumentException("Equipamento não pertence ao cliente!");
        }
        this.equipamentos.remove(equipamento);
    }

    public boolean verificarEquipamentoEmManutencao(EquipamentoMantido equipamento) {
        return this.equipamentos.contains(equipamento);
    }

    public boolean verificarNumeroEquipamentoEmManutencao(EquipamentoMantido equipamento) {
        boolean estado = false;

        for (EquipamentoMantido item : this.equipamentos) {
            if(item.getNumeroManutencao() == equipamento.getNumeroManutencao()) {
                estado = true;
                break;
            }
        }
        return estado;
    }

    public ArrayList<Integer> consultarEquipamentosEmManutencao() {
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        for (EquipamentoMantido equipamento : this.equipamentos) {
            numeros.add(equipamento.getNumeroManutencao());
        }

        return numeros;
    }

    public ArrayList<Float> consultarValoresManutencao() {
        ArrayList<Float> valores = new ArrayList<Float>();

        for (EquipamentoMantido equipamento : this.equipamentos) {
            valores.add(equipamento.calcularValorManutencao());
        }

        return valores;
    }
}
