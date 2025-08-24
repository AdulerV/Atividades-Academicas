package ListasDeExercicios.ExerciciosSurpresa.Exercicio03;

public class Disciplina {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome da disciplina inválido!");
        }
        this.nome = nome.trim();
    }
}
