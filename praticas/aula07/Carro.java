package Aula07;


public class Carro  {
    private String classe;
    private String tipom;

    public Carro(String classe, String tipom){
        this.classe= classe; this.tipom = tipom;
    }

    public String getclasse(){
        return classe;
    }

    public String gettipom(){
        return tipom;
    }
}
