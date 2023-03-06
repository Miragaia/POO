package Treino.Exercicios2.questao2;

public class data {
    int dia;
    int mes;
    int ano;

    public data(int dia, int mes, int ano) {
        if (ValidData(dia, mes, ano) == true){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
        else{
            this.dia = 1;
            this.mes = 1;
            this.ano = 0001;
        }
    }

    public static boolean ValidData(int dia, int mes, int ano) {
        if (ValidMonth(mes) && dia < GetDays(mes, ano) && ano > 0)
            return true;
        else
            return false;
    }

    public static boolean ValidMonth(int mes) {
        if (mes <= 0 || mes > 12)
            return true; 
        else
            return false;
    }

    public static int GetDays(int mes, int ano) {
        int dia = 0;
        switch (mes) {
            case 1, 3, 5, 8, 7, 10, 12:
                dia = 31;
                break;
            case 4, 6, 9, 11:
                dia = 30;
                break;
            case 2:
                if (isBissexto(ano)) {
                    dia = 29;
                } else
                    dia = 28;
                break;
        }
        return dia;
    }

    public String getMesExtenso(int mes) {
        String meses[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        return meses[this.mes-1];
    }

    public static boolean isBissexto(int ano) {
        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0)
            return true;
        else
            return false;
    }

    public data clone() {
        data d = new data(this.dia, this.mes, this.ano);

        return d;
    }

    public int compara( data data){
        if (this.dia == data.dia && this.mes == data.mes && this.ano == data.ano){
            return 0;
        }
        else if (this.ano == data.ano && this.mes == data.mes){
            if (this.dia > data.dia){
                return 1;
            }
            else {
                return -1;
            }
        }
        else if (this.ano == data.ano){
            if (this.mes > data.mes){
                return 1;
            }
            else {
                return -1;
            }
        }
        else if (this.ano > data.ano){
            return 1;
        }
        else {
            return -1;
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
