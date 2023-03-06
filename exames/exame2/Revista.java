package imagina2;

public class Revista extends Publicacoes {
    private String ISSN;

    public String getISSN() {
        return ISSN;
    }

    public void setISSN(String iSSN) {
        ISSN = iSSN;
    }

    public Revista(String titulo, String editora, String iSSN) {
        super(titulo, editora);
        ISSN = iSSN;
    }

    
}
