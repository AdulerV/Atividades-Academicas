package ListasDeExercicios.Lista04.Questao01;

public class Lote extends Imovel {
    @Override
    public float calcularValor() {
        final float FATOR_PRECO_LOTE = 30;
        return this.metragemQuadrada * FATOR_PRECO_LOTE;
    }
}
