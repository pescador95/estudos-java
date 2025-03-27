package com.pescador95;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println(listaPedidos());

    }

    public static String listaPedidos() {

        Double valorTotal = 0.0;
        final Double[] valorTotalFinal = {0.0};

        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("sabao", 5.0, 3));
        produtos.add(new Produto("fermento", 2.0, 1));
        produtos.add(new Produto("maconha", 500.0, 0));
        produtos.add(new Produto("azeite", 8.0, 15));


        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).produtoValido()) {
                valorTotal += produtos.get(i).getValorTotal();
            }
            if (produtos.get(i).produtoInvalido()) {
                System.out.println("produto inválido: " + produtos.get(i).getNome());
            }
        }

        for (int i = produtos.size() - 1; i >= 0; i--) {
            if (produtos.get(i).produtoValido()) {
                valorTotal += produtos.get(i).getValorTotal();
            }
            if (produtos.get(i).produtoInvalido()) {
                System.out.println("produto inválido: " + produtos.get(i).getNome());
            }
        }

        for (Produto produto : produtos) {
            if (produto.produtoValido()) {
                valorTotal += produto.getValorTotal();
            }
            if (produto.produtoInvalido()) {
                System.out.println("produto inválido: " + produto.getNome());
            }
        }

        produtos.forEach(forProduto -> valorTotalFinal[0] += forProduto.getValorTotal());

        if (valorTotalFinal[0] > 0.0) {
            valorTotal = valorTotalFinal[0];
        }

        return "Seu pedido custará : R$" + valorTotal;
    }
}

class Produto {
    private String nome;
    private Double valor;
    private Integer quantidade;

    private Double valorTotal;

    public Produto() {

    }

    public Produto(String nome, Double valor, Integer quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorTotal() {
        return quantidade * valor;
    }

    public Boolean produtoValido() {
        return this.getQuantidade() > 0 && this.getValor() > 0.0;
    }

    public Boolean produtoInvalido() {
        return !produtoValido();
    }
}
