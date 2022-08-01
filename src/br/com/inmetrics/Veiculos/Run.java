package br.com.inmetrics.Veiculos;

public class Run {

     public static void main(String[] args) {

          Car carro1 = new Car("cinza","mercedes",66);

               System.out.println("Cor: " + carro1.getCor());
               System.out.println("Modelo: " + carro1.getModel());
               System.out.println("Capacidade do tanque: " + carro1.getCapacidadeTanque());
               System.out.println("Valor do Combustivel: " + carro1.totalValorDoTanque(6.80));
               System.out.println();

          Car carro2 = new Car("Branco","BMW",52);

               System.out.println(carro2.getCor());
               System.out.println(carro2.getModel());
               System.out.println(carro2.getCapacidadeTanque());
               System.out.println(carro2.totalValorDoTanque(6.80));

     }

}
