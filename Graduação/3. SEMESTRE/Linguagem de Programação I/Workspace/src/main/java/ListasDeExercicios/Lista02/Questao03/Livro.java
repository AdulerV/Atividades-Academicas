package ListasDeExercicios.Lista02.Questao03;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private int numeroPaginas;
    private int paginaAtual;
    private String genero;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        if(numeroPaginas <= 0) {
            throw new IllegalArgumentException("Número de páginas inválido!");
        }
        this.numeroPaginas = numeroPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String abrir() {
        return "O livro foi aberto!";
    }

    public String fechar() {
        return "O livro foi fechado!";
    }

    public void marcarPagina(int pagina) {
        if(pagina <= 0 || pagina > this.numeroPaginas) {
            throw new IllegalArgumentException("Página inválida!");
        }
        this.paginaAtual = pagina;
    }

    public void avancarPagina() {
        if(this.paginaAtual == this.numeroPaginas) {
            throw new IllegalArgumentException("Já está na última página!");
        }
        this.paginaAtual++;
    }

    public void retrocederPagina() {
        if(this.paginaAtual == 1) {
            throw new IllegalArgumentException("Já está na primeira página!");
        }
        this.paginaAtual--;
    }
}
