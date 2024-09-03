package L02;

import java.util.Scanner;

public class L02EX10 {
    public static void main(String[] args) {
        double kmL, distance, fuelPrice, costPrice, finalPrice;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite quantos km/litro faz o caminhão: ");
        kmL = input.nextDouble();

        System.out.print("Digite a distância da cidade pra entregar a mercadoria: ");
        distance = input.nextDouble();

        System.out.print("Digite o preço atual do combustível: ");
        fuelPrice = input.nextDouble();

        costPrice = ((fuelPrice / kmL) * distance) * 2;
        finalPrice = costPrice * 2;

        System.out.println("O preço de custo é de: R$" + costPrice + " reais" +
                "\n e o preço a ser passado pro cliente é de: R$" + finalPrice + " reais");
    }
}
