package Aula02;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        double km, miles;
        System.out.print("Insira o valor da distancia em km: ");
        Scanner val = new Scanner (System.in);
        km = val.nextDouble();
        miles = km / 1.609;
        System.out.println("O valor da distância em milhas é "+ miles);
        val.close();
    }
}