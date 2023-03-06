package imagina2;

import java.util.Set;
import java.util.TreeSet;

public class Biblioteca {
    Set<Publicacoes> elementos = new TreeSet<Publicacoes>();
    private String nome, endreco;

    

    public Biblioteca(String nome, String endreco) {
        this.nome = nome;
        this.endreco = endreco;
    }

    public Biblioteca(Set<Publicacoes> elementos, String nome, String endreco) {
        this.elementos = elementos;
        this.nome = nome;
        this.endreco = endreco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndreco() {
        return endreco;
    }

    public void setEndreco(String endreco) {
        this.endreco = endreco;
    }

    public Set<Publicacoes> getElementos() {
        return elementos;
    }

   

    
    public void setElementos(Set<Publicacoes> elementos) {
        this.elementos = elementos;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    public void add(Publicacoes obj){
		elementos.add(obj);
	}
}
