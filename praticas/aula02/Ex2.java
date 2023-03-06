package Aula02;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        double grausC, grausF;
        System.out.print("Insira o valor da temperatura em graus Célsius: ");
        Scanner val = new Scanner (System.in);
        grausC = val.nextDouble();
        grausF = grausC * 1.8 +32;
        System.out.println("O valor da temperatura em grausFahrenheit é: "+ grausF);
        val.close();
    }
}
