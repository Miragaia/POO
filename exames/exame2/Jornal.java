package imagina2;

public class Jornal extends Publicacoes {
    private Ver cor;
    private Periodicidade periodicidade;

    public Jornal(String titulo, String editora, Ver cor, Periodicidade periodicidade) {
        super(titulo, editora);
        this.cor = cor;
        this.periodicidade = periodicidade;
    }

    public Periodicidade getPeriodicidade() {
        return periodicidade;
    }

    public void setPeriodicidade(Periodicidade periodicidade) {
        this.periodicidade = periodicidade;
    }

    public Ver getCor() {
        return cor;
    }

    public void setCor(Ver cor) {
        this.cor = cor;
    }

    public Jornal(String titulo, String editora, Ver cor) {
        super(titulo, editora);
        this.cor = cor;
    }

    

    public Jornal(String titulo) {
        super(titulo);
    }

    public Jornal(String titulo, Ver cor) {
        super(titulo);
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Jornal [cor=" + cor + ", periodicidade=" + periodicidade + "]";
    }

    
}
