package imagina;

public class CabineComJanela extends Cabine {
    private TipoDeJanela tipo;
    private Extras extra;

    public Extras getExtra() {
        return extra;
    }

    public void setExtra(Extras extra) {
        this.extra = extra;
    }

    public TipoDeJanela getTipo() {
        return tipo;
    }

    public void setTipo(TipoDeJanela tipo) {
        this.tipo = tipo;
    }

    public CabineComJanela(int numero, int capmax, String[] ocupantes, TipoDeJanela tipo, Extras extra) {
        super(numero, capmax, ocupantes);
        this.tipo = tipo;
        this.extra = extra;
    }

    public CabineComJanela(int numero, int capmax, TipoDeJanela tipo, Extras extra) {
        super(numero, capmax);
        this.tipo = tipo;
        this.extra = extra;
    }

    public CabineComJanela(int numero, int capmax, TipoDeJanela tipo) {
        super(numero, capmax);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "CabineComJanela [extra=" + extra + ", tipo=" + tipo + "]";
    }

    
}
