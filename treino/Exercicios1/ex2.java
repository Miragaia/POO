package Treino.Exercicios1;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        double salario;
        System.out.println("Insira o nome do funcionário (FIM para terminar)");
        nome = sc.nextLine();
        while(true) {
            if(nome.equals("FIM")) {
                break;
            }
            do{
                System.out.println("Insira o salário atual do funcionário");
                salario = sc.nextDouble();
            }while(salario <0);
            System.out.println("Salario atual do funcionário: " + salario);
            System.out.println("Salario ajustado do funcionário: " + novosalario(salario));
            System.out.println("Diferença entre salários: " + Math.abs(novosalario(salario) - salario));
            sc.close();
        }
       
    }

    public static double novosalario (double salario) {
        Scanner sc = new Scanner(System.in);
        double novosalario = salario;
        
        if(salario < 150){
            novosalario= salario*1.25;
        }
        else if(salario <300 && salario >= 150){
            novosalario= salario*1.20;
        }
        else if(salario <600 && salario >= 300){
            novosalario= salario*1.15;
        }
        else if(salario >= 600){
            novosalario= salario*1.10;
        }
        sc.close();

        return novosalario;
    }
}
