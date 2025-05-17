package ListasDeExercicios.ExerciciosSurpresa.Exercicio01;

public class AlunoGraduacao extends Aluno {
    AlunoGraduacao(String nome) {
        super(nome);
    }

    public boolean verificarAprovacao() {
        return this.calcularMedia() >= 7;
    }
}
