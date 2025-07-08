package Aulas.Aula01.AulaRelacionamentoN;

public class FuncionarioDiarista extends Funcionario {
    private int numeroDias;

    @Override
    public float calcularSalario() {
        return this.numeroDias * this.salarioInicial;
    }
}
