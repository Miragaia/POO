package Aula06;

public class Aluno extends Pessoa{
    private int nmec;
    private Date datainsc;
    private static int contador = 100;

    public Aluno(String name, int cc, Date datansc, Date datainsc){
        super(name,cc,datansc);
        this.datainsc = datainsc;
        this.nmec = contador++;
    }
    public Aluno(String name, int cc, Date datansc){
        super(name,cc,datansc);
        this.datainsc = Date.today();
        this.nmec = contador++;
    } 

    public int getnmec(){
        return nmec;
    }

    public Date getdatainsc(){
        return datainsc;
    }

    @Override
	public String toString() {
		return this.getName() + ", NMec: " + this.getnmec() + ", Data de Inscrição: " + datainsc;
	}
}
