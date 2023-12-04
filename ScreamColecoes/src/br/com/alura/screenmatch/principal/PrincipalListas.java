package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Arrays;

public class PrincipalListas {
    public static void main(String[] args) {
        var meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        var outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);
        var lost = new Serie("Lost", 2000);

        var lista = new ArrayList<Titulo>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item: lista) {
            System.out.print(item.getNome() + " | ");
            Filme filme = (Filme) item;
            System.out.println("Classificação: " + filme.getClassificacao());
        }
//        lista.forEach(System.out::println);
    }

}
