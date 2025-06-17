package ListasDeExercicios.ExerciciosSurpresa.Exercicio02;

public class Escolaridade {
    private String nivelEscolar;

    public Escolaridade(String nivelEscolar) {
        setNivelEscolar(nivelEscolar);
    }

    public String getNivelEscolar() {
        return nivelEscolar;
    }

    public void setNivelEscolar(String nivelEscolar) {
        String nivelEscolarTratado = nivelEscolar.trim().toLowerCase();

        if (!nivelEscolarTratado.equals("ensino fundamental incompleto") &&
                !nivelEscolarTratado.equals("ensino fundamental") &&
                !nivelEscolarTratado.equals("ensino médio incompleto") &&
                !nivelEscolarTratado.equals("ensino médio") &&
                !nivelEscolarTratado.equals("ensino superior incompleto") &&
                !nivelEscolarTratado.equals("bacharelado") &&
                !nivelEscolarTratado.equals("licenciatura") &&
                !nivelEscolarTratado.equals("tecnólogo") &&
                !nivelEscolarTratado.equals("especialização") &&
                !nivelEscolarTratado.equals("mba") &&
                !nivelEscolarTratado.equals("mestrado") &&
                !nivelEscolarTratado.equals("doutorado"))
        {
            throw new IllegalArgumentException("Escolaridade inválida!");
        }
        this.nivelEscolar = nivelEscolarTratado;
    }
}
