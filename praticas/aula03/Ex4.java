package Aula03;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        double n1,n2,maior,menor,n,media,soma;
        Scanner sc= new Scanner(System.in);
        System.out.println("Numero inteiro: ");
        n1=sc.nextDouble();
        n=1;
        soma=n1;
        maior=n1;
        menor=n1;
        do{
            System.out.println("Numero inteiro: ");
            n2=sc.nextDouble();
            n=n+1;
            soma=soma+n2;
            if (n2>maior){
                maior=n2;
            }
            if (n2<menor){
                menor=n2;
            }
        } while(n1!=n2);
        sc.close();
        media=soma/n;
        System.out.println("Nr maior: "+maior);
        System.out.println("Nr menor: "+menor);
        System.out.println("Media: "+media);
        System.out.println("Nrs lidos: "+n);
    }
}
