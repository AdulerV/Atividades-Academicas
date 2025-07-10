package ListasDeExercicios.Lista04.Questao06;

public abstract class Vaga {
    protected int numero;
    protected String placa;
    protected int periodo;
    protected Cliente cliente;

    public Vaga(int numero, int periodo) {
        setNumero(numero);
        setPeriodo(periodo);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            throw new IllegalArgumentException("Número inválido!");
        }
        this.numero = numero;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if (placa.trim().isEmpty()) {
            throw new IllegalArgumentException("Placa inválida!");
        }
        this.placa = placa.trim().toUpperCase();
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        if(periodo <= 0) {
            throw new IllegalArgumentException("Período inválido!");
        }
        this.periodo = periodo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public abstract float calcularValor();
}
