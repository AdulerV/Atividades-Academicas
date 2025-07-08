package ListasDeExercicios.Lista04.Questao01;

public class Apartamento extends Imovel {
    private int andar;

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        if(andar <= 0) {
            throw new IllegalArgumentException("Andar do apartamento inválido!");
        }
        this.andar = andar;
    }

    @Override
    public float calcularValor() {
        final float FATOR_PRECO_APARTAMENTO = 40, PERCENTUAL_ANDAR = 0.10f;
        return (this.metragemQuadrada * FATOR_PRECO_APARTAMENTO) - (this.andar * PERCENTUAL_ANDAR);
    }
}
