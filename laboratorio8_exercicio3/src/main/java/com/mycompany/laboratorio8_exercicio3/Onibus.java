package com.mycompany.laboratorio8_exercicio3;

class Onibus extends Veiculo {
    private final int lugares;
    private final int anoFabricacao;

    public Onibus(String cor, int lugares, int anoFabricacao) {
        super(cor);
        this.lugares = lugares;
        this.anoFabricacao = anoFabricacao;
    }

    public int getLugares() {
        return lugares;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    @Override
    public void accept(VeiculoVisitor visitor) {
        visitor.visit(this);
    }
}
