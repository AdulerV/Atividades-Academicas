package ListasDeExercicios.Lista04.Questao02;

public class ContaCorrenteEspecial extends ContaCorrente {
    private float limiteCredito;

    public ContaCorrenteEspecial(int numero, float limiteCredito) {
        super(numero);
        setLimiteCredito(limiteCredito);
    }

    public float getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(float limiteCredito) {
        if(limiteCredito <= 0) {
            throw new IllegalArgumentException("Limite de crédito inválido!");
        }
        this.limiteCredito = limiteCredito;
    }

    @Override
    public float calcularSaldo() {
        return this.saldo + this.limiteCredito;
    }
}
