package com.mycompany.laboratorio8_exercicio3;

interface VeiculoVisitor {
    void visit(Carro carro);
    void visit(Onibus onibus);
    void visit(Bicicleta bicicleta);
}