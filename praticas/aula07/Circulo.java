package Aula07;

public class Circulo {
    private double raio;
    private Ponto centro;
    private String cor;

    // Contrutores

    public Circulo() {
        this.centro = new Ponto(0, 0);
        this.raio = 1;
    }

    public Circulo(double raio) {
        this.centro = new Ponto(0, 0);
        this.raio = raio;
    }

    public Circulo(Ponto centro) {
        this.centro = centro;
        this.raio = 1;
    }

    public Circulo(Ponto centro, double raio, String cor) {
        this.centro = centro;
        this.raio = raio;
        this.cor = cor;
    }

    // Getters e setters

    public String getcor() {
        return cor;
    }

    public double getRaio() {
        return raio;
    }

    public Ponto getCentro() {
        return centro;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public void setCentro(Ponto centro) {
        this.centro = centro;
    }

    // Overrides

    @Override
    public String toString() {
        return "Circulo [raio=" + raio + ", centro=" + centro + ", Area=" + Area() + ", Perimetro=" + Perimetro() + cor + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((centro == null) ? 0 : centro.hashCode());
        long temp;
        temp = Double.doubleToLongBits(raio);
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
        Circulo other = (Circulo) obj;
        if (centro == null) {
            if (other.centro != null)
                return false;
        } else if (!centro.equals(other.centro))
            return false;
        if (Double.doubleToLongBits(raio) != Double.doubleToLongBits(other.raio))
            return false;
        if (cor != other.cor )
            return false;
        return true;
    }

    // outros m??todos

    public double Area() {
        return Math.PI * Math.pow(this.raio, 2);
    }

    public double Perimetro() {
        return Math.PI * 2 * this.raio;
    }

    public boolean intersectsWith(Circulo c) {
        double d = this.centro.distanceTo(c.centro);

        if (d < this.raio + c.raio) {
            return true;
        } else {
            return false;
        }
    }
}
