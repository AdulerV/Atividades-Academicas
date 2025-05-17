package ListasDeExercicios.ExerciciosSurpresa.Exercicio01;

public class AlunoEnsinoMedio extends Aluno {
    AlunoEnsinoMedio(String nome) {
        super(nome);
    }

    public boolean verificarAprovacao() {
        return this.calcularMedia() >= 6;
    }
}