package exercicios;

import java.util.Scanner;

public class exercicio5 {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.print("Digite a taxa de crescimento anual de A (%): ");
        double taxa = sc.nextDouble();

        double A = 50000;
        double B = 150000;
        int anos = 0;

        while (A < B) {
            A += A * taxa / 100;
            B += B * 1.5 / 100;
            anos++;

            System.out.println("Ano " + anos + " | A: " + (int)A + " | B: " + (int)B);

            if ((B - A) < 10000 || anos % 5 == 0) {
                System.out.println("Atencao: Cidades se aproximando em tamanho!");
            }
        }

        System.out.println("Cidade A ultrapassou Cidade B no ano " + anos);
        sc.close();

    }
}
