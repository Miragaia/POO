package aula11;

import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex1 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(new FileReader("src/Aula11/major.txt"))) {
			input.useDelimiter("[\\\t\n\r .,:'‘’;?!-*{}=+&/()\\[\\]”“\"\']+"); 
			String anterior=null, word;
			TreeMap <String, TreeMap<String, Integer>>  palavras = new TreeMap <String, TreeMap<String, Integer>>(); 
			while (input.hasNext()) {
				word = input.next().toLowerCase();
				if(word.length()>2) {
					if(palavras.get(word)==null) {
						palavras.put(word, new TreeMap<String, Integer>());
					}
					if(anterior!=null) {
						TreeMap<String, Integer> pares = palavras.get(word);
						if(pares.get(anterior)==null) {
							pares.put(anterior, 1);
						}else {
							int valorAnterior = Integer.parseInt(pares.get(anterior).toString());
							pares.put(anterior, valorAnterior+1);
						}
					}
					anterior=word;	
				}
			}
			for(String s:palavras.keySet()) {
				System.out.println(s+"="+palavras.get(s));
			}
		}catch(IOException e) {
			System.err.printf("ERRO: %s\n", e.getMessage());
		} 
    }
}
