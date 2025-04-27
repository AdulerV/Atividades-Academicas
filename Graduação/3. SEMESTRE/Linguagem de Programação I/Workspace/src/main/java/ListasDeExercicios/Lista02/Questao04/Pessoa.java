package ListasDeExercicios.Lista02.Questao04;

public class Pessoa {
    private String nome;
    private int idade;
    private float altura;
    private float peso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade < 0) {
            throw new IllegalArgumentException("Idade inválida!");
        }
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        if(altura <= 0) {
            throw new IllegalArgumentException("Altura inválida!");
        }
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        if(peso <= 0) {
            throw new IllegalArgumentException("Peso inválido!");
        }
        this.peso = peso;
    }

    public void envelhecer() {
        this.idade++;
    }

    public void crescer(float centimetros) {
        if(centimetros < 0 || this.idade >= 21) {
            throw new IllegalArgumentException("Valor inválido ou pessoa com mais de 21 anos!");
        }
        this.altura += (centimetros / 100);
    }

    public void ganharPeso(float quilos) {
        if(quilos < 0) {
            throw new IllegalArgumentException("Quantidade de quilogramas inválido!");
        }
        this.peso += quilos;
    }

    public void perderPeso(float quilos) {
        if(quilos < 0) {
            throw new IllegalArgumentException("Quantidade de quilogramas inválido!");
        }
        this.peso -= quilos;
    }
}
