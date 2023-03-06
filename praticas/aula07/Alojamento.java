package Aula07;

public class Alojamento {
    private String codigo;
    private String nome;
    private String local;
    private double pnoite;
    private boolean disponibilidade;

    public Alojamento(String codigo, String nome, String local, double pnoite, boolean disponibilidade, double avaliação){
        this.codigo= codigo; this.nome = nome; this.local = local; this.pnoite= pnoite; this.disponibilidade = disponibilidade;
    }

    public String getcodigo(){
        return codigo;
    }

    public String getnome(){
        return nome;
    }

    public String getlocal(){
        return local;
    }

    public Double getpnoite(){
        return pnoite;
    }

    public Boolean getdisponibiliidade(){
        return disponibilidade;
    }
}
