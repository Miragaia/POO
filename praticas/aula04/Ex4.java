package Aula04;

import java.util.Scanner;

public class Ex4 {
    
    public static void main(String[] args) {
        int month = read("mes?",1,12);
        int year = read("ano?",0,9999);
        int day = read("Primeiro dia do ano? (1 = Su, 2 = Mo, 3 = Tu, 4 = We, 5 = Th, 6 = Fr, 7 = Sa)",1,7);
        Calendario(month, year, day);
        
    }

    public static int read(String text, int min, int max ){
        int num;
        Scanner val = new Scanner(System.in);
        val.close();
        do{
            System.out.println(text);
            num = val.nextInt();
        }while(num >max || num <min);
            return num;
    }

    public static int dias(int mes, int ano){
        int dias;
        int[] diasm = {31,00,31,30,31,30,31,31,30,31,30,31};
        if( mes==2){
            if((ano%100 != 0 && ano%4 == 0) || ano%400 == 0){
                dias = 29;
            }
            else{
                dias = 28;
            }
        } 
        else{
            dias = diasm[mes-1];
        }
        return dias;
    }

    public static String meses(int mes){
        String[] meses = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
        String nome = meses[mes-1];
        return nome;
    }

    public static void Calendario(int mes, int ano, int day){
        int dias = dias(mes, ano);
        String meses = meses(mes);
        System.out.printf("%11s %-10s\n",meses,ano);
        System.out.printf("%3s%3s%3s%3s%3s%3s%3s\n", "Su", "Mo", "Tu", "We", "Th", "Fr", "Sa");
        for(int l=0; l<6; l++) {
            for(int c=1; c<8; c++) {
                if( ((l*7 + (c-day + 1)) > dias) || (l==0 && c<day )) {
                    System.out.printf("%3s", " ");
                }
                else{
                    System.out.printf("%3d", ((c-day+1)+l*7));
                }
            }
            System.out.println();
        }
    }
}