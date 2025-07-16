package ListasDeExercicios.Lista04.Questao03;

import java.util.ArrayList;

public class Hospede {
    private int codigo;
    private String nome;
    private ArrayList<Reserva> reservas;

    public Hospede() {
        this.reservas = new ArrayList<Reserva>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if(codigo < 0) {
            throw new IllegalArgumentException("Código inválido!");
        }
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Não é permitido nome vazio!");
        }
        this.nome = nome.trim();
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        if(reservas == null) {
            throw new IllegalArgumentException("Lista de reservas inválida!");
        }
        this.reservas = reservas;
    }

    public int getNumeroReservas() {
        return this.reservas.size();
    }

    public void adicionarReserva(Reserva reserva) {
        if(reserva == null || verificarReserva(reserva)) {
            throw new IllegalArgumentException("Reserva inválida!");
        }
        this.reservas.add(reserva);
    }

    public void removerReserva(Reserva reserva) {
        if(!verificarReserva(reserva)) {
            throw new IllegalArgumentException("Reserva não pertence ao cliente!");
        }
        this.reservas.remove(reserva);
    }

    public boolean verificarReserva(Reserva reserva) {
        return this.reservas.contains(reserva);
    }


    public ArrayList<Float> consultarValoresReservas() {
        ArrayList<Float> valores = new ArrayList<Float>();

        for (Reserva equipamento : this.reservas) {
            valores.add(equipamento.calcularValor());
        }

        return valores;
    }
    
    public float calcularValorTotalReservas() {
        float soma = 0;

        for (Reserva reserva : this.reservas) {
            soma += reserva.calcularValor();
        }
        return soma;
    }
}
