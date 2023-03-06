package Aula10;

import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Ex2 {
    public static void main(String[] args) {
        Map<String,ArrayList<String>> map = new TreeMap<>();

        map.put("Branco", new ArrayList<>());
        map.get("Branco").add("Que tem a cor da neve");
        map.get("Branco").add("A cor mais clara");
        map.get("Branco").add("Cor do leite");
        map.put("Azul", new ArrayList<>() );
        map.get("Azul").add("Cor do céu");
        map.get("Azul").add("Cor da água");
        map.put("João", new ArrayList<>());
        map.get("João").add("Nome de pessoa");
        map.put("Pernas", new ArrayList<>());
        map.get("Pernas").add("Parte do corpo humano");

        System.out.println(map.entrySet());
        System.out.println(map.keySet());
        System.out.println(map.values());

        Scanner sc=new Scanner(System.in);
        System.out.println("Insira um termo:");
        String str=sc.nextLine();
        sc.close();

        int a = map.get(str).size();

        Random rand = new Random();
        int maxNumber = a;
        int randomNumber = rand.nextInt(maxNumber) ;

        System.out.println(map.get(str).get(randomNumber));


    }
}
