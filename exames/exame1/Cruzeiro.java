package imagina;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;


public class Cruzeiro {
    private String navio, date;
    private String[] cidades;
    private Set<Cabine>listacabines=new TreeSet<>();
	private int duracao;
    
    public Set<Cabine> getListacabines() {
        return listacabines;
    }
    public void setListacabines(Set<Cabine> listacabines) {
        this.listacabines = listacabines;
    }
    public int getDuracao() {
        return duracao;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    public String getNavio() {
        return navio;
    }
    public void setNavio(String navio) {
        this.navio = navio;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String[] getCidades() {
        return cidades;
    }
    public void setCidades(String[] cidades) {
        this.cidades = cidades;
    }

    public Cruzeiro(String navio, String[] cidades, String date) {
        this.navio = navio;
        this.date = date;
        this.cidades = cidades;
    }

    public Cruzeiro(String navio, String[] cidades, String date, Set<Cabine> listacabines, int duracao) {
		super();
		this.navio = navio;
        this.date = date;
        this.cidades = cidades;
		this.listacabines = listacabines;
		this.duracao = duracao;
	}

    public void add(CabineComJanela ccj) {
		listacabines.add(ccj);
		
	}

	public void add(Suite suite1) {
		listacabines.add(suite1);
		
	}

    @Override
    public String toString() {
        return "Cruzeiro [listacabines=" + listacabines + ", cidades=" + Arrays.toString(cidades) + ", date=" + date + ", navio="
                + navio + "]";
    }

    
}
