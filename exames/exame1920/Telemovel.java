package imagina1920;

import java.util.Set;

public class Telemovel {
    private String marca;
    private String modelo;
    private Set<String> notas;
    private static final double IVA = 0.23;
    
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
    public Set<String> getNotas() {
        return notas;
    }
    public void setNotas(Set<String> notas) {
        this.notas = notas;
    }
    public static double getIva() {
        return IVA;
    }
    public Telemovel(String marca, String modelo, Set<String> notas) {
        this.marca = marca;
        this.modelo = modelo;
        this.notas = notas;
    }

    
}
