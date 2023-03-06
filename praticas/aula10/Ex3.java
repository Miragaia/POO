package Aula10;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Ex3 {
    public static void main(String[] args) {
        String str = "Hello World";
        char[] arr = str.replaceAll("//s+", "").toCharArray();
        Map<Character, TreeSet<Integer>> map = new TreeMap<>();
        for(int i =0; i< arr.length; i++){
            Character letra = arr[i];
            if(map.containsKey(letra)){
                map.get(letra).add(i);
            }
            else{
                TreeSet<Integer> tree = new TreeSet<>();
                tree.add(i);
                map.put(letra,tree);
            }
        }
        System.out.println(map.entrySet()); 
    }  
}

