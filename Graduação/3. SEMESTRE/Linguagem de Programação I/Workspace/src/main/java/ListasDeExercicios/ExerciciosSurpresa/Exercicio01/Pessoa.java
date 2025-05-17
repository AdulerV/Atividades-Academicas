package ListasDeExercicios.ExerciciosSurpresa.Exercicio01;

public abstract class Pessoa {
    private String nome;

    Pessoa(String nome) {
        setNome(nome);
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

    public abstract String exibirDados();
}
