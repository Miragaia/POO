package Aula06;

public class Pessoa {
    private String name;
    private int cc;
    private Date datansc;

    public Pessoa( String name, int cc, Date datansc) {
        this.name = name; this.cc = cc; this.datansc = datansc;
    }

    public String getName(){
        return name;
    }

    public int getcc(){
        return cc;
    }

    public Date getdatansc(){
        return datansc;
    }

    @Override
	public String toString() {
		return name + ", CC: " + cc + ", Data de Nascimento: " + datansc;
	}
}



