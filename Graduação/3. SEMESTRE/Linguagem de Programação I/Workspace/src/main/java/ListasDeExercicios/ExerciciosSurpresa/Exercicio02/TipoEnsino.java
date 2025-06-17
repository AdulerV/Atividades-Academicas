package ListasDeExercicios.ExerciciosSurpresa.Exercicio02;

public class TipoEnsino {
    private String nome;

    public TipoEnsino(String nome) {
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String nomeTratado = nome.trim().toLowerCase();

        if(!nomeTratado.equals("ensino fundamental") && !nomeTratado.equals("ensino médio") && !nomeTratado.equals("ensino superior")) {
            throw new IllegalArgumentException("Tipo de ensino inválido!");
        }
        this.nome = nomeTratado;
    }
}
