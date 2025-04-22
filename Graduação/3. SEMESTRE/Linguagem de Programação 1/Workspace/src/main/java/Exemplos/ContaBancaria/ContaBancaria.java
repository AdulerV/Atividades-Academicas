package Exemplos.ContaBancaria;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        setTitular(titular);
        setSaldo(saldoInicial);
    }

    public void setSaldo(double saldo) {
        if(saldo > 0) {
            this.saldo = saldo;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return this.titular;
    }

    public boolean depositarConta(double deposito) {
        if(deposito > 0) {
            this.saldo += deposito;
            return true;
        }
        return false;
    }

    public boolean sacarConta(double saque) {
        if((saque <= this.saldo) && (saque > 0)) {
            this.saldo -= saque;
            return true;
        }
        return false;
    }

    public boolean transferir(ContaBancaria destino, double valor) {
        return this.sacarConta(valor) && destino.depositarConta(valor);
    }
}