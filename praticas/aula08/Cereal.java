package Aula08;

public class Cereal extends AlimentoVeg {
    private String nome;

    public Cereal(double proteinas, double calorias, double peso, String nome){
        super(proteinas,calorias,peso,true);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
