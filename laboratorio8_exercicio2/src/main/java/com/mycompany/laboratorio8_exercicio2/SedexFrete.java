package com.mycompany.laboratorio8_exercicio2;

class SedexFrete implements FreteStrategy {
    @Override
    public int calcularFrete(int total) {
        return total > 200 ? 15 : 25; 
    }
}