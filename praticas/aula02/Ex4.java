package Aula02;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        double montante, juros;
        System.out.print("Indique o valor do montante do investimento: ");
        Scanner m = new Scanner(System.in);
        montante = m.nextDouble();

        System.out.print("Indique o valor da taxa de juros mensais: "); //valor recebido em percentagem
        Scanner j = new Scanner(System.in);
        juros = j.nextDouble();
        juros = juros /100;

        for (int i=1; i<=3; i++)
            montante += (juros*montante);
        System.out.println("O valor do montante final é: "+ montante);
        m.close();
        j.close();
    }
}
