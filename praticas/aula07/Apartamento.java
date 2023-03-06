package Aula07;

public class Apartamento extends Alojamento {
    private int nquartos;

    public Apartamento(String codigo, String nome, String local, double pnoite, boolean disponibilidade, double avaliação, int nquartos){
        super(codigo,nome,local,pnoite,disponibilidade,avaliação);
        this.nquartos = nquartos;
    }

    public int getnquartos(){
        return nquartos;
    }
}
