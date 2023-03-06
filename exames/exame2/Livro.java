package imagina2;

public class Livro extends Publicacoes {
    private String ISBN;
    private String[] autores;
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }
    public String[] getAutores() {
        return autores;
    }
    public void setAutores(String[] autores) {
        this.autores = autores;
    }
    public Livro(String titulo, String editora, String string, String iSBN) {
        super(titulo, editora);
        ISBN = iSBN;
    }
    public Livro(String titulo, String editora, String[] autores) {
        super(titulo, editora);
        this.autores = autores;
    }
    public Livro(String titulo, String editora, String iSBN) {
        super(titulo, editora);
        ISBN = iSBN;
    }

    
    
}
