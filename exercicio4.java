package exercicios;

import java.util.Scanner;

public class exercicio4 {
    static void main() {
        Scanner sc= new Scanner(System.in);

        while (true) {
            System.out.print("Digite o consumo em m3 (0 para sair): ");
            double consumo = sc.nextDouble();

            if (consumo == 0) break; ;
            double conta;

            if (consumo <= 15) {
                conta = 35.00;
            } else if (consumo <= 30) {
                conta = 35.00 + (consumo - 15) * 4.50;
            } else {
                conta = 35.00 + (15 * 4.50) + (consumo - 30) * 7.00;
            }

            System.out.printf("Valor da conta: R$ %.2f%n%n", conta);
        }

        System.out.println("Programa encerrado.");
        sc.close();
    }
}
