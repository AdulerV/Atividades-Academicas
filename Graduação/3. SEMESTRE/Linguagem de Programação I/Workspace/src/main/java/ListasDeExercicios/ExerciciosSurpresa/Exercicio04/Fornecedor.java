package ListasDeExercicios.ExerciciosSurpresa.Exercicio04;

public class Fornecedor extends Pessoa {
    private int cnpj;

    public Fornecedor(String nome, int cnpj) {
        super(nome);
        setCnpj(cnpj);
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        if(cnpj < 0) {
            throw new IllegalArgumentException("CNPJ inválido!");
        }
        this.cnpj = cnpj;
    }
}
