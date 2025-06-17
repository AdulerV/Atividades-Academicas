package ListasDeExercicios.ExerciciosSurpresa.Exercicio02;

public class Estado {
    private String nome;

    public Estado(String nome) {
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome vazio não é permitido!");
        }
        this.nome = nome.trim();
    }
}
