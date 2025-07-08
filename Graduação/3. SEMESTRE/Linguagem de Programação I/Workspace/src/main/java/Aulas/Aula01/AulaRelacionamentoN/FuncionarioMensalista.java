package Aulas.Aula01.AulaRelacionamentoN;

public class FuncionarioMensalista extends Funcionario {
    @Override
    public float calcularSalario() {
        return this.salarioInicial;
    }
}
