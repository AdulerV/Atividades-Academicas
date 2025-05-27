package ListasDeExercicios.Lista03.Questao07;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public abstract class MaterialBiblioteca {
    protected String titulo;
    protected String dataPublicacao;

    MaterialBiblioteca(String titulo) {
        setTitulo(titulo);
    }

    MaterialBiblioteca(String titulo, String dataPublicacao) {
        setTitulo(titulo);
        setDataPublicacao(dataPublicacao);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if(titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("Título vazio não é permitido!");
        }
        this.titulo = titulo.trim();
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        if(!verificarData(dataPublicacao)) {
            throw new IllegalArgumentException("Data de publicação inválida!");
        }
        this.dataPublicacao = dataPublicacao;
    }


    public boolean verificarData(String data) {
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            formato.setLenient(false);
            formato.parse(data);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    public abstract String calcularDataDevolucao(String dataEmprestimo);
}
