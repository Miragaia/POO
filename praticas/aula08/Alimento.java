package Aula08;

public class Alimento {
    private double proteinas;
    private double calorias;
    private double peso;
    public enum tipodecarne{vaca,porco,peru,frango,outra}
    public enum tipodepeixe{congelado,fresco}


    public Alimento(double proteinas, double calorias, double peso){
        this.proteinas = proteinas; this.calorias = calorias; this.peso = peso;
    }


    public double getprot(){
        return proteinas;
    }

    public double getCalorias() {
        return calorias;
    }

    public double getPeso() {
        return peso;
    }
}

