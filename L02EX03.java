package L02;

import java.util.Scanner;

public class L02EX03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mainWeight, dessertWeight, mainPrice, dessertPrice, finalPrice;

        System.out.println("Digite o peso do prato principal (em gramas): ");
        mainWeight = input.nextDouble();

        System.out.println("Digite o peso da sobremesa (em gramas): ");
        dessertWeight = input.nextDouble();

        mainPrice = mainWeight * 0.075;
        dessertPrice = dessertWeight * 0.089;
        finalPrice = mainPrice + dessertPrice;

        System.out.println("O preço do prato principal foi de: " + mainPrice + " reais"
                + "\n o preço da sobremesa foi de: " + dessertPrice + " reais" +
                "\ne o preço total da refeição foi de: " + finalPrice + " reais");
    }
}
