package Exemplos.Associacao;

public class TipoEnsino {
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {

        if  (tipo == "Ensino Medio"|| tipo == "Ensino Fundamental"|| tipo == "Ensibo Superior"){
            this.tipo = tipo;
        }
        else {
            throw new IllegalArgumentException( "Ensino Invalido");
        }
    }
}
