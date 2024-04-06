package com.mycompany.laboratorio8_exercicio2;

public class Main {
    
    public static void main(String ... args){
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        
        carrinho.adicionaItem(new Item("livro x", 50) );
        carrinho.adicionaItem(new Item("tenis y", 800));
        
        // Supondo que o usuário escolheu pagar com Pix
        PagamentoStrategy pagamentoStrategy = new PixPagamento();
        
        // Supondo que o usuário escolheu o frete via Sedex
        FreteStrategy freteStrategy = new SedexFrete();
        
        carrinho.realizaPagamento(pagamentoStrategy);
        carrinho.calculaFrete(freteStrategy);
    }
    
}