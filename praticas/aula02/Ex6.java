package Aula02;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        int sec, hours, min;
        System.out.print("Insira o valor em segundos: ");
        Scanner seg = new Scanner(System.in);
        sec = seg.nextInt();
        hours= sec/3600;
        min = (sec%3600)/60;
        sec= (sec%3600)%60;
        System.out.println(hours+":"+sec+":"+min);
        seg.close();
       }
}
