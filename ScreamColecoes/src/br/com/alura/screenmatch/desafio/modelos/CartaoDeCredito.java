package br.com.alura.screenmatch.desafio.modelos;

import java.math.BigDecimal;
import java.util.*;

public class CartaoDeCredito {
    private BigDecimal limite;
    private BigDecimal saldo;
    private List<Compra> compras;

    public CartaoDeCredito(BigDecimal limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public String comprarItem(Compra item) {
        if (this.saldo.compareTo(item.getPreco()) < 0) {
            return "Compra negada! Valor do produto maior que o limite disponível.";
            }

        this.saldo = saldo.subtract(item.getPreco());
        compras.add(item);
        return String.format("Compra realizada com Sucesso! \nSaldo disponível: R$%.2f", this.saldo);
    }

    public String listarCompras() {
        this.compras.sort(Comparator.comparing(Compra::getPreco));
        //Collections.sort(compras);
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
