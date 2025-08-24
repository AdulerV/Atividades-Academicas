package ListasDeExercicios.ExerciciosSurpresa.Exercicio04;

public class Cliente extends Pessoa {
    private int cpf;

    public Cliente(String nome, int cpf) {
        super(nome);
        setCpf(cpf);
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        if(cpf < 0) {
            throw new IllegalArgumentException("CPF inválido!");
        }
        this.cpf = cpf;
    }
}
