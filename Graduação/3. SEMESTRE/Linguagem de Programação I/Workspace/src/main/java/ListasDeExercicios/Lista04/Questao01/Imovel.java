package ListasDeExercicios.Lista04.Questao01;

public abstract class Imovel {
    protected float metragemQuadrada;

    public float getMetragemQuadrada() {
        return metragemQuadrada;
    }

    public void setMetragemQuadrada(float metragemQuadrada) {
        if(metragemQuadrada <= 0) {
            throw new IllegalArgumentException("Metragem quadrada inválida!");
        }
        this.metragemQuadrada = metragemQuadrada;
    }

    public abstract float calcularValor();
}
