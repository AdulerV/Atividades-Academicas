package ListasDeExercicios.Lista03.Questao08;

public abstract class Veiculo {
    protected String marca;
    protected String modelo;
    protected float precoBase;

    Veiculo(String marca, String modelo, float precoBase) {
        setMarca(marca);
        setModelo(modelo);
        setPrecoBase(precoBase);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if(marca.trim().isEmpty()) {
            throw new IllegalArgumentException("Marca vazia não é permitido!");
        }
        this.marca = marca.trim();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if(modelo.trim().isEmpty()) {
            throw new IllegalArgumentException("Modelo vazio não é permitido!");
        }
        this.modelo = modelo.trim();
    }

    public float getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(float precoBase) {
        if(precoBase <= 0) {
            throw new IllegalArgumentException("Preço base inválido!");
        }
        this.precoBase = precoBase;
    }

    public abstract float calcularCustos();
}
