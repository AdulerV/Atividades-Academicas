package Aulas.Aula01.AulaRelacionamentoN;

import java.util.ArrayList;

public class Departamento {
    private ArrayList<Funcionario> funcionarios;

    public Departamento() {
        funcionarios = new ArrayList<Funcionario>();
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void alocarFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    public void desalocarFuncionario(Funcionario funcionario) {
        this.funcionarios.remove(funcionario);
    }

    public int quantidadeFuncionarios() {
        return this.funcionarios.size();
    }

    public boolean verificarFuncionario(Funcionario funcionario) {
        return this.funcionarios.contains(funcionario);
    }

    public boolean verificarNomeFuncionario(String nome) {
        int contador = 0;
        boolean encontrado = false;

        while (!encontrado && contador < quantidadeFuncionarios()) {
            Funcionario funcionario = this.funcionarios.get(contador);

            if(funcionario.getNome().equals(nome)) {
                encontrado = true;
            }
            contador++;
        }

        return encontrado;
    }

    public boolean verificarListaFuncionarios(ArrayList<Funcionario> lista) {
        return this.funcionarios.equals(lista);
    }
}
