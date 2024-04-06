package com.mycompany.laboratorio8_exercicio2;

class NormalFrete implements FreteStrategy {
    @Override
    public int calcularFrete(int total) {
        return total > 100 ? 10 : 20;
    }
}