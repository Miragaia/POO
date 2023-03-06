package imagina1920;

public abstract class Produto {
    private String codigo;
    private int quantidade;
    private double preco;
    private static int counter = 200;

    public Produto(String letra, double preco){
        this.codigo = letra + 2*counter++;
        this.quantidade = 0;
        this.preco = preco;
    }

    
}
