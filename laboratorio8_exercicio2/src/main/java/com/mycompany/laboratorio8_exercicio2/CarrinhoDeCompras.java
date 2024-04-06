package com.mycompany.laboratorio8_exercicio2;

import java.util.ArrayList;
import java.util.List;

class CarrinhoDeCompras {
    
    List<Item> items = new ArrayList<>();
    
    public void adicionaItem(Item item){
        items.add(item);
        
    }
    public void removeItem(Item item){
        items.remove(item);
    }
    
    public int calculaTotal(){
        int sum = 0;
        for(Item item : items){
            sum += item.getPreco();
        }
        return sum;
    }

    public void realizaPagamento(PagamentoStrategy strategy){
        int total = this.calculaTotal();
        strategy.pagar(total);
        
    }
    
    public void calculaFrete(FreteStrategy strategy){
        int total = this.calculaTotal();
        int frete = strategy.calcularFrete(total);
        System.out.println("Frete: R$" + frete);
    }
}
