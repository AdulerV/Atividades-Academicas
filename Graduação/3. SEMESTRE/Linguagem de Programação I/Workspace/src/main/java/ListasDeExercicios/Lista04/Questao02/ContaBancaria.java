package ListasDeExercicios.Lista04.Questao02;

public abstract class ContaBancaria {
    protected int numero;
    protected float saldo;
    protected Cliente cliente;

    public ContaBancaria(Cliente cliente, int numero) {
        setCliente(cliente);
        setNumero(numero);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if(numero < 0) {
            throw new IllegalArgumentException("Número de conta inválido!");
        }
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        if(saldo < 0) {
            throw new IllegalArgumentException("Valor de saldo inválido!");
        }
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        if(cliente == null) {
            throw new IllegalArgumentException("O cliente é obrigatório!");
        }
        this.cliente = cliente;
    }

    public void depositar(float deposito) {
        if(deposito <= 0) {
            throw new IllegalArgumentException("Valor de depósito inválido!");
        }
        this.saldo += deposito;
    }

    public void sacar(float saque) {
        if(saque <= 0 || saque > this.saldo) {
            throw new IllegalArgumentException("Valor de saque inválido!");
        }
        this.saldo -= saque;
    }

    public float calcularSaldo() {
        return this.getSaldo();
    }
}
