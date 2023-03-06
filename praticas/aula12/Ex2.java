package aula12;

import java.util.*;
import java.io.*;

public class Ex2{
	
	public static void main(String[] arg) throws IOException{
		Set<Movie> filmes = new TreeSet<>(Movie::compararNome);		//Set ordenado
		Set<String> generos = new TreeSet<>();
		
		//Testes método compararNome do Movie
		System.out.println("a) TESTES AO MÉTODO COMPARAR NOME DA CLASSE MOVIE\n");
		Movie a = new Movie("Old School", 54.7, "R", "Comédia", 92);
		Movie b = new Movie("Amanhã", 54.7, "R", "Comédia", 92);
		System.out.println(Movie.compararNome(a, b)); //>0
		System.out.println(Movie.compararNome(b, a)); //<0
		System.out.println(Movie.compararNome(a, a)); //=0
				
			
		try(Scanner file = new Scanner(new File("src/Aula12/movies.txt"))){
			file.nextLine();
			System.out.println("\n\nLEITURA DO FICHEIRO\n");
			while(file.hasNext()) {
				String[] data = file.nextLine().split("\t");
				System.out.println(Arrays.toString(data));
				filmes.add(new Movie(data[0], Double.parseDouble(data[1]), data[2], data[3], Integer.parseInt(data[4])));
				generos.add(data[3]);
			}
			file.close();
		}catch(IOException e) {
			System.err.println("Eroo: "+e);
		}
		
		//Teste de que ficheiro foi processado corretamente
		System.out.println("\n\nb)SET ORDENADO POR NOMES\n");
		filmes.forEach(x -> System.out.println(x));
		
		//Conversão do set em lista, para usar método sort da classe Collections
		List<Movie> filmesList = new ArrayList<>();
		filmesList.addAll(filmes);
		System.out.println("\n\nLISTA DE MOVIES SEM ORDENAÇÃO\n");
		filmesList.forEach(m -> System.out.println(m));
		
		//Ordenar por score (descrecente)
		Collections.sort(filmesList, Movie::compararScoreDescrescente);
		System.out.println("\n\nc)LISTA DE MOVIES ORDENADOS POR SCORE DECRESCENTE\n");
		filmesList.forEach(m -> System.out.println(m));
		
		//Ordenar por running time (crescente)
		Collections.sort(filmesList, Movie::compararTempoCrescente);
		System.out.println("\n\nc)LISTA DE MOVIES ORDENADOS POR RUNNING TIME CRESCENTE\n");
		filmesList.forEach(m -> System.out.println(m));
		
		//Géneros existentes
		System.out.println("\n\nd)LISTA DE GÉNEROS DISTINTOS (ORDEM ALFABÉTICA)\n");
		generos.forEach(g -> System.out.println(g));
		
		//Filtar set para filmes com score>60 e do genero comedy
		filmes.removeIf(m -> m.getScore()<=60.0);
		filmes.removeIf(m -> !m.getGenero().equalsIgnoreCase("comedy"));
		System.out.println("\n\nLISTA DE MOVIES FILTRADOS PARA SCORE>60 E GÉNERO COMEDY\n");
		filmes.forEach(m -> System.out.println(m));
		
		try(PrintWriter file=new PrintWriter(new File("src/Aula12/myselection.txt"))){
			file.println("e)FILMES FILTRADOS PARA UM SCORE>60 E GÉNERO COMEDY\n");
			filmes.forEach(m -> file.println(m));
			System.out.println("\n\ne)FICHEIRO MYSELECTION.TXT CRIADO COM SUCESSO NO DIRETÓRIO DO PROGRAMA\n");
		}catch (IOException e) {
			System.err.println("Erro: "+e);
		}
	}

}

