package imagina2;


import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class POO15Ap {
	public static void main(String[] args) {
		POO15Ap ap = new POO15Ap();
		ap.alinea1();
		//
		//ap.alinea2();
		//
		// ap.alinea3();
	}

	public void alinea1() {
		Biblioteca bAveiro = new Biblioteca("Biblioteca Municipal de Aveiro",
				"Largo Dr. Jaime Magalhães Lima, 3800 - 156 Aveiro, Portugal");
		bAveiro.add(new Livro("História da Europa", "Lisboa: Dom Quixote", "Jean-Baptiste Duroselle", "972-20-0824-2"));
		bAveiro.add(new Livro("Papillon", "Amadora: Bertrand", "Henri Charrière"));
		bAveiro.add(new Livro("Branca de neve e os sete anões", "Abril Morumbi", "Jacob Grimm; Wilhelm Grimm"));
		bAveiro.add(new Revista("Revista municipal", "Aveiro: C.M.A.", "0874-727X"));
		bAveiro.add(new Jornal("Diário de notícias", Ver.CORES));
		Jornal gaf = new Jornal("O gafanhoto");
		gaf.setPeriodicidade(Periodicidade.BIMESTRAL);
		bAveiro.add(gaf);
		System.out.println(bAveiro);
		// imprime todas as publicações da biblioteca
		try {
			PrintWriter fl = new PrintWriter(new File("output.txt"));
			fl.println(bAveiro);
			fl.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void alinea2() {
		Scanner input = null;
		Biblioteca bAveiro = new Biblioteca("Biblioteca Municipal de Aveiro",
				"Largo Dr. Jaime Magalhães Lima, 3800 - 156 Aveiro, Portugal");
		try {
			input = new Scanner(new File("src/samples.txt"));
			input.useDelimiter("\n");
		} catch (FileNotFoundException e) {
			System.out.println("Ficheiro não Encontrado!");
		}
		input.nextLine();
		while (input.hasNextLine()) {
			String line = input.next();
			String[] sep = line.split("\t");
			if (Integer.parseInt(sep[0]) == 1) {
				if (sep.length == 4) {
					bAveiro.add(new Livro(sep[1], sep[2], sep[3]));
				} else {
					bAveiro.add(new Livro(sep[1], sep[2], sep[3], sep[4]));
				}
			} else if (Integer.parseInt(sep[0]) == 2) {

				bAveiro.add(new Revista(sep[1], sep[2], sep[3]));

			}

		}
		Map<String, TreeSet<Publicacoes>> pubporEditora = new TreeMap<>();
		for (Publicacoes pub : bAveiro.elementos) {
			System.out.printf("%-15s %-15s", pub.getTitulo(), pub.getEditora());
			if (!pubporEditora.containsKey(pub.getEditora())) {
				TreeSet<Publicacoes> conj = new TreeSet<>();
				conj.add(pub);
				pubporEditora.put(pub.getEditora(), conj);

			} else {
				for (String edit : pubporEditora.keySet()) {
					if (edit.equals(pub.getEditora())) {
						pubporEditora.get(edit).add(pub);
					}
				}

			}
			if (pub instanceof Livro) {
				System.out.printf("%-20s %-10s", ((Livro) pub).getAutores(), ((Livro) pub).getISBN());
				System.out.println("\n");
			} else if (pub instanceof Revista) {
				System.out.printf("%-20s ", ((Revista) pub).getISSN());
				System.out.println("\n");
			}
		}
		System.out.printf("%-30s %-30s %-60s %n","Editora", "Publicacoes", "Total Publicacoes");
		for(String edit :pubporEditora.keySet()) {
			int n=0;
			System.out.printf("%-30s",edit);
			for(Publicacoes pb:pubporEditora.get(edit)) {
				System.out.printf("%-30"
						+ "s",pb.getTitulo());
				n++;
			}
			System.out.printf ("%-60s",n);
			System.out.println("\n");
			n=0;
		}
	
	}
}