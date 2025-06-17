package ListasDeExercicios.ExerciciosSurpresa.Exercicio02;

public class Cidade {
    private String nome;
    private Estado estado;

    public Cidade(String nome) {
        setNome(nome);
    }

    public Cidade(Estado estado) {
        setEstado(estado);
    }

    public Cidade(String nome, Estado estado) {
        setEstado(estado);
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome vazio não é permitido!");
        }
        this.nome = nome.trim();
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        if(estado == null) {
            throw new IllegalArgumentException("Cidade sem estado não é permitida!");
        }
        this.estado = estado;
    }

    public String getNomeEstado() {
        return estado.getNome();
    }
}
