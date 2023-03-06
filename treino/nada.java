package Treino;

import java.util.Map;
import java.util.TreeMap;

public class nada {
    public static void main(String[] args) {
        Map<Character, Integer> pares = new TreeMap<>();
            pares.put('o', 2);
            pares.put('e', 1);
            pares.put('a', 3);
            pares.put('u', 5);
            pares.put('i', 4);
            System.out.println(pares.get('a'));

            for (Map.Entry<Character, Integer> e : pares.entrySet()) {
                if (e.getKey() == 'e')
                    e. setValue (7);
                }
            System.out.println(pares);
    }
}
