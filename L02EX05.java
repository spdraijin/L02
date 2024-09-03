package L02;

import java.util.Scanner;

public class L02EX05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int hiringYear, currentYear;
        double initialSalary, currentSalary;
        long cpf, phoneNumber;

        System.out.println("Digite o nome do funcionário");
        name = input.nextLine();

        System.out.println("Digite o CPF do funcionário:");
        cpf = input.nextLong();

        System.out.println("Digite o salário inicial do funcionário:");
        initialSalary = input.nextDouble();

        System.out.println("Digite o número de celular do funcionário:");
        phoneNumber = input.nextLong();

        System.out.println("Digite o ano de contratação do funcionário:");
        hiringYear = input.nextInt();

        System.out.println("Digite o ano atual:");
        currentYear = input.nextInt();

        currentSalary = initialSalary + ((currentYear - hiringYear) * 75);

        System.out.println("Nome: " + name +
                "\nCPF: " + cpf +
                "\nNúmero de celular: " + phoneNumber +
                "\nAno de contratação: " + hiringYear +
                "\nSalário Atual: R$" + currentSalary + " reais");

    }
}
