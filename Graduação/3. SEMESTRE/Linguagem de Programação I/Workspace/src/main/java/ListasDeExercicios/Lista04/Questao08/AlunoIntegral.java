package ListasDeExercicios.Lista04.Questao08;

public class AlunoIntegral extends Aluno{
    public AlunoIntegral(Curso curso, int matricula) {
        super(curso, matricula);
    }

    @Override
    public float calcularMensalidade() {
        return this.numeroParcelas;
    }
}
