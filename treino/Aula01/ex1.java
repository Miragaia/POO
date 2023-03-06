package Treino.Aula01;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km = sc.nextDouble();
        double miles = km / 1.609;
        System.out.println("km: " + km + " miles: " + miles);
        sc.close();
    }
}
