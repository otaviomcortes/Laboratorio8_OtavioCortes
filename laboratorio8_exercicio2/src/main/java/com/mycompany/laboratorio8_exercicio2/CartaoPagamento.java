package com.mycompany.laboratorio8_exercicio2;

public class CartaoPagamento implements PagamentoStrategy {

    @Override
    public void pagar(int total) {
        System.out.println("logica para pagar com cartao");
    }
    
}