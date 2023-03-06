package Aula04;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        System.out.print("Insira uma frase: ");
        Scanner val = new Scanner(System.in);
        String frase = val.nextLine();
        System.out.println("A frase apresentada em minusculas é: "+ frase.toLowerCase());
        System.out.println("O ultimo caracter da frase é: "+ frase.charAt(frase.length()-1));
        System.out.println("Os 3 primeiros caracteres da frase são: "+ frase.substring(0, 3));
        System.out.println("A frase apresentada em maisculas é: " + frase.toUpperCase());
        System.out.println("A seguinte sequencia de caracteres (ola) está presente na frase? "+ frase.contains("ola"));
        System.out.println("O valor em Unicode da primeira letra da frase é: "+ frase.codePointAt(0));
        val.close();
    }
}
