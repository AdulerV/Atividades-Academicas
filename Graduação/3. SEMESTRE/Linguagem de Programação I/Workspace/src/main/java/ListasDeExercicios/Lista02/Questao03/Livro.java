package ListasDeExercicios.Lista02.Questao03;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private int numeroPaginas;
    private int paginaAtual;
    private String genero;
    private boolean estado;

    Livro() {
        this.anoPublicacao = 0;
        this.numeroPaginas = 0;
        this.paginaAtual = 0;
        this.estado = false;
    }

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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String abrir() {
        if(this.estado) {
            throw new IllegalArgumentException("O livro já está aberto!");
        }
        this.estado = true;
        return "O livro foi aberto!";
    }

    public String fechar() {
        if(!this.estado) {
            throw new IllegalArgumentException("O livro já está fechado!");
        }
        this.estado = false;
        return "O livro foi fechado!";
    }

    public void marcarPagina(int pagina) {
        verificarEstadoLivro();

        if(pagina <= 0 || pagina > this.numeroPaginas) {
            throw new IllegalArgumentException("Página inválida!");
        }
        this.paginaAtual = pagina;
    }

    public void avancarPagina() {
        verificarEstadoLivro();

        if(this.paginaAtual == this.numeroPaginas) {
            throw new IllegalArgumentException("Já está na última página!");
        }
        this.paginaAtual++;
    }

    public void retrocederPagina() {
        verificarEstadoLivro();

        if(this.paginaAtual == 1) {
            throw new IllegalArgumentException("Já está na primeira página!");
        }
        this.paginaAtual--;
    }

    public void verificarEstadoLivro() {
        if (!this.estado) {
            throw new IllegalArgumentException("O livro está fechado!");
        }
    }

    public String exibirDados() {
        return "Título: " + this.titulo + " - Autor: " + this.autor + " - Ano de Publicação: " + this.anoPublicacao + " - Número de Páginas: " + this.numeroPaginas + " - Página atual: " + this.paginaAtual + " - Gênero: " + this.genero + " - Estado: " + (this.estado ? "Aberto" : "Fechado");
    }
}
