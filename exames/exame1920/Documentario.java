package imagina1920;

public class Documentario extends Produto {
    private String titulo;
    private int ano;
    private int duracao;
    private static final double IVA = 0.23;
    
    
    public Documentario(String letra, double preco, String titulo, int ano, int duracao) {
        super(letra, preco);
        this.titulo = titulo;
        this.ano = ano;
        this.duracao = duracao;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getDuracao() {
        return duracao;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    public static double getIva() {
        return IVA;
    }

    
}
