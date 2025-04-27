package ListasDeExercicios.Lista01.Questao05;

public class Pessoa {
    private float peso;
    private float altura;
    private String sexo;

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        if(peso <= 0) {
            throw new IllegalArgumentException("Peso inválido!");
        }
        this.peso = peso;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        if(altura <= 0) {
            throw new IllegalArgumentException("Altura inválida!");
        }
        this.altura = altura;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        if((!sexo.toLowerCase().equals("feminino") && (!sexo.toLowerCase().equals("masculino")))) {
            throw new IllegalArgumentException("Sexo inválido!");
        }
        this.sexo = sexo.toLowerCase();
    }

    public float calcularIndiceMassaCorporal() {
        return this.peso / (this.altura * this.altura);
    }

    public String encontrarResultado() {
        if(this.sexo.equals("feminino")) {
            return this.encontrarResultadoFeminino();
        }
        return this.encontrarResultadoMasculino();
    }

    public String encontrarResultadoFeminino() {
        final float IMC = this.calcularIndiceMassaCorporal();

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
        final float IMC = this.calcularIndiceMassaCorporal();

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
