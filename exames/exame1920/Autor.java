package imagina1920;

public class Autor {
    private String nome;
    private int ano;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public Autor(String nome, int ano) {
        this.nome = nome;
        this.ano = ano;
    }
    public Autor(String nome) {
        this.nome = nome;
    }
    @Override
    public String toString() {
        return "Autor [ano=" + ano + ", nome=" + nome + "]";
    }

    
}
