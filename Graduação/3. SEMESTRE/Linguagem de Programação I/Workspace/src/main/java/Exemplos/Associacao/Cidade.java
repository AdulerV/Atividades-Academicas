package Exemplos.Associacao;

public class Cidade {
    private String nome;
    private Estado estado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return this.estado;
    }

    public void setEstado(Estado estado) {
        if (estado == null) {
            throw new IllegalArgumentException("Estado invalido");
        }
        this.estado = estado;
    }

    public String getNomeEstado() {
        return this.estado.getNome();
    }
}
