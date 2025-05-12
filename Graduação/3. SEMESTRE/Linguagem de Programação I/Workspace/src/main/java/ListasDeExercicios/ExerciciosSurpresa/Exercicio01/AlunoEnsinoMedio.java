package ListasDeExercicios.ExerciciosSurpresa.Exercicio01;

public class AlunoEnsinoMedio extends Aluno {
    public boolean verificarAprovacao() {
        return this.calcularMedia() >= 6;
    }

    public String exibirDados() {
        return "Nome: " + this.getNome() + " - Matrícula: " + this.getMatricula() + " - Aprovação: " + ((this.verificarAprovacao()) ? "Aprovado" : "Reprovado");
    }
}