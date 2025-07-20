package ListasDeExercicios.Lista04.Questao02;

public class ContaPoupanca extends ContaCorrente {
    public ContaPoupanca(int numero) {
        super(numero);
    }

    @Override
    public void calcularJuros() {
        final float TAXA_JUROS_FIXA = 10;
        this.saldo += (this.saldo * (TAXA_JUROS_FIXA / 100));
    }
}
