package Aula07;

public class QuartoHotel extends Alojamento {
    private String tipos;

    public QuartoHotel(String codigo, String nome, String local, double pnoite, boolean disponibilidade, double avaliação, String tipos){
        super(codigo,nome,local,pnoite,disponibilidade,avaliação);
        if (!tipos.equals("single")  && !tipos.equals("double")  && !tipos.equals("twin")  && !tipos.equals("triple")){
            System.out.println("Tipo inválido");
        };
        this.tipos= tipos;
    }

    public String gettipos(){
        return tipos;
    }
}
