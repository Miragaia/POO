package Treino.exame2020;

public class Produto {
    int valcod = 10;
    String codigo;
    String letra;
    int quantidade;
    double precobase; //em euros sem impostos
    double precoiva;

    public Produto(String letra, double precobase){
        this.codigo = letra + 2*valcod;
        this.precobase = precobase;
        valcod++;
    }

    public String getCodigo() {
        return codigo;
    }



    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }



    public int getQuantidade() {
        return quantidade;
    }



    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }



    public double getPrecobase() {
        return precobase;
    }



    public void setPrecobase(double precobase) {
        this.precobase = precobase;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    
}
