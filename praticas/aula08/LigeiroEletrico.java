package Aula08;

public class LigeiroEletrico extends AutomovelEletrico {
    private int bag;

	public LigeiroEletrico(String mat, String marca, String mod, int cc, int numquadro, int bag) {
		super(mat, marca, mod, cc, numquadro,true);
		this.bag=bag;
	}

	public int getBag() {
		return bag;
	}
}
