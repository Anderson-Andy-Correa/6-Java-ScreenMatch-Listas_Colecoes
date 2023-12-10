package br.com.alura.screenmatch.desafio.modelos;

import java.math.BigDecimal;

public class Compra {
    private String nomeItem;
    private BigDecimal preco;

    public Compra(String nomeItem, BigDecimal preco) {
        this.nomeItem = nomeItem;
        this.preco = preco;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return getNomeItem() + " → " + String.format("R$%.2f", getPreco());
    }
}
