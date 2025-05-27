package ListasDeExercicios.Lista03.Questao06;

public class ContaPoupanca extends ContaBancaria {
    ContaPoupanca(int numeroConta, float saldo, String titular) {
        super(numeroConta, saldo, titular);
    }

    @Override
    public void depositar(float deposito) {
        if(deposito <= 0) {
            throw new IllegalArgumentException("Valor de déposito inválido!");
        }

        this.saldo += deposito;
    }

    @Override
    public void sacar(float saque) {
        if(saque <= 0) {
            throw new IllegalArgumentException("Valor de saque inválido!");
        }

        if(saque > this.saldo) {
            throw new IllegalArgumentException("Valor de saque maior que o saldo atual!");
        }

        this.saldo -= saque;
    }

    @Override
    public void calcularJuros() {
        final float TAXA_JUROS_FIXA = 10;
        this.saldo += (this.saldo * (TAXA_JUROS_FIXA / 100));
    }
}
