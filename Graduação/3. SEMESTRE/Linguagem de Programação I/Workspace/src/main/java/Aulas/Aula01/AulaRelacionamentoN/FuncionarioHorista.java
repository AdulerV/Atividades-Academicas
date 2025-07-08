package Aulas.Aula01.AulaRelacionamentoN;

public class FuncionarioHorista extends Funcionario{
    private float numeroHoras;
    private int numeroDias;

    public float getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(float numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    @Override
    public float calcularSalario() {
        return this.numeroHoras * this.numeroDias * this.salarioInicial;
    }
}
