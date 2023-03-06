package Treino.exame2020;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Livro extends Produto {
    
	private String titulo;
	private Set<Autor> autores;

    public Livro(String titulo, double preco) {
		super("L", preco);
		this.titulo = titulo;
		
		this.autores = new TreeSet<Autor>();
	}
	
	public Livro(String titulo, double preco, List<Autor> autores) {
		super("L", preco);
		this.titulo = titulo;
		
		this.autores = new TreeSet<Autor>(Autor::compare);
		this.autores.addAll(autores);
	}

    public double precoVendaAoPublico(){
        precoiva = precobase *1.06;
        return precoiva;
    }
}
