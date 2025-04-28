package org.aplicacao.lista2;

public class Livro {
    private String titulo;
    private String autor;
    private int anoDePublicacao;
    private int numeroDePaginas;
    private String genero;
    private boolean aberto;
    private int paginaAtual = 1;

    public Livro(String titulo, String autor, int anoDePublicacao, int numeroDePaginas, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        setAnoDePublicacao(anoDePublicacao);
        setNumeroDePaginas(numeroDePaginas);
        this.genero = genero;
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

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public void setAnoDePublicacao(int anoDePublicacao) {
        if (anoDePublicacao<=0){
            throw new QuantidadeInvalidaException("Ano de publicação deve ser maior que 0");
        }
        this.anoDePublicacao = anoDePublicacao;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        if (numeroDePaginas<=0){
            throw new QuantidadeInvalidaException("Número de páginas deve ser maior que 0");
        }
        this.numeroDePaginas = numeroDePaginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void abrir(){
        this.aberto = true;
        System.out.println("O livro " + this.titulo + " foi aberto");
    }

    public void fechar(){
        this.aberto = false;
        System.out.println("O livro " + this.titulo + " foi fechado");
    }

    public void marcarPagina(){
        System.out.println("A página " + this.paginaAtual + " foi marcada!");
    }

    public void avancarPagina(){
        if(this.paginaAtual >= this.numeroDePaginas){
            throw new IllegalStateException("Não pode avançar além do numero de paginas do livro");
        }
        this.paginaAtual++;
    }

    public void retrocederPagina(){
        if(this.paginaAtual == 1){
            throw new IllegalStateException("Não pode retroceder além da página um");
        }
        this.paginaAtual--;
    }
}
