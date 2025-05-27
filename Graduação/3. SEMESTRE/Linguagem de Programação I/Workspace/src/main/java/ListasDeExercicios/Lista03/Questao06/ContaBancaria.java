package ListasDeExercicios.Lista03.Questao06;

public abstract class ContaBancaria {
    protected int numeroConta;
    protected float saldo;
    protected String titular;

    ContaBancaria(int numeroConta, float saldo, String titular) {
        setNumeroConta(numeroConta);
        setSaldo(saldo);
        setTitular(titular);
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        if(numeroConta < 0) {
            throw new IllegalArgumentException("Número de conta inválido!");
        }
        this.numeroConta = numeroConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        if(saldo < 0) {
            throw new IllegalArgumentException("Saldo da conta inválido!");
        }
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if(titular.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome vazio não é permitido!");
        }
        this.titular = titular.trim();
    }

    public abstract void depositar(float deposito);
    public abstract void sacar(float saque);
    public abstract void calcularJuros();
}
