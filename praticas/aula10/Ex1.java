package Aula10;

import java.util.HashMap;
import java.util.Map;

public class Ex1 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        map.put("Branco", "Que tem a cor da neve");
        map.put("Azul", "Cor do céu");
        map.put("João","Nome de pessoa");
        map.put("Pernas", "Parte do corpo humano");

        System.out.println(map.entrySet());
        System.out.println(map.keySet());
        System.out.println(map.values());
    }
}