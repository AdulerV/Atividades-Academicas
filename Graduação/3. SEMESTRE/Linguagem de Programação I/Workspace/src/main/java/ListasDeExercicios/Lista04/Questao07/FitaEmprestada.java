package ListasDeExercicios.Lista04.Questao07;

public abstract class FitaEmprestada {
    protected String nomeFilme;
    protected String data;
    protected int numeroDias;

    public FitaEmprestada(String data, int numeroDias) {
        setData(data);
        setNumeroDias(numeroDias);
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        if(nomeFilme.trim().isEmpty()) {
            throw new IllegalArgumentException("Não é permitido nome do filme vazio!");
        }
        this.nomeFilme = nomeFilme.trim();
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        if(data.trim().isEmpty()) {
            throw new IllegalArgumentException("Não é permitido data vazia!");
        }
        this.data = data.trim();
    }

    public int getNumeroDias() {
        return numeroDias;
    }

    public void setNumeroDias(int numeroDias) {
        if(numeroDias <= 0) {
            throw new IllegalArgumentException("Número de dias do empréstimo inválido!");
        }
        this.numeroDias = numeroDias;
    }

    public abstract float calcularValorEmprestimo();
}
