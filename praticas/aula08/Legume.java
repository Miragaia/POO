package Aula08;

public class Legume extends AlimentoVeg {
    private String nome;

    public Legume(double proteinas,double calorias,double peso, String nome){
        super(proteinas,calorias,peso,true);
        this.nome= nome;
    }

    public String getNome() {
        return nome;
    }
}
