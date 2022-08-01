package br.com.inmetrics.Veiculos;

public class Car{

    String cor;
    String model;
    int capacidadeTanque;

    Car(){

    }
    Car(String cor, String model, int capacidadeTanque){
        this.cor = cor;
        this.model = model;
        this.capacidadeTanque = capacidadeTanque;


    }


    public String getCor() {
        return cor;

    }


    public void setCor(String cor) {
        this.cor = cor;

    }


    public String getModel() {
        return model;

    }


    public void setModel(String model) {
        this.model = model;

    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }



    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;

    }

    double totalValorDoTanque (double valorCombustivel) {
        return capacidadeTanque * valorCombustivel;

    }
}
