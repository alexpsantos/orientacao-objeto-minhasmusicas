package br.com.alex.minhasmusicas.modelo;

public class Minhaspreferidas {

    public void incluir(Audio audio){
        if(audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto");
        } else {
            System.out.println(audio.getTitulo() + " tbm é um dos que todo mundo está curtindo");
        }
    }
}
