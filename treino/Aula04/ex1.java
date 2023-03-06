package Treino.Aula04;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Insira uma String: ");
        String str = sc.nextLine();
        System.out.println("String convertida para minusculas: " + str.toLowerCase() );
        System.out.println("Ultimo caracter da String: " + str.charAt(str.length()-1) );
        System.out.println("Tres primeiros caracteres da String: " + str.substring(0, 3) );
        sc.close();
    }
}
