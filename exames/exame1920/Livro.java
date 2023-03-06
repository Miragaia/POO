package imagina1920;

import java.util.Set;

public class Livro extends Produto{
    private String titulo;
    private Set<Autor> autores;
    private static final double IVA = 0.6;
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Set<Autor> getLista() {
        return autores;
    }
    public void setAutores(Set<Autor> autores) {
        this.autores = autores;
    }
    public static double getIva() {
        return IVA;
    }
    public Livro(String letra, double preco, String titulo, Set<Autor> autores) {
        super(letra, preco);
        this.titulo = titulo;
        this.autores = autores;
    }
    public Livro(String letra, double preco) {
        super(letra, preco);
    }

    
    public Livro(String letra, double preco, Set<Autor> autores) {
        super(letra, preco);
        this.autores = autores;
    }
    public void add(Autor exp1){
		autores.add(exp1);
	}
    
}
