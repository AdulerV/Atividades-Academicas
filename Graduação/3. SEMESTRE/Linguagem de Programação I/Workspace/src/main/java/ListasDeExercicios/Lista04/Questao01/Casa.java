package ListasDeExercicios.Lista04.Questao01;

public class Casa extends Imovel {
    private float metragemQuadradaConstrucao;

    public float getMetragemQuadradaConstrucao() {
        return metragemQuadradaConstrucao;
    }

    public void setMetragemQuadradaConstrucao(float metragemQuadradaConstrucao) {
        if(metragemQuadradaConstrucao <= 0) {
            throw new IllegalArgumentException("Metragem quadrada da construção inválida!");
        }
        this.metragemQuadradaConstrucao = metragemQuadradaConstrucao;
    }

    @Override
    public float calcularValor() {
        final float FATOR_PRECO_TERRENO = 30, FATOR_PRECO_CONSTRUCAO = 50;
        return (this.metragemQuadrada * FATOR_PRECO_TERRENO) + (this.metragemQuadradaConstrucao * FATOR_PRECO_CONSTRUCAO);
    }
}
