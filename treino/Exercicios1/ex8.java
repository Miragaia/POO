package Treino.Exercicios1;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        int valor;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o valor: ");
        valor = scanner.nextInt();
        scanner.close();
        System.out.println("O valor é primo? " + Primo(valor));
    }

    public static boolean Primo(int valor) {
        for(int i = 2; i <= valor/2; i++) {
            if (valor ==2) {
                return true;
            }
            else if(valor%i == 0) {
                return false;
            }
        }
        return true;
    }
}
