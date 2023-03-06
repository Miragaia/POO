package Aula07;

public class Ex1 {
    public static void main(String[] args) {
        Ponto p1 = new Ponto(0, 0);
        Circulo c1 = new Circulo(p1, 3, "laranja");
        Ponto p2 = new Ponto(0, 0);
        Circulo c2 = new Circulo(p2, 3, "vermelho");

        System.out.println(c2.intersectsWith(c1));
        System.out.println(c2.equals(c1));
    }

}
