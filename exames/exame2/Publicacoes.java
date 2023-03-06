package imagina2;

public class Publicacoes implements Comparable<Publicacoes>{
    private String titulo, editora;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Publicacoes(String titulo) {
        this.titulo = titulo;
    }

    public Publicacoes(String titulo, String editora) {
        this.titulo = titulo;
        this.editora = editora;
    }


    @Override
    public String toString() {
        return "Publicacoes [editora=" + editora + ", titulo=" + titulo + "]";
    }

    @Override
    public int compareTo(Publicacoes o) {
        return 0;
    }

    
}
