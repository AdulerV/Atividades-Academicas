package ListasDeExercicios.Lista02.Questao01;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private float velocidadeAtual;
    private boolean estado;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if(ano < 0) {
            throw new IllegalArgumentException("Ano inválido!");
        }
        this.ano = ano;
    }

    public float getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(float velocidadeAtual) {
        if(velocidadeAtual < 0) {
            throw new IllegalArgumentException("Velocidade inválida!");
        }
        this.velocidadeAtual = velocidadeAtual;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void acelerar(float quantidade) {
        if(quantidade < 0) {
            throw new IllegalArgumentException("Valor inválido!");
        }
        this.velocidadeAtual += quantidade;
    }

    public void frear(float quantidade) {
        if(quantidade <= 0 || quantidade > this.velocidadeAtual) {
            throw new IllegalArgumentException("Valor de freada inválido!");
        }
        this.velocidadeAtual -= quantidade;
    }

    public void ligar() {
        this.estado = true;
    }

    public void desligar() {
        this.estado = false;
        this.velocidadeAtual = 0;
    }
}
