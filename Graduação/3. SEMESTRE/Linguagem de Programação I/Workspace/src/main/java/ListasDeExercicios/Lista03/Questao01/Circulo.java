package ListasDeExercicios.Lista03.Questao01;

public class Circulo extends FormaGeometrica {
    private float raio;

    Circulo() {
        setRaio(0.1f);
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        if(raio <= 0){
            throw new IllegalArgumentException("Raio inválido!");
        }
        this.raio = raio;
    }

    public float devolverPi() {
        return 3.14f;
    }

    public float calcularArea() {
        return devolverPi() * (this.raio * this.raio);
    }

    public float calcularPerimetro() {
        return 2 * devolverPi() * this.raio;
    }
}
