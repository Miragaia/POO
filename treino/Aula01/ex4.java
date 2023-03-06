package Treino.Aula01;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o montante");
        double montante = sc.nextDouble();
        System.out.println("Insira a taxa de juros (em %)");
        double taxa = sc.nextDouble();
        double taxa2 = taxa/100;
        for (int i = 1; i < 4; i++) {
            montante += taxa2*montante;
        }
        System.out.println("montante: " + montante);
        sc.close();
    }
}
