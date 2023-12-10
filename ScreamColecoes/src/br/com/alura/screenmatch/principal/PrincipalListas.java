package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalListas {
    public static void main(String[] args) {
        var meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        var outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);
        var lost = new Serie("Lost", 2000);

        List<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item: lista) {
            System.out.print(item.getNome() + " | ");
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            } else {
                System.out.println("None");
            }

        }
//        lista.forEach(System.out::println);

        var buscaArtisca = new ArrayList<String>();
        buscaArtisca.add("Adam Sandler");
        buscaArtisca.add("Paulo");
        buscaArtisca.add("Jacqueline");
        buscaArtisca.add("Andy");
        System.out.println(buscaArtisca);

        Collections.sort(buscaArtisca);
        System.out.println(" --- Depois da Ordenação ---  ");
        System.out.println(buscaArtisca);

        System.out.println(" ---------------------------- ");
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(" --- Depois da Ordenação ---  ");
        System.out.println(lista);

        System.out.println(" ---------------------------- ");
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(" --- Depois da Ordenação ---  ");
        System.out.println(lista);
    }

}
