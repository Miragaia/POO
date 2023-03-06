package Aula02;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        double d1,d2,v1,v2,t1,t2,vm;
        System.out.print("Insira o valor da distância percorrida no trajeto 1: ");
        Scanner dist1 = new Scanner(System.in);
        d1 = dist1.nextDouble();

        System.out.print("Insira o valor da velocidade no trajeto 1: ");
        Scanner vel1 = new Scanner(System.in);
        v1 = vel1.nextDouble();

        t1= d1/v1;

        System.out.print("Insira o valor da distância percorrida no trajeto 2: ");
        Scanner dist2 = new Scanner(System.in);
        d2 = dist2.nextDouble();

        System.out.print("Insira o valor da velocidade no trajeto 2: ");
        Scanner vel2 = new Scanner(System.in);
        v2 = vel2.nextDouble();

        t2= d2/v2;
        
        vm= ((d1+d2)/(t1+t2));
        System.out.println("O valor da velocidade média é: "+vm);

        dist1.close();
        dist2.close();
        vel1.close();
        vel2.close();
    
    }
}
