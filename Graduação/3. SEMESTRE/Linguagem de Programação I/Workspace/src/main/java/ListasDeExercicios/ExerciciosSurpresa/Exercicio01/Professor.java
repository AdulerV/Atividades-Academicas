package ListasDeExercicios.ExerciciosSurpresa.Exercicio01;

public class Professor extends Pessoa {
    private String titulacao;

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        if(titulacao.isEmpty()) {
            throw new IllegalArgumentException("Não é permitida titulação vazia!");
        }
        this.titulacao = titulacao;
    }

    public String exibirDados() {
        return "Nome: " + this.getNome() + " - Titulação: " + this.getTitulacao();
    }
}
