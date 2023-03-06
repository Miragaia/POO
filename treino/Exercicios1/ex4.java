package Treino.Exercicios1;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número inteiro: ");
        int n = sc.nextInt();
        sc.close();
        int n0=1;
        int n1=1;

        while(true) {
            n1 += n0;
            n0 = n1 - n0;

            if(n1 == n) {
                System.out.println("O número faz parte da sequência de Fibonacci.");
                break;
            }

            if(n0 < n && n1 > n) {
                System.out.println("O número não faz parte da sequência de Fibonacci.");
                break;
            }
        }
    }
}
