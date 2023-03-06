package Aula03;

import java.util.Random;

public class Ex8 {
    public static void main(String[] args) {
        double notaP,notaT,notaF,rando;
        notaF=0;
        double m[][]=new double[16][3];
        Random rand =new Random();
        rando=21;
        for (int i=0;i<16;i++){ 
                notaT=rand.nextDouble(rando);
                notaP=rand.nextDouble(rando);
                m[i][0]=notaT;
                m[i][1]=notaP;
                if (notaT<7.0||notaP<7.0){
                    notaF=66;
                    m[i][2]=notaF;
                }else{
                    notaF=(0.4*notaT)+(0.6*notaP);
                    m[i][2]=notaF;
                }
        }
        System.out.println("NotaT  NotaP  NotaF");
        for (int i=0;i<16;i++){ 
                System.out.printf("%,.2f  %,.2f  %,.2f",m[i][0],m[i][1],m[i][2]);
                System.out.print("\n");
            
        }
    }
}
