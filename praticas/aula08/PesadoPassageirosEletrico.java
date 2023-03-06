package Aula08;

public class PesadoPassageirosEletrico extends Pesado {
    private int passmax;
    

	public PesadoPassageirosEletrico(String mat, String marca, String mod, int cc, int numquadro, int peso, int passmax) {
		super(mat, marca, mod, cc, numquadro, peso);
		this.passmax=passmax;
	}

	public int getPassmax() {
		return passmax;
	}
}
