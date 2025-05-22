package ListasDeExercicios.Lista03.Questao02;

public class FuncionariosComum extends Funcionario {
    FuncionariosComum(float salarioMensal) {
        super(salarioMensal);
    }

    @Override
    public float calcularPagamento() {
        return this.salarioMensal;
    }
}
