package Treino.Aula03;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double notaP, notaT;

        do {
            System.out.print("Componente prática: ");
            notaP = sc.nextDouble();
        } while (notaP < 0 || notaP > 20);

        do {
            System.out.print("Componente teórica: ");
            notaT = sc.nextDouble();
        } while (notaT < 0 || notaT > 20);

        double notaF = 0.4 * (double)(Math.round(notaT*10))/10 + 0.6 * (double)(Math.round(notaP*10))/10;

        if(notaP < 7 || notaT < 7){
            System.out.println("Reprovado por nota mínima.");
            System.out.println("Nota final: 66");
        } else if (notaF < 9.5) {
            System.out.println("Reprovado.");
            System.out.println("Nota final: " + Math.round(notaF));
        } else {
            System.out.println("Aluno aprovado.");
            System.out.println("Nota final: " + Math.round(notaF));
        }

        sc.close();
    }
}