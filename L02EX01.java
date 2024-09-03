package L02;

import java.util.Scanner;

public class L02EX01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double p1, p2, sum, average;

        System.out.println("Digite a nota da sua P1: ");
        p1 = input.nextDouble();

        System.out.println("Digite a nota da sua P2: ");
        p2 = input.nextDouble();

        sum = p1 + p2;
        average = sum / 2;

        System.out.println("A sua média é: " + average);
    }
}
