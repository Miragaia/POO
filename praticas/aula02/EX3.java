package Aula02;
import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        double M,TI,TF,Q;
        System.out.print("Insira o valor de M:");
        Scanner m = new Scanner( System.in);
        M = m.nextDouble();

        System.out.print("Insira o valor de TI:");
        Scanner ti = new Scanner( System.in);
        TI = ti.nextDouble();

        System.out.print("Insira o valor de TF:");
        Scanner tf = new Scanner( System.in);
        TF = tf.nextDouble();

        Q = M* (TF-TI)*4184;
        System.out.println("O valor da energia Q (em Joules) é: "+ Q);
        m.close();
        tf.close();
        ti.close();
    }
}
