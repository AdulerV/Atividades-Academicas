package ListasDeExercicios.Lista04.Questao04;

public abstract class Frete {
    protected int numero;
    protected float valor;

    public Frete(int numero) {
        setNumero(numero);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if(numero < 0) {
            throw new IllegalArgumentException("Número de frete inválido!");
        }
        this.numero = numero;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        if(valor < 0) {
            throw new IllegalArgumentException("Valor de frete inválido!");
        }
        this.valor = valor;
    }

    public abstract float calcularValor();
}
