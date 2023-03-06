package Aula03;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Numero inteiro positivo: ");
        n=sc.nextInt();
        sc.close();
        if (n>0){
            while (n!=0) {
                n=n-1;
                System.out.println(n);
            }
        }else{
            System.out.println("Numero negativo!!");
        }
    }
    
}
