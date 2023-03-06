package Treino.Aula03;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um valor positivo");
        int n = scanner.nextInt();
        System.out.println("Contagem: ");
        while (n-1>=0){
            System.out.println(n);
            n--;
        }
        System.out.println("0");
        scanner.close();
    }
}
