package ListasDeExercicios.ExerciciosSurpresa.Exercicio01;

public abstract class Aluno extends Pessoa {
    private float[] notas;
    private int matricula;

    Aluno() {
        setNotas(new float[2]);
        setMatricula(0);
    }

    public float[] getNotas() {
        return notas;
    }

    public void setNotas(float[] notas) {
        for(int i = 0; i < notas.length; i++) {
            if(notas[i] < 0) {
                throw new IllegalArgumentException("Nota " + (i + 1) + " inválida!");
            }
        }
        this.notas = notas;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        if(matricula < 0) {
            throw new IllegalArgumentException("Número de matrícula inválido!");
        }
        this.matricula = matricula;
    }

    public float calcularMedia() {
        float media = 0;

        for(float nota : this.notas) {
            media += nota;
        }

        return media / this.notas.length;
    }
}
