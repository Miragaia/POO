package Treino.Exercicios2.questao3;

import Treino.Exercicios2.questao2.data;
public class voo {
    private int numVoo;
    private data data;
    private int lugares[] = new int[100];

    public voo(int numVoo, data data) {
        this.numVoo = numVoo;
        this.data = data;
    }

    public  int proximoLivre(){
        for(int i = 0; i < this.lugares.length; i++) {
            if(lugares[i] == 0) {
                return i+1;
            }
        }
        return 0;
    }

    public boolean verifica(int lugar){
        if(lugares[lugar -1] == 0 ) {
            return false;
        }
        else{
            return true;
        }
    }

    public boolean ocupa(int lugar){
        if(verifica(lugar)){
            return false;
        }
        else{
            this.lugares[lugar-1] = 1;
            return true;
        }
    }

    public int vagas(){
        int counter = 0;
        for(int i = 0; i < this.lugares.length; i++) {
            if(lugares[i] == 0) {
                counter++;
            }
        }
        return counter;
    }

    public voo clone() {
        voo v = new voo(this.numVoo, this.data);

        return v;
    }

    public int getNumVoo() {
        return numVoo;
    }

    public void setNumVoo(int numVoo) {
        this.numVoo = numVoo;
    }

    public data getData() {
        return data;
    }

    public void setData(data data) {
        this.data = data;
    }

    public int[] getLugares() {
        return lugares;
    }

    public void setLugares(int[] lugares) {
        this.lugares = lugares;
    }

    
}
