package ListasDeExercicios.Lista03.Questao04;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public abstract class Voo {
    protected String origem;
    protected int distancia;
    protected String destino;
    protected String dataVoo;

    Voo(String origem, int distancia, String destino) {
        setOrigem(origem);
        setDistancia(distancia);
        setDestino(destino);
    }

    Voo(String origem, int distancia, String destino, String dataVoo) {
        setOrigem(origem);
        setDistancia(distancia);
        setDestino(destino);
        setDataVoo(dataVoo);
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        if(origem.trim().isEmpty()) {
            throw new IllegalArgumentException("Local de origem não definido!");
        }
        this.origem = origem.trim();
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        if(distancia <= 0) {
            throw new IllegalArgumentException("Distância inválida!");
        }
        this.distancia = distancia;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        if(destino.trim().isEmpty()) {
            throw new IllegalArgumentException("Local de destino não definido!");
        }
        this.destino = destino.trim();
    }

    public String getDataVoo() {
        return dataVoo;
    }

    public void setDataVoo(String dataVoo) {
        if(!verificarData(dataVoo)) {
            throw new IllegalArgumentException("Data de voo inválida!");
        }

        this.dataVoo = dataVoo;
    }

    public boolean verificarData(String dataVoo) {
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            formato.setLenient(false);
            formato.parse(dataVoo);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    public abstract float calcularPreco();
}
