package Treino.Exercicios1;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        int a;
        int b;

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor de A");
        a = sc.nextInt();
        do{
            System.out.println("Insira o valor de B");
            b = sc.nextInt();
        } while (b<a);
        sc.close();
        System.out.println("Numeros primos entre A e B");
        for(int i=a; i<=b; i++) {
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}
