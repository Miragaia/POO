package Aula03;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Numero inteiro positivo:(0=STOP) ");
        n=sc.nextInt();
        while (n!=0){
            if (n>=0){
                if ((((n%2==0)||(n%3==0))||((n==4)||(n==1)))&&((n!=2)&&(n!=3))){
                    System.out.println("Numero introduzido é um numero natural não primo");            
                }else{
                    System.out.println("Numero introduzido é um numero natural primo");                
                }
            }else{
                System.out.println("Numero invalido!");
                System.out.println("Numero inteiro positivo:(0=STOP): ");
            }
            System.out.println("Numero inteiro positivo:(0=STOP): ");
            n=sc.nextInt();
        }
        sc.close();

    }
    
}
