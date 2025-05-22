package ListasDeExercicios.Lista03.Questao02;

public class Gerente extends Funcionario {
    private float bonusFixo;

    Gerente(float salarioMensal, float bonusFixo) {
        super(salarioMensal);
        setBonusFixo(bonusFixo);
    }

    public float getBonusFixo() {
        return bonusFixo;
    }

    public void setBonusFixo(float bonusFixo) {
        if(bonusFixo <= 0) {
            throw new IllegalArgumentException("Bônus fixo inválido!");
        }
        this.bonusFixo = bonusFixo;
    }

    @Override
    public float calcularPagamento() {
        return this.salarioMensal + this.bonusFixo;
    }
}
