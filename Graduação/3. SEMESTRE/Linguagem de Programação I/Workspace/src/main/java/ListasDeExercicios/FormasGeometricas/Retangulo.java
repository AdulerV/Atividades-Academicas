package ListasDeExercicios.FormasGeometricas;

public class Retangulo extends FormaGeometrica {
    private float largura;
    private float altura;

    Retangulo() {
        this.altura = 0;
        this.largura = 0;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        if(largura <= 0) {
            throw new IllegalArgumentException("Largura inválida!");
        }

        if(largura == this.altura) {
            throw new IllegalArgumentException("Não é aceito um quadrado!");
        }
        this.largura = largura;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        if(altura <= 0) {
            throw new IllegalArgumentException("Altura inválida!");
        }

        if(altura == this.largura) {
            throw new IllegalArgumentException("Não é aceito um quadrado!");
        }
        this.altura = altura;
    }

    public float calcularArea() {
        return this.largura * this.altura;
    }

    public float calcularPerimetro() {
        return this.largura + this.largura + this.altura + this.altura;
    }
}