package Aula03;

import java.util.Random;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        int n,tent,nrtent,rando;
        nrtent=1;
        Random rand =new Random();
        rando=101;
        n=rand.nextInt(rando); 
        Scanner sc= new Scanner(System.in);
        System.out.println("Tentiva(0-100): ");
        tent=sc.nextInt();
        if (tent==n){
            nrtent=1;    
        }else{
            do {
                nrtent+=1; 
                if (n<tent){
                    System.out.println("Demasiado Alto");
                }   
                if (n>tent){
                    System.out.println("Demasiado Baixo");
                }  
                System.out.println("Tentativa(0-100): ");
                tent=sc.nextInt();         
            } while(tent!=n);
        }
        System.out.println(" Acertou o numero "+n+" ao fim da "+nrtent+"ª tentativa.");
        System.out.println("Pretende Continuar:(S/Sim)");
        String resposta=sc.next();
        String s2="S";
        String s1="Sim";
        if ((resposta.equals(s2)) ||(resposta.equals(s1))){
            do {
                rando=101;
                n=rand.nextInt(rando); 
                System.out.println("Tentiva(0-100): ");
                tent=sc.nextInt();
                if (tent==n){
                    nrtent=1;    
                }else{
                    do {
                        nrtent+=1; 
                        if (n<tent){
                            System.out.println("Demasiado Alto");
                        }   
                        if (n>tent){
                            System.out.println("Demasiado Baixo");
                        }  
                        System.out.println("Tentativa(0-100): ");
                        tent=sc.nextInt();         
                    } while(tent!=n);
                }
                sc.close();
                System.out.println(" Acertou o numero "+n+" ao fim da "+nrtent+"ª tentativa.");
                System.out.println("Pretende Continuar:(S/Sim)");
                resposta=sc.next();
            } while ((resposta=="S") ||(resposta=="Sim"));
        }else{
            System.out.print("Obrigado por ter jogado");
        }
        sc.close();
    }
    
}
