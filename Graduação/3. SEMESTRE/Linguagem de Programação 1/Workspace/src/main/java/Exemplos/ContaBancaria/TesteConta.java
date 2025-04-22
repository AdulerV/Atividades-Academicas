package Exemplos.ContaBancaria;

public class TesteConta {
    public static void main(String[] args) {
        // Instanciando objetos pertencentes à classe ContaBancaria:
        ContaBancaria conta1 = new ContaBancaria("Aduler", 10);
        ContaBancaria conta2 = new ContaBancaria("João", 0);

        // Pegando os valores dos atributos
        imprimirValores(conta1);
        imprimirValores(conta2);

        // Depositando valores
        testarDeposito(conta1, 100);
        imprimirValores(conta1);
        testarDeposito(conta2, -10);
        imprimirValores(conta1);
        imprimirValores(conta2);

        // Sacando valores
        testarSaque(conta1, 50);
        imprimirValores(conta1);
        testarSaque(conta1, 70);
        imprimirValores(conta1);

        // Transferindo valores
        imprimirValores(conta2);
        testarTransferencia(conta1, conta2, 30);
        imprimirValores(conta1);
        imprimirValores(conta2);

        testarTransferencia(conta2, conta1, 40);
        imprimirValores(conta1);
        imprimirValores(conta2);
    }

    private static void imprimirValores(ContaBancaria conta) {
        System.out.println("Titular: " + conta.getTitular() + " | Saldo: R$ " + conta.getSaldo());
    }

    private static void testarDeposito(ContaBancaria conta, double valor) {
            if(conta.depositarConta(valor)) {
                System.out.println("Depósito para " + conta.getTitular() + " realizado com sucesso!");
            } else {
                System.out.println("Depósito para " + conta.getTitular() +  " NÃO realizado.");
            }
    }

    private static void testarSaque(ContaBancaria conta, double valor) {
        if(conta.sacarConta(valor)) {
            System.out.println("Saque de " + conta.getTitular() + " realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }

    private static void testarTransferencia(ContaBancaria conta, ContaBancaria destino, double valor) {
        if(conta.transferir(destino, valor)) {
            System.out.println("Transferência realizada de " + conta.getTitular()  + " para " + destino.getTitular() + "realizada com sucesso!");
        } else {
            System.out.println("Saldo insuficiente ou valor de transferência inválido.");
        }
    }
}