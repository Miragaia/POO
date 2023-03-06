package Aula07;

public class Triangulo {
    private double l1;
    private double l2;
    private double l3;
    private String cor;

    // Construtores

    public Triangulo(double l1, double l2, double l3, String cor) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
        this.cor = cor;
    }

    // getters e setters

    public double getL1() {
        return l1;
    }

    public double getL2() {
        return l2;
    }

    public double getL3() {
        return l3;
    }

    public String getcor() {
        return cor;
    }

    public void setL1(double l1) {
        this.l1 = l1;
    }

    public void setL2(double l2) {
        this.l2 = l2;
    }

    public void setL3(double l3) {
        this.l3 = l3;
    }

    public void setcor(String cor) {
        this.cor = cor;
    }

    // Overrides

    @Override
    public String toString() {
        return "Triangulo [lado1=" + l1 + ", lado2=" + l2 + ", lado3=" + l3 + ", Perimetro=" + Perimetro() + ", Area="
                + Area() + cor + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(l1);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(l2);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(l3);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Triangulo other = (Triangulo) obj;
        if (Double.doubleToLongBits(l1) != Double.doubleToLongBits(other.l1))
            return false;
        if (Double.doubleToLongBits(l2) != Double.doubleToLongBits(other.l2))
            return false;
        if (Double.doubleToLongBits(l3) != Double.doubleToLongBits(other.l3))
            return false;
        if (cor != other.cor )
            return false;
        return true;
    }

    // outros métodos

    public double Perimetro() {
        return (l1 + l2 + l3);
    }

    public double Area() { 
        double p = this.Perimetro() / 2;
        return Math.sqrt(p * (p - l1) * (p - l2) * (p - l3));
    }

}
