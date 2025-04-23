package ListasDeExercicios.Lista01.Questao05;

/* Construa um algoritmo para calcular o índice de massa corporal (IMC) de uma pessoa, através da fórmula IMC = peso / altura ^ 2.
Para o resultado, considere a tabela. */

public class Pessoa {
    private double peso;
    private double altura;
    private String sexo;

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        if(peso < 0) {
            throw new IllegalArgumentException("Peso inválido!");
        }
        this.peso = peso;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        if(altura < 0) {
            throw new IllegalArgumentException("Altura inválida!");
        }
        this.altura = altura;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        if((!sexo.toLowerCase().equals("masculino")) && (!sexo.toLowerCase().equals("feminino")))  {
            throw new IllegalArgumentException("Sexo inválido!");
        }
        this.sexo = sexo.toLowerCase();
    }

    public double calcularIndiceMassaCorporal() {
        return this.peso / (this.altura * this.altura);
    }

    public String encontrarResultado() {
        if(this.sexo.equals("feminino")) {
            return encontrarResultadoFeminino();
        }
        return encontrarResultadoMasculino();
    }

    public String encontrarResultadoFeminino() {
        final double IMC = calcularIndiceMassaCorporal();

        if(IMC < 19.1) {
            return "Abaixo do peso";
        } else if(IMC < 25.8) {
            return "Peso normal";
        } else if (IMC < 27.3) {
            return "Marginalmente acima do peso";
        } else if(IMC < 32.3) {
            return "Acima do peso ideal";
        } else {
            return "Obeso";
        }
    }

    public String encontrarResultadoMasculino() {
        final double IMC = calcularIndiceMassaCorporal();

        if(IMC < 20.7) {
            return "Abaixo do peso";
        } else if(IMC < 26.4) {
            return "Peso normal";
        } else if (IMC < 27.8) {
            return "Marginalmente acima do peso";
        } else if(IMC < 31.1) {
            return "Acima do peso ideal";
        } else {
            return "Obeso";
        }
    }
}
