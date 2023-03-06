package Aula06;

import java.time.OffsetDateTime;

public class Date implements Comparable<Date>{

    private int dia;
    private int mes;
    private int ano;

    public Date(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

    }

    public static boolean validMonth( int month){
        //while (month > 12 || month <12){
        //    System.out.println("Valor inválido, introduza um valor novamente: ");
        //    Scanner mes = new Scanner(System.in);
        //    month = mes.nextInt();
        //    mes.close();
        //}
        if ( month <= 12 && month >=1){
            return true;
        }
        else{
            return false;
        }
    } 

    public static int monthDays(int mes, int ano){
    int dias;
    int[] diasm = {31,00,31,30,31,30,31,31,30,31,30,31};
    if( validMonth(mes)== true){
        if( mes==2){
            if((ano%100 != 0 && ano%4 == 0) || ano%400 == 0){
                dias = 29;
            }
            else{
                dias = 28;
            }
        } 
        else{
            dias = diasm[mes-1];
        }
        return dias;
    }
    else{
        return 0;
    }
    }   


    public static boolean LeapYear(int ano){
        if((ano%100 != 0 && ano%4 == 0) || ano%400 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean valid(int day, int month, int ano){
        if (month >= 1 && month <= 12){
            if( month==2){
                if((ano%100 != 0 && ano%4 == 0) || ano%400 == 0){
                    if (day >= 29 || day<=1){
                        return false;
                    }
                    else{
                        return true;
                    }
                }
                else{
                    if (day >= 28 || day<=1){
                        return false;
                    }
                    else{
                        return true;
                    }
                }
            } 
            else{
                if ( month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
                    if ( day >=31 || day <= 1){
                        return false;
                    }
                    else{
                        return true;
                    }
                }
                else{
                    if (day >= 30 || day<=1){
                        return false;
                    }
                    else{
                        return true;
                    }
                }
            }
        }
        else{
            return false;
        } 
    }

    public String increment() {
        int days = monthDays(mes, ano);
        if (dia == days) {
            if (mes == 12) {
                ano++;
            } else {
                mes++;
            }
        } else {
            dia++;
        }
        return toString();
    }
    public String decrement() {
        if (dia == 1) {
            if (mes == 1) {
                ano--;
                mes = 12;
                dia = 31;
            } else {
                dia = monthDays(mes - 1, ano);
                mes--;
            }
        } else {
            dia--;
        }
        return dia + "-" + mes + "-" + ano;
    }

    public String toString() {
        return ano + "-" + mes + "-" + dia;
    }
    
    public static Date today(){
        OffsetDateTime dt = OffsetDateTime.now();
        int dia = dt.getDayOfMonth();
        int mes = dt.getMonthValue();
        int ano = dt.getYear();
        return new Date(dia, mes, ano);
    }

   // public int compareTo(int dia, int mes, int ano) //criada para comparar data
   // {
        //return this.dia.compareTo(//alguma coisa);
    //}

    @Override
    public int compareTo(Date o) {
        return 0;
    }
} 

