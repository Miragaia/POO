package Aula08;

public class AlimentoVeg extends Alimento {
    private Boolean alimentoveg;

    public AlimentoVeg(double proteinas, double calorias, double peso, Boolean AlimentoVeg){
        super(proteinas,calorias,peso);
    }

    public Boolean getAlimentoveg() {
        return alimentoveg;
    }
}
