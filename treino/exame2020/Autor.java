package Treino.exame2020;

public class Autor {
    String nome;
    int anomasc;

    public Autor(String nome, int anomasc) {
        super();
        this.nome = nome;
        this.anomasc = anomasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnomasc() {
        return anomasc;
    }

    public void setAnomasc(int anomasc) {
        this.anomasc = anomasc;
    }

    public int compare(Autor a) {
		return this.nome.compareTo(a.nome);
	}

    @Override
    public String toString() {
        return "Autor [anomasc=" + anomasc + ", nome=" + nome + "]";
    }

    
}
