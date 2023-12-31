package br.com.alura.screenmatch.desafio.modelos;

import java.math.BigDecimal;

public class Compra implements Comparable<Compra> {
    private String descricao;
    private BigDecimal preco;

    public Compra(String descricao, BigDecimal preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return getDescricao() + " → " + String.format("R$%.2f", getPreco());
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return this.getPreco().compareTo(outraCompra.getPreco());
    }
}
