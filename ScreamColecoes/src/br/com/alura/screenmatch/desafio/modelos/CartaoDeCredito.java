package br.com.alura.screenmatch.desafio.modelos;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CartaoDeCredito {
    private BigDecimal limite;
    private BigDecimal saldo;
    private List<Compra> compras;

    public CartaoDeCredito(BigDecimal limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public void comprarItem(Compra item) {
        if (this.saldo.compareTo(item.getPreco()) < 0) {
            System.out.println("Compra negada! Valor do produto maior que o Limite.");
            return;
            }
        this.saldo = saldo.subtract(item.getPreco());
        compras.add(item);
        System.out.printf("Saldo disponível: R$%.2f \n", this.saldo);
    }

    public String listarCompras() {
        this.compras.sort(Comparator.comparing(Compra::getPreco));
        StringBuilder listaCompleta = new StringBuilder();
        for (Compra compra: compras) {
            listaCompleta.append(compra.toString() + "\n");
        }
        return listaCompleta.toString();
    };

    public BigDecimal getLimite() {
        return limite;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    @Override
    public String toString() {
        return "----------------------------------\n" +
                "Limite atual: " + String.format("R$%.2f", this.limite) + "\n" +
                "Itens Comprados: \n" + this.listarCompras() + "\n" +
                "Saldo Disponível: " + String.format("R$%.2f", this.saldo) + "\n" +
                "----------------------------------";
    }
}
