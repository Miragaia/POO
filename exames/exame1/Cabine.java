package imagina;

import java.util.Arrays;

public class Cabine implements Comparable<Cabine> {
    private int numero, capmax;
    private String[] ocupantes;


    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getCapmax() {
        return capmax;
    }
    public void setCapmax(int capmax) {
        this.capmax = capmax;
    }
    public String[] getOcupantes() {
        return ocupantes;
    }
    public void setOcupantes(String[] ocupantes) {
        this.ocupantes = ocupantes;
    }
    public Cabine(int numero, int capmax, String[] ocupantes) {
        this.numero = numero;
        this.capmax = capmax;
        this.ocupantes = ocupantes;
    }

    public Cabine(int numero, int capmax) {
        this.numero = numero;
        this.capmax = capmax;
    }

    public void setPassageiros(String[] ocupantes) {
        this.ocupantes = ocupantes.clone();
    }

    @Override
    public String toString() {
        return "Cabine [capmax=" + capmax + ", numero=" + numero + ", ocupantes=" + Arrays.toString(ocupantes) + "]";
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }
    @Override
    public int compareTo(Cabine o) {
        // TODO Auto-generated method stub
        return 0;
    }

    
}
