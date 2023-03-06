package aula12;

import java.util.*;
import java.io.*;

public class Ex1 {
	
	public static void main(String[] arg) {
		Set <String> setWords = new HashSet<>();
		List <String> listWords = new ArrayList<>();
		
		try(Scanner file = new Scanner(new File("src/aula12/movies.txt"))){
			file.useDelimiter("[\\\t\n\r .,:'‘’;?!-*{}=+&/()\\[\\]”“\"\']+");
			while(file.hasNext()) {
				listWords.add(file.next());
			}
		}catch(IOException e) {
			System.out.println("Erro: "+e);
		}
		setWords.addAll(listWords);
		
		System.out.println("Número total de palavras: "+listWords.size());
		System.out.println("Número de palavras diferentes: "+setWords.size());
	}

}
