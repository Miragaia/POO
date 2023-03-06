package Aula05;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendar newDate = null; 
        int y;
        int m;
        int yStart;
        int val;

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
                    System.out.print("Insira um ano: ");
                    y = sc.nextInt();
                    System.out.print("Insira o primeiro dia da semana do mês: ");
                    System.out.printf(" %9s | %9s | %9s | %9s | %9s | %9s | %9s \n", "1=Domingo", "2=Segunda",
                            "3=Terça", "4=Quarta", "5=Quinta", "6=Sexta", "7=Sábado");
                    yStart = sc.nextInt();
                    if (yStart >= 1 && yStart <= 7) {
                        newDate = new Calendar(y, yStart);
                    } else {
                        System.out.println("Erro! Insira um dia da semana válido.");
                    }
                    break;
                case 2:
                    System.out.print("Insira um mês: ");
                    m = sc.nextInt();
                    if (Date.validMonth(m)) {
                        System.out.print(newDate.printMonth(m));
                    } else {
                        System.out.println("Erro! Insira um mês válido.");
                    }
                    break;
                case 3:
                    System.out.print(newDate);
                    break;
                case 4:

                    break;
            }
        } while (val != 0);
        sc.close();
    }

}
