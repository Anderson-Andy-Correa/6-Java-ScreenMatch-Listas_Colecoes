package br.com.alura.screenmatch.desafio.principal;

import br.com.alura.screenmatch.desafio.modelos.Cartao;
import br.com.alura.screenmatch.desafio.modelos.Compra;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    static final List<String> listaContinuar = new ArrayList<>();

    public static void main(String[] args) {
        listaContinuar.add("S");
        listaContinuar.add("N");
        Scanner scan = new Scanner(System.in);

        System.out.print("Qual é o limite do cartão? R$");
        var cartao = new Cartao(scan.nextBigDecimal());
        scan.nextLine();

        for (;;) {
            System.out.println("----------------------------------");
            System.out.print("Digite a descricao da compra: ");
            String descricaoCompra = scan.nextLine();

            System.out.print("Digite o valor da compra: R$");
            BigDecimal valorCompra = scan.nextBigDecimal();
            scan.nextLine();

            cartao.comprarItem(new Compra(descricaoCompra, valorCompra));

            System.out.println("----------------------------------");
            String continuar = null;
            while (true) {
                System.out.print("Deseja continuar? (S/N) ");
                continuar = scan.nextLine().toUpperCase().replace(" ", "");
                if (listaContinuar.contains(continuar)) {
                    break;
                }

                System.out.println("Opção inválida! Tente novamente.");
                System.out.println("----------------------------------");
            }
            if (continuar.equals("N"))
                break;;
        }
        System.out.println(cartao);
    }
}
