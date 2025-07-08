package ListasDeExercicios.Lista04.Questao01;

public abstract class Imovel {
    protected float metragemQuadrada;
    protected Contribuinte contribuinte;

    public float getMetragemQuadrada() {
        return metragemQuadrada;
    }

    public void setMetragemQuadrada(float metragemQuadrada) {
        if(metragemQuadrada <= 0) {
            throw new IllegalArgumentException("Metragem quadrada inválida!");
        }
        this.metragemQuadrada = metragemQuadrada;
    }

    public Contribuinte getContribuinte() {
        return contribuinte;
    }

    public void setContribuinte(Contribuinte contribuinte) {
        if(contribuinte == null) {
            throw new IllegalArgumentException("Contribuinte inválido!");
        }
        this.contribuinte = contribuinte;
    }

    public abstract float calcularValor();
}
