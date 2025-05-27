package ListasDeExercicios.Lista03.Questao06;

public class ContaCorrente extends ContaBancaria {
    ContaCorrente(int numeroConta, float saldo, String titular) {
        super(numeroConta, saldo, titular);
    }

    @Override
    public void depositar(float deposito) {
        final float TAXA_MANUTENCAO_DEPOSITO = 0.75f;
        float depositoFinal = (deposito - TAXA_MANUTENCAO_DEPOSITO);

        if(depositoFinal <= 0) {
            throw new IllegalArgumentException("Valor de depósito inválido!");
        }

        this.saldo += depositoFinal;
    }

    @Override
    public void sacar(float saque) {
        if(saque <= 0) {
            throw new IllegalArgumentException("Valor de saque inválido!");
        }

        if(saque > this.saldo) {
            throw new IllegalArgumentException("Valor de saque maior que saldo atual!");
        }

        this.saldo -= saque;
    }

    @Override
    public void calcularJuros() {
        final float TAXA_MANUTENCAO_MENSAL = 9.45f;
        this.saldo -= TAXA_MANUTENCAO_MENSAL;
    }
}
