package ListasDeExercicios.Lista04.Questao08;

public class AlunoParcial extends Aluno{
    private float desconto;

    public AlunoParcial(Curso curso, int matricula) {
        super(curso, matricula);
    }

    public float getDesconto() {
        return this.desconto;
    }

    public void setDesconto(float desconto) {
        if(desconto <= 0 || desconto >= 50)  {
            throw new IllegalArgumentException("Desconto inválido!");
        }
        this.desconto = desconto / 100;
    }

    @Override
    public float calcularMensalidade() {
        return (this.valorMensalidade * this.numeroParcelas) - ((this.valorMensalidade * this.numeroParcelas) * this.desconto);
    }
}


