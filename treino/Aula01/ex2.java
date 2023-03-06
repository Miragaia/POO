package Treino.Aula01;

import java.util.Scanner;


public class ex2 {
    public static void main(String[] args) {
        System.out.println("Insira o valor em graus celsius.");
        Scanner sc = new Scanner(System.in);
        double celsius = sc.nextDouble();
        System.out.println("Celsius: " + celsius);
        double fahrenheit = celsius *1.8 +32;
        System.out.println("Fahrenheit: " + fahrenheit);
        sc.close();
    }
}
