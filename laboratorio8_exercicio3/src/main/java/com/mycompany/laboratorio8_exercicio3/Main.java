package com.mycompany.laboratorio8_exercicio3;

public class Main {
    public static void main(String[] args) {
        Veiculo[] veiculos = {
            new Carro("Azul", "Chevrolet", "Cruze"),
            new Onibus("Vermelho", 40, 2015),
            new Bicicleta("Verde")
        };

        System.out.println("Imprimindo dados dos veículos:");
        VeiculoVisitor printVisitor = new PrintVeiculoVisitor();
        for (Veiculo veiculo : veiculos) {
            veiculo.accept(printVisitor);
        }

        System.out.println();

        System.out.println("Enviando mensagem para os donos dos veículos:");
        VeiculoVisitor sendMessageVisitor = new SendMessageVeiculoVisitor();
        for (Veiculo veiculo : veiculos) {
            veiculo.accept(sendMessageVisitor);
        }
    }
}