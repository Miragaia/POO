package imagina1920;

import java.util.Set;

public class Loja {
    private String nome, enderecoweb;
    private Set<String> stockprodutos;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEnderecoweb() {
        return enderecoweb;
    }
    public void setEnderecoweb(String enderecoweb) {
        this.enderecoweb = enderecoweb;
    }
    public Set<String> getStockprodutos() {
        return stockprodutos;
    }
    public void setStockprodutos(Set<String> stockprodutos) {
        this.stockprodutos = stockprodutos;
    }
    public Loja(String nome, String enderecoweb, Set<String> stockprodutos) {
        this.nome = nome;
        this.enderecoweb = enderecoweb;
        this.stockprodutos = stockprodutos;
    }
    public Loja(String nome, String enderecoweb) {
        this.nome = nome;
        this.enderecoweb = enderecoweb;
    }

    
}
