package exercicios;

import java.util.Scanner;

public class exercicio2 {
    static void main() {
        Scanner sc= new Scanner(System.in);
        long a = 0, b = 1;
        long soma = 0;
        while (true){
            long proximo= a+b;

            if (proximo >= 50000) break;

            if (proximo % 2 != 0 && proximo % 3 == 0) {
                soma += proximo;
            }
             a = b ;
             b = proximo;
             System.out.println(" soma total " +soma);
             sc.close();
            }


        }
    }

