package Aula08;

public class AutomovelEletrico extends Veiculo {
	private int numquadro;
    private boolean eletrico;

	public AutomovelEletrico(String mat, String marca, String mod, int cc, int numquadro, boolean eletrico) {
		super(mat, marca, mod, cc);
		this.numquadro=numquadro;
	}

	public int getNumquadro() {
		return numquadro;
	}

    public Boolean geteletricoo() {
        return eletrico;
    }
}
