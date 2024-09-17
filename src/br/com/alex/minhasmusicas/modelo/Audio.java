package br.com.alex.minhasmusicas.modelo;

public class Audio {

    private String titulo;
    private int totalDeReproducoes;
    private int totalDeCurtidas;
    private int classificacao;

    public void curtir (){
        this.totalDeCurtidas++;
    }
    public void reproduzir (){
        this.totalDeReproducoes++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public int getTotalDeCurtidas() {
        return totalDeCurtidas;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

}