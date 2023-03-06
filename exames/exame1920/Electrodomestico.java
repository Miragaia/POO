package imagina1920;

public class Electrodomestico extends Produto {
    private static final double IVA = 0.23;
    private String tipo, marca, modelo;
    private  ClasseEnergetica classeEnergetica;
    private double potencia;

    
    
    public Electrodomestico(String letra, double preco, String tipo, double potencia) {
        super(letra, preco);
        this.tipo = tipo;
        this.potencia = potencia;
    }
    public Electrodomestico(String letra,  String marca, String modelo, double potencia, double preco) {
        super(letra,preco);
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
    }

    public Electrodomestico(String letra,  String marca, String modelo,double preco) {
        super(letra,preco);
        this.marca = marca;
        this.modelo = modelo;
    }

    public double getPotencia() {
        return potencia;
    }
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    public ClasseEnergetica getClasseEnergetica() {
        return classeEnergetica;
    }
    public void setClasseEnergetica(ClasseEnergetica classeEnergetica) {
        this.classeEnergetica = classeEnergetica;
    }
    public static double getIva() {
        return IVA;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public Electrodomestico(String letra, double preco, String tipo, String marca, String modelo) {
        super(letra, preco);
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
    }
    public Electrodomestico(String letra, double preco, String tipo, String marca, String modelo,
            ClasseEnergetica classeEnergetica) {
        super(letra, preco);
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.classeEnergetica = classeEnergetica;

        
    }
    public Electrodomestico(String letra, double preco, String tipo, String marca) {
        super(letra, preco);
        this.tipo = tipo;
        this.marca = marca;
    }

    
}
