package Treino.Exercicios1;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Reais emprestados: ");
        double P = sc.nextDouble();
        System.out.print("Reais pagos por mês: ");
        double A = sc.nextDouble();
        System.out.print("Juros: ");
        double i = sc.nextDouble();
        sc.close();

        System.out.println();

        int totMeses = 0;
        double totJuros = 0;
        double totPago = 0;
        double naoPago = P;

        while(naoPago != 0) {
            double juros = (i/100)*naoPago;
            double pago = 0;

            if(naoPago < A-juros) {
                totJuros += juros;
                pago = naoPago;
                totPago += pago;
                naoPago = 0;
            } else {
                totJuros += juros;
                pago = A - juros;
                totPago += pago;
                naoPago = P - totPago;
            }

            System.out.printf("Mês %s", totMeses+1);
            System.out.println();
            System.out.println("Juros pagos: " + juros);
            System.out.println("Dinheiro aplicado no pagamento da dívida: " + pago);
            System.out.println("Acumulado de juros pagos: " + totJuros);
            System.out.println("Valor por pagar do empréstimo: " + naoPago);
            System.out.println();
            totMeses++;
        }

        System.out.println("Número de meses necessários: " + totMeses);
    }
}