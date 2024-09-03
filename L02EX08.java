package L02;

import java.util.Scanner;

public class L02EX08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tempo que irá ficar (em minutos):");
        int time = input.nextInt();

        int fifteenMinBlocks = time / 15;

        double finalPrice = fifteenMinBlocks * 0.5;

        System.out.println("O cliente deverá pagar: R$" + finalPrice + " reais");
    }
}
