package L02;

import java.util.Scanner;

public class L02EX07 {
    public static void main(String[] args) {
        int rentDays;
        int traveledDistance;
        double rentPrice, finalPrice;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o preço da diária do veículo:");
        rentPrice = input.nextDouble();

        System.out.println("Digite quantos dias o cliente ficou com o veículo:");
        rentDays = input.nextInt();

        System.out.println("Digite quantos quilômetros foram rodados:");
        traveledDistance = input.nextInt();

        finalPrice = (rentPrice * rentDays) + (traveledDistance * 0.30);

        System.out.println("O valor final ficou de: R$" + finalPrice + " reais");
    }
}
