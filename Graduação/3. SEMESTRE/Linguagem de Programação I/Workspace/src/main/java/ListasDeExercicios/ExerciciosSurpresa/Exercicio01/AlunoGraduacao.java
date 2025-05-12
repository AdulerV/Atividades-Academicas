package ListasDeExercicios.ExerciciosSurpresa.Exercicio01;

public class AlunoGraduacao extends Aluno {
    public boolean verificarAprovacao() {
        return this.calcularMedia() >= 7;
    }

    public String exibirDados() {
        return "Nome: " + this.getNome() + " - Matrícula: " + this.getMatricula() + " - Aprovação: " + ((this.verificarAprovacao()) ? "Aprovado" : "Reprovado");
    }
}
