package br.com.inmetrics.Veiculos;

public class Veiculo{


    String modelo;
    String marca;

    double consumo;
    double valorCombustivel;
    double kmRodado;
    double capacidadeDoTanque;
    double kmInicial;
    double litroAbastecido;

    public double getKmInicial() {
        return kmInicial;
    }

    public void setKmInicial(double kmInicial) {
        this.kmInicial = kmInicial;
    }

    public double getLitroAbastecido() {
        return litroAbastecido;
    }

    public void setLitroAbastecido(double litroAbastecido) {
        this.litroAbastecido = litroAbastecido;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {

        this.marca = marca;
    }

    public double getConsumo() {
        double Cosumo;{
            var media =kmRodado;
            consumo = media / litroAbastecido;
            return consumo;
        }
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getValorCombustivel() {
        var vCombustivel = litroAbastecido * valorCombustivel;
        return vCombustivel;
    }
        public void setValorCombustivel(double valorCombustivel) {
        this.valorCombustivel = valorCombustivel;
    }

    public double getKmRodado() {
        return kmRodado;
    }

    public void setKmRodado(double kmRodado) {
        this.kmRodado = kmRodado;
    }

    public double getCapacidadeDoTanque() {
        return capacidadeDoTanque;
    }

    public void setCapacidadeDoTanque(double capacidadeDoTanque) {
        this.capacidadeDoTanque = capacidadeDoTanque;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }




}



