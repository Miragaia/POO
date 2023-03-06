package Aula03;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        int mes,ano, dias;
        Scanner sc= new Scanner(System.in);
        System.out.println("mês(1-12): ");
        mes=sc.nextInt();
        if ((mes>12)||(mes<1)){
            do {
                System.out.println("mês(1-12): ");
                mes=sc.nextInt();
            } while ((mes>12)||(mes<12));
        }
        System.out.println("ano: ");
        ano=sc.nextInt();
        if ((ano<0)||(ano>2022)){
            do {
                System.out.println("ano: ");
                ano=sc.nextInt();
            } while  ((ano<0)||(ano>2022));
        }
        sc.close();
        dias=0;
        if ((mes==1)||(mes==3)||(mes==5)||(mes==7)||(mes==8)||(mes==10)||(mes==12)){
            dias=31;
        }
        if ((mes==4)||(mes==6)||(mes==9)||(mes==11)){
            dias=30;
        }
        if (mes==2){
            if ((ano%4==0)&& (ano%100!=0)){
                dias=29;
            }else{
                dias=28;
            }
            if ((ano%4==0)&& (ano%400==0)){
                dias=29;
            }
        }

        System.out.println("O mês "+mes+" do ano de "+ano+" teve "+dias+" dias.");

    }
}
