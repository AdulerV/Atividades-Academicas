package ListasDeExercicios.Lista04.Questao02;

public abstract class ContaCorrente extends ContaBancaria {
    public ContaCorrente(int numero) {
        super(numero);
    }

    @Override
    public void calcularJuros() {
        final float TAXA_MANUTENCAO_MENSAL = 9.45f;
        this.saldo -= TAXA_MANUTENCAO_MENSAL;
    }
}
