package imagina;

public class Suite extends Cabine {
    private int quartos;

    public int getQuartos() {
        return quartos;
    }

    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }

    public Suite(int numero, int capmax, String[] ocupantes) {
        super(numero, capmax, ocupantes);
    }

    public Suite(int numero, int capmax) {
        super(numero, capmax);
    }

    @Override
    public String toString() {
        return "Suite [quartos=" + quartos + "]";
    }

    
}
