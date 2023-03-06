package Aula05;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Date date = null;
        int val;
        int month;
        System.out.print("Escolha um mês entre 1 e 12: ");
        Scanner sc = new Scanner(System.in);
        month = sc.nextInt();
        System.out.print("O mês é valido? ");
        System.out.println(Date.validMonth(month));
        System.out.print("Insira o ano: ");
        int year = sc.nextInt();
        System.out.print("Insira o dia: ");
        int day = sc.nextInt();
        System.out.print("Nesse ano o mês tem: ");
        System.out.println(Date.monthDays(month,year));
        System.out.print("É um ano bissexto? ");
        System.out.println(Date.LeapYear(year));
        System.out.print("A data é valida? ");
        System.out.println(Date.valid(day, month, year));
        sc.close();

        do {
            System.out.println(
                    "Date Operations \n 1 - Create new date \n2 - Show current date \n3 - Increment date \n4 - Decrement date \n0 - Exit");
            val = sc.nextInt();
            while (val < 0 || val > 4) {
                System.out.println("Invalid number, try again");
                val = sc.nextInt();
            }

            switch (val) {
                case 1:
                    System.out.println("Insira o dia");
                    day = sc.nextInt();
                    System.out.println("Insira o mês");
                    month = sc.nextInt();
                    System.out.println("Insira o ano");
                    year = sc.nextInt();
                    date = new Date(day, month, year);
                    break;
                case 2:
                    date.toString();
                    break;
                case 3:
                    date.increment();
                    break;
                case 4:
                    date.decrement();
                    break;
            }
        } while (val != 0);
        sc.close();
    }
}
    
