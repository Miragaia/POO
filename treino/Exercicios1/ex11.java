package Treino.Exercicios1;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de funcionários: ");
        int n = sc.nextInt();
        int counter=0;
        sc.close();

        double salarios[] = new double[n];

        for(int i = 0; i < salarios.length; i++) {
            int s = (int)(Math.random()*2000);
            salarios[i] = s;
        }
        for (int i = 0; i < salarios.length; i++) {
            if (salarios[i] > media(salarios)) {
                counter++;
            }
        }
        System.out.println("O numero de funcionário com salario superior à média é: " + counter);
    }

    public static double media(double salarios[]){
        double salariostotal = 0;
        for(int i = 0; i < salarios.length; i++) {
            salariostotal += salarios[i];
        }
        double salariomedia = salariostotal / salarios.length;
        return salariomedia;
    }
}
