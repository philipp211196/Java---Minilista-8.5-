package exercicios;

import java.util.Scanner;

public class exercicio1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num1, passos = 0;
        System.out.println("Digite um numero inteiro positivo.");
        num1 = sc.nextInt();
        while (num1 != 1) {
            if (num1 % 2 == 0) {
                num1=num1/2;

                 System.out.println(num1 + " /2 = " + (num1 / 2));

            } else {

                System.out.println(num1 + " * 3 + 1 = " + (num1 * 3 + 1));

                  num1 = num1 * 3 + 1;

            } passos++;

            System.out.println("\nQuantidade de passos necessários: " + passos);

            sc.close();

        }
    }}
