package L02;

import java.util.Scanner;

public class L02EX04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mainWeight, dessertWeight, mainPrice, dessertPrice, finalPrice, drinkPrice, coffeePrice;
        int coffeeQuantity;

        System.out.println("Digite o peso do prato principal (em gramas):");
        mainWeight = input.nextDouble();

        System.out.println("Digite o peso da sobremesa (em gramas):");
        dessertWeight = input.nextDouble();

        mainPrice = mainWeight * 0.0179;
        dessertPrice = dessertWeight * 0.0259;

        System.out.println("Digite o valor da bebida:");
        drinkPrice = input.nextDouble();

        System.out.println("Digite quantas unidades de café foram pedidas:");
        coffeeQuantity = input.nextInt();
        coffeePrice = coffeeQuantity * 2;

        finalPrice = mainPrice + dessertPrice + drinkPrice + coffeePrice;

        System.out.println("O valor do prato principal foi de: " + mainPrice + " reais"
                + "\n o valor da sobremesa foi de: " + dessertPrice + " reais"
                + "\n o valor da bebida foi de: " + drinkPrice + " reais"
                + "\n o valor do café foi de: " + coffeePrice + " reais"
                + "\n e o valor total da refeição foi de: " + finalPrice + " reais");
    }
}
