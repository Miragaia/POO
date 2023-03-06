package Aula04;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        StringBuilder Acr = new StringBuilder();
        String newAcr;
        System.out.print("Introduza uma frase: ");
        Scanner val = new Scanner( System.in);
        String frase = val.nextLine();
        val.close();
        String[] splitted = frase.split("\\s");
        for ( String word : splitted){
            if (word.length()>3){
                Acr.append(Character.toUpperCase(word.charAt(0)));
            }
        }
        newAcr = Acr.toString();
        System.out.println("O acronimo da frase introduzida é: "+newAcr);
    }
}
