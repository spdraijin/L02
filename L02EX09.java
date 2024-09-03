package L02;

import java.util.Scanner;

public class L02EX09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double priceByMinute, finalPrice, totalTime;
        int timeMin, timeSec;

        System.out.println("Digite o preço do minuto:");
        priceByMinute = input.nextDouble();

        System.out.println("Digite quantos minutos e segundos a conversa durou:");
        System.out.print("Minutos: ");
        timeMin = input.nextInt();
        System.out.print("Segundos: ");
        timeSec = input.nextInt();

        totalTime = timeMin + (timeSec / 60);
        finalPrice = totalTime * priceByMinute;

        System.out.println("O preço a pagar é de: R$" + finalPrice);
    }
}
