package imagina;

public class CabineComVaranda extends Cabine {
    private TipoDeVaranda tipo;
    private Extras extra;

    

    public TipoDeVaranda getTipo() {
        return tipo;
    }



    public void setTipo(TipoDeVaranda tipo) {
        this.tipo = tipo;
    }



    public Extras getExtra() {
        return extra;
    }



    public void setExtra(Extras extra) {
        this.extra = extra;
    }

    public CabineComVaranda(int numero, int capmax, String[] ocupantes, TipoDeVaranda tipo, Extras extra) {
        super(numero, capmax, ocupantes);
        this.tipo = tipo;
        this.extra = extra;
    }



    public CabineComVaranda(int numero, int capmax, TipoDeVaranda tipo, Extras extra) {
        super(numero, capmax);
        this.tipo = tipo;
        this.extra = extra;
    }



    @Override
    public String toString() {
        return "CabineComJanela [extra=" + extra + ", tipo=" + tipo + "]";
    }
}
