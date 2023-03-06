package Aula06;
public class Bolseiro extends Aluno {
    private int mmb;

    public Bolseiro(String nome, int cc, Date dataNasc, Date dataInsc) {
		super(nome, cc, dataNasc, dataInsc);
	}
    
    public Bolseiro(String nome, int cc, Date dataNasc) {
		super(nome, cc, dataNasc);
	}
	public Bolseiro(String nome, int cc, Date dataNasc, Date dataInsc, int mmb) {
		super(nome, cc, dataNasc, dataInsc);
		this.mmb = mmb;
	}

	public Bolseiro(String nome, int cc, Date dataNasc, int mmb) {
		super(nome, cc, dataNasc);
		this.mmb = mmb;
	}
    
    public int getmmb() {
		return mmb;
	}

	public void setmmb(int mmb) {
		this.mmb = mmb;
	}

	@Override
	public String toString() {
		return this.getName() + ", NMec: " + this.getnmec() + ", Data de Inscrição: " + this.getdatainsc() + ", Bolsa: " + mmb;
	}
}