package Aula02;

import java.lang.Math;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        double x1,x2,y1,y2,dist;
        System.out.print("Insira a abcissa de p1: ");
        Scanner xp1 = new Scanner(System.in);
        x1 = xp1.nextDouble();

        System.out.print("Insira a oordenada de p1: ");
        Scanner yp1 = new Scanner(System.in);
        y1 = yp1.nextDouble();

        System.out.print("Insira a abcissa de p2: ");
        Scanner xp2 = new Scanner(System.in);
        x2 = xp2.nextDouble();

        System.out.print("Insira a oordenada de p2: ");
        Scanner yp2 = new Scanner(System.in);
        y2 = yp2.nextDouble();

        dist = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.println("O valor da distancia entre p1 e p2 é: "+dist);
        xp1.close();
        xp2.close();
        yp1.close();
        yp2.close();
    }
}
