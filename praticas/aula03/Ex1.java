package Aula03;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        double notaP,notaT,nF;
        nF=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Nota Pratica: ");
        notaP=sc.nextFloat();
        System.out.println("Nota Teorica: ");
        notaT=sc.nextFloat();
        sc.close();
        if ((notaT<20.0 && notaT>0.0)&&(notaP>0.0 && notaP<20.0)){
            if (notaT<7.0||notaP<7.0){
                System.out.printf("Codigo 66, reprovado por nota minima");
            }else{
                nF=(0.4*notaT)+(0.6*notaP);
                System.out.println("Nota final é "+ nF);
            }
        }else{
            System.out.println("Valores introduzidos invalidos"); 
        }
    }
    
}
