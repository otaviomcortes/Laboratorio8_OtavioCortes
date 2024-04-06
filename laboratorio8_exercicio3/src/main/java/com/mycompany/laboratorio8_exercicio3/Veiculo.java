package com.mycompany.laboratorio8_exercicio3;

abstract class Veiculo implements VeiculoVisitable {
    private final String cor;

    public Veiculo(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }
}
