package Aula03;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        double invs,total;
        float jr,jrf;
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduza o valor do investimento inicial( número positivo e multiplo de mil): ");
        invs=sc.nextDouble();
        if ((invs<0)||(invs%1000!=0)){
            do{
                System.out.println("Introduza o valor do investimento inicial( número positivo e multiplo de mil): ");
                invs=sc.nextDouble();
            }while((invs<0)||(invs%1000!=0));    
        }
        System.out.println("Introduza o valor do juro(%)(0-5): ");
        jr=sc.nextFloat();
        if ((jr<0) || (jr>5)){
            do {
                System.out.println("Introduza o valor do juro(%)(0-5): ");
                jr=sc.nextFloat();
            }while ((jr<0) || (jr>5));
        }
        jrf=jr/100;

        sc.close();
        total=invs;
        for (int i=0;i<12;i++){
            total=total+(total*jrf);
            
            System.out.println("Com um investimento inicial de "+invs+" e com uma taxa de juro mensal de "+ jr+" ao fim do "+ (i+1)+"º mes o valor total será  de "+ total+"euros");
        }
    }
}
