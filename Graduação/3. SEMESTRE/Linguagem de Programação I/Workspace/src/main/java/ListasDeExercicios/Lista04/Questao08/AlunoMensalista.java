package ListasDeExercicios.Lista04.Questao08;

public class AlunoMensalista extends Aluno{
    public AlunoMensalista(Curso curso, int matricula) {
        super(curso, matricula);
    }

    @Override
    public float calcularMensalidade() {
        return this.valorMensalidade * this.numeroParcelas;
    }
}
