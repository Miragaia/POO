package Aula07;

import java.util.ArrayList;
import java.util.List;

public class EmpresaAl {
    private String nome;
    private String endereço;
    private List<Alojamento> alojamentos = new ArrayList<>();
    private List<Carro> carros = new ArrayList<>();

    public EmpresaAl(String nome, String endereço){
        this.nome = nome; this.endereço = endereço;
    }

    public String getNome(){
        return nome;
    }

    public String getEndereço(){
        return endereço;
    }

    public void checkin(Alojamento a){
        this.alojamentos.add(a);
    }

    public Alojamento checkout(String codigo){
        for(Alojamento a: alojamentos){
            if (a.getcodigo() == codigo){
                System.out.println("Checkout completo");
            }
        }
        System.out.println("Insira um alojamento válido");
        return null;
    }

    public Carro entegar(Carro c, String classe, String tipom) {
        if (!classe.equals("A")  && !classe.equals("B")  && !classe.equals("C")  && !classe.equals("D")  && !classe.equals("E")  && !classe.equals("F")){
            System.out.println("Classe inválida");
            return null;
        };
        if (!tipom.equals("gasolina") && !tipom.equals("diesel") && !tipom.equals("hibrido") && !tipom.equals("eletrico")){
            System.out.println("Tipo inválida");
            return null;
        };
		this.carros.add(c);
        return null;
	}

    public Carro levantar(String classe, String tipom){
        for(Carro c: carros){
            if (c.getclasse() == classe && c.gettipom() == tipom){
                System.out.println("Levantamento completo");
            }
        }
        System.out.println("Insira uma classe e/ou tipo de motor válido");
        return null;
    }
}

// faltou fazer o switch para testar 
