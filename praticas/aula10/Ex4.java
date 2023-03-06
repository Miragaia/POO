package Aula10;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new FileReader("words.txt"));
        ArrayList<String> char2 = new ArrayList<>();
        while (input.hasNext()) {
            String word = input.next();
            System.out.println(word);
            if(word.length() > 2){
                char2.add(word);
            }
        }
        System.out.println("Palavras com mais de 2 carateres: "+char2);
        System.out.println("Palavras que terminam com 's': ");
		for(String word: char2) {
			if(word.toLowerCase().endsWith("s")) {
				System.out.println(word);
			}
		}

        for(String word: char2) {
			for(char c: word.toCharArray()) {
				if(!Character.isLetter(c)) {
					char2.remove(word);
				}
			}
		}
        System.out.println("Palavras apenas com letras: "+char2);
    }
}
