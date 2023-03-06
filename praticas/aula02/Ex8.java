package Aula02;

import java.util.Scanner;
import java.lang.Math;

public class Ex8 {
    public static void main(String[] args) {
        double cateto1,cateto2,hip1,hip,ang ;
        System.out.print("Insira o valor do cateto 1: ");
        Scanner cat1 = new Scanner(System.in);
        cateto1 = cat1.nextDouble();

        System.out.print("Insira o valor do cateto 2: ");
        Scanner cat2 = new Scanner(System.in);
        cateto2 = cat2.nextDouble();
        hip1 = Math.pow(cateto1,2) + Math.pow(cateto2,2);
        hip = Math.sqrt(hip1);
        System.out.printf("O valor da hipotenusa é %.2f: ", hip);
        ang = Math.toDegrees(Math.cos(cateto1/hip));
        System.out.printf("O valor do angulo é %.3f: ",ang); 
        cat1.close();
        cat2.close();
    }
}
