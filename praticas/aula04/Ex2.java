package Aula04;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        System.out.print("Insira uma frase: ");
        Scanner val = new Scanner(System.in);
        String frase = val.nextLine();
        val.close();
        countDigits(frase);
        countSpaces(frase);
        onlylowercase(frase);
        onlyspace(frase);
        palindromo(frase);
    }

    public static void countDigits(String frase){
        int counter=0;
        for( int i=0; i<frase.length(); i++){
            if (Character.isDigit(frase.charAt(i))){
                counter++;
            }
        }
        System.out.println("A frase apresentada tem "+ counter+ " caracteres numéricos");
    }

    public static void countSpaces(String frase){
        int counters= 0;
        for(char i: frase.toCharArray()){
            if (i == ' '){
                counters++;
            }
        }
        System.out.println("A frase apresentada contem "+ counters+ " espaços");
    }

    public static void onlylowercase(String frase){
        if (frase.toLowerCase() == frase){
            System.out.println("A frase apenas contém caracteres minusculos");
        }
        else{
            System.out.println("A frase não contém apenas caracteres minusculos");
        }
    }

    public static String onlyspace(String frase){
        String nfrase = frase.replaceAll("\\s{2,}"," ");
        return nfrase;
    }

    public static void palindromo(String frase){ 
        StringBuilder newf= new StringBuilder();
        for (int i = (frase.length() - 1); i >= 0; i--){
            newf.append(frase.charAt(i));
        }
        if (frase.equals(newf.toString())){
            System.out.println("A frase é um palindromo");
        }
        else{
            System.out.print("A frase não é um palindromo");
        }
    }
}
