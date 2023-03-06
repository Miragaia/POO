package Treino.Aula01;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a d1: ");
        double d1 = sc.nextDouble();
        System.out.println("Insira a v1: ");
        double v1 = sc.nextDouble();
        System.out.println("Insira a d2: ");
        double d2 = sc.nextDouble();
        System.out.println("Insira a v2: ");
        double v2 = sc.nextDouble();
        double t1= v1/d1;
        double t2= v2/d2;
        double vm = d1+d2 / t1+t2;
        System.out.println("A velocidade média é: "+  vm);
        sc.close();
    }
}
