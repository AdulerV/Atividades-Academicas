package ListasDeExercicios.Lista03.Questao02;

public class Diretor extends Funcionario {
    private float participacaoLucros;

    Diretor(float salarioMensal, float percentualParticipacao, float lucroEmpresa) {
        super(salarioMensal);
        setParticipacaoLucros(percentualParticipacao, lucroEmpresa);
    }

    public float getParticipacaoLucros() {
        return participacaoLucros;
    }

    public void setParticipacaoLucros(float percentualParticipacao, float lucroEmpresa) {
        if(percentualParticipacao <= 0) {
            throw new IllegalArgumentException("Percentual de participação nos lucros inválido!");
        }

        if(lucroEmpresa <= 0) {
            throw new IllegalArgumentException("Lucro da empresa inválido!");
        }

        this.participacaoLucros = (lucroEmpresa * (percentualParticipacao / 100));
    }

    @Override
    public float calcularPagamento() {
        return this.salarioMensal + this.participacaoLucros;
    }
}
