package Aula08;

public class PesadoEletrico extends AutomovelEletrico {
	private int peso;

	public PesadoEletrico(String mat, String marca, String mod, int cc, int numquadro, int peso) {
		super(mat, marca, mod, cc, numquadro,true);
		this.peso=peso;
	}

	public int getPeso() {
		return peso;
	}

}

