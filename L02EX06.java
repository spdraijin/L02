package L02;

import java.util.Scanner;

public class L02EX06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double productPrice;
        int paymentMethod;

        System.out.println("Digite o preço do produto: ");
        productPrice = input.nextDouble();

        System.out.println("Informe o método de pagamento (0 para cartão, 1 para a vista):");
        paymentMethod = input.nextInt();

        if (paymentMethod == 1) {
            productPrice = productPrice - (productPrice * 0.10);
        }

        System.out.println("O preço final do produto é de: " + productPrice + " reais");
    }
}
