package com.mycompany.laboratorio8_exercicio3;

class Carro extends Veiculo {
    private final String marca;
    private final String modelo;

    public Carro(String cor, String marca, String modelo) {
        super(cor);
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public void accept(VeiculoVisitor visitor) {
        visitor.visit(this);
    }
}