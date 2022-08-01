package br.com.inmetrics.Veiculos;

import java.util.Scanner;

public class RunVeiculo extends Veiculo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Veiculo veiculo = new Veiculo();


        System.out.println("Qual a marca do seu veiculo? ");
        String marca = sc.nextLine();
        veiculo.setMarca(marca);

        System.out.println("Qual o modelo do seu veiculo?");
        String modelo = sc.nextLine();
        veiculo.setModelo(modelo);

        System.out.println("Digite o valor do combustivel: ");
        double vCombustivel = Double.parseDouble(sc.nextLine());
        veiculo.setValorCombustivel(vCombustivel);

        System.out.println("Digite o KM rodado: ");
        double kmRodado = Double.parseDouble(sc.nextLine());
        veiculo.setKmRodado(kmRodado);

        System.out.println("Digite a quantidade de litros abastecido: ");
        double litros = Double.parseDouble(sc.nextLine());
        veiculo.setLitroAbastecido(litros);

        System.out.println("Seu veiculo "  + marca + "/" + modelo + " Faz em média: " + veiculo.getConsumo() + "Km/L e tem o gasto de R$ " + veiculo.getValorCombustivel());

    }
}
