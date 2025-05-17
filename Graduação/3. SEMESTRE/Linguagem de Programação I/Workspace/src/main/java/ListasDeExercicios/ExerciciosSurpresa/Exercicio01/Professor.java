package ListasDeExercicios.ExerciciosSurpresa.Exercicio01;

public class Professor extends Pessoa {
    private String titulacao;

    Professor(String nome) {
        super(nome);
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        if(titulacao.trim().isEmpty()) {
            throw new IllegalArgumentException("Não é permitido titulação vazia!");
        }
        this.titulacao = titulacao.trim();
    }

    public String exibirDados() {
        return "Nome: " + this.getNome() + " - Titulação: " + this.getTitulacao();
    }
}
