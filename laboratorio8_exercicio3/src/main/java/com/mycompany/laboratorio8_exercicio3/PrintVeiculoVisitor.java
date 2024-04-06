package com.mycompany.laboratorio8_exercicio3;

class PrintVeiculoVisitor implements VeiculoVisitor {
    @Override
    public void visit(Carro carro) {
        System.out.println("Carro: cor - " + carro.getCor() + ", marca - " + carro.getMarca() + ", modelo - " + carro.getModelo());
    }

    @Override
    public void visit(Onibus onibus) {
        System.out.println("Ônibus: cor - " + onibus.getCor() + ", quantidade de lugares - " + onibus.getLugares() + ", ano de fabricação - " + onibus.getAnoFabricacao());
    }

    @Override
    public void visit(Bicicleta bicicleta) {
        System.out.println("Bicicleta: cor - " + bicicleta.getCor());
    }
}

class SendMessageVeiculoVisitor implements VeiculoVisitor {
    @Override
    public void visit(Carro carro) {
        System.out.println("Enviando mensagem para o dono do Carro: favor atualizar dados do IPVA");
    }

    @Override
    public void visit(Onibus onibus) {
        System.out.println("Enviando mensagem para o dono do Ônibus: atenção para atualização das licenças");
    }

    @Override
    public void visit(Bicicleta bicicleta) {
        System.out.println("Enviando mensagem para o dono da Bicicleta: comemore no parque o dia do ciclismo");
    }
}
