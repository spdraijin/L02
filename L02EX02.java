package L02;

import java.util.Scanner;

public class L02EX02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double orderWeight1, orderWeight2, average;

        System.out.println("Informe o peso da primeira encomenda: ");
        orderWeight1 = input.nextDouble();

        System.out.println("Informe o peso da segunda encomenda: ");
        orderWeight2 = input.nextDouble();

        average = (orderWeight1 + orderWeight2) / 2;

        System.out.println("Cada caminhão receberá " + average + "kg");
    }
}
