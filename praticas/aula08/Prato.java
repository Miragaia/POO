package Aula08;

public class Prato{
    private String nome;
    public enum conjuntoalimentos{};

    public Prato(String nome,conjuntoalimentos alimentos ){
        this.nome = nome; //falta a do conjunto de alimentos (aprender a fazer dos enum)
    }

    public String getNome() {
        return nome;
    }
}
