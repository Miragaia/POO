package Treino.Exercicios1;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        int numero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um numero inteiro");
        numero = scanner.nextInt();
        String binario = Integer.toBinaryString(numero);
        System.out.println("O valor do numero em binário é: " + binario);
        scanner.close();
    }
}
