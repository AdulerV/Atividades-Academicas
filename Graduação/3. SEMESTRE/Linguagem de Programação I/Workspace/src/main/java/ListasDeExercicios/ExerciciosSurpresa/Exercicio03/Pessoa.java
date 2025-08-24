package ListasDeExercicios.ExerciciosSurpresa.Exercicio03;

public abstract class Pessoa {
    protected String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome inválido!");
        }
        this.nome = nome.trim();
    }
}
