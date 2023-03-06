package Aula05;

import java.util.Scanner;

public class Ex05 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String op;

		Livro[] catalogo = new Livro[100];
		Utilizador[] alunos = new Utilizador[100];

        do {
			menu();
            System.out.print("Opção: ");
			op = sc.next();
			
			switch(op){
				case "1":
					registAluno(alunos);
					break;
				case "2":
					delAluno(alunos);
					break;
				case "3":
					listAlunos(alunos);
					break;
				case "4":
					registLivro(catalogo);
					break;
				case "5":
					listLivros(catalogo);
					break;
				case "6":
					requisitar(alunos, catalogo);
					break;
				case "7":
					devolver(alunos, catalogo);
					break;
				case "8":
					break;
				default:
					System.out.println("Insira uma opção válida!");
			}
			System.out.println();
		}while(!op.equals("8"));
    }

    public static void menu() {
		System.out.println("----------- BIBLIOTECA -----------\n"
				+ "1 - Inscrever utilizador\n"
				+ "2 - Remover utilizador\n"
				+ "3 - Imprimir lista de utilizadores\n"
				+ "4 - Registar um novo livro\n"
				+ "5 - Imprimir lista de livros\n"
				+ "6 - Requisitar\n"
				+ "7 - Devolver\n"
				+ "8 - Sair\n");
	}
	
	public static void registAluno(Utilizador[] alunos) {
		System.out.print("Nome do Aluno: ");
		String nome = sc.next();
		System.out.print("nMec: ");
		int nMec = sc.nextInt();
		System.out.print("Curso: ");
		String curso = sc.next();
		
		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i] == null) {
				alunos[i] = new Utilizador(nome, nMec, curso);
				System.out.println("Aluno registado com sucesso!");
				break;
			}
		}
	}
	
	public static void delAluno(Utilizador[] alunos) {
		System.out.print("nMec do aluno a eliminar: ");
		int nMec = sc.nextInt();
		
		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i] != null && alunos[i].getnMec() == nMec) {
                System.out.println(alunos[i].getNome() + " retirado/a do sistema.");
				alunos[i] = null;
				return;
			}
		}
		System.out.println("Não existe um aluno com o nMec indicado!");
	}
	
	public static void listAlunos(Utilizador[] alunos) {
		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i] != null) {
			    System.out.println(alunos[i]);
			}
		}
	}
	
	public static void registLivro(Livro[] catalogo) {
		System.out.print("Titulo do Livro: ");
		String titulo = sc.next();
		String tipoEmp;
		
		do {
		    System.out.print("Tipo de emprestimo (NORMAL ou CONDICIONAL): ");
		    tipoEmp = sc.next();
		} while(!(tipoEmp.toUpperCase().equals("NORMAL")) && !(tipoEmp.toUpperCase().equals("CONDICIONAL"))); 
		
		for (int i = 0; i < catalogo.length; i++) {
			if (catalogo[i] == null) {
				catalogo[i] = new Livro(titulo, tipoEmp);
				System.out.println("Livro registado com sucesso!");
				break;
			}
		}
	}
	
	public static void listLivros(Livro[] catalogo) {
		for (int i = 0; i < catalogo.length; i++) {
			if (catalogo[i] != null) {
			    System.out.println(catalogo[i]);
			}
		}
	}
	
	public static void requisitar(Utilizador[] alunos, Livro[] catalogo) {
		Utilizador aluno = getAluno(alunos);
		System.out.print("Id do livro a requisitar: ");
		int id = sc.nextInt();
		
		for (int i = 0; i < catalogo.length; i++) {
			if(catalogo[i] == null) {
				System.out.println("Não existe livro com esse id!");
				return;
			}
			if(catalogo[i].getId() == id) {
				if(catalogo[i].getDisp().equals("EMPRESTADO") || catalogo[i].getTipoEmprestimo().equals("CONDICIONAL")) {
					System.out.println("Livro indisponível!");
					return;
				} else {
					if(aluno.giveLivro(id)) {
						catalogo[i].setDisp("EMPRESTADO");
						System.out.println("Livro emprestado com sucesso!");
						return;
					} else {
						System.out.println("Aluno já atingiu o limite de livros requesitados!");
						return;
					}
				}
			}
		}
	}
	
	public static void devolver(Utilizador[] alunos, Livro[] catalogo) {
		
		Utilizador aluno = getAluno(alunos);
		System.out.print("Id do livro a devolver: ");
		int id = sc.nextInt();
		
		for (int i = 0; i < catalogo.length; i++) {
			if(catalogo[i] == null) {
				System.out.println("Não existe livro com esse id!");
				return;
			}
			if(catalogo[i].getId() == id) {
				if(catalogo[i].getDisp().equals("DISPONíVEL") || catalogo[i].getTipoEmprestimo().equals("CONDICIONAL")) {
					System.out.println("Este livro não foi emprestado!");
					return;
				} else {
					if(aluno.removeLivro(id)) {
						catalogo[i].setDisp("DISPONÍVEL");
						System.out.println("Livro devolvido com sucesso!");
						return;
					} else {
						System.out.println("Aluno não tem esse livro!");
						return;
					}
				}
			}
		}
		System.out.println("Não existe livro com esse id!");
	}
	
	public static boolean valAluno(int nMec, Utilizador[] alunos) {			
		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i] == null) {					
				return false;
			}
			if (alunos[i].getnMec() == nMec) {		
				return true;
			}
		}
		return false;			

}
	public static Utilizador getAluno(Utilizador[] alunos) {
		Utilizador aluno = null;
		int nMec;
		
		do {
			System.out.print("nMec do aluno: ");
			nMec = sc.nextInt();
		} while(!valAluno(nMec, alunos));
		
		for(int i=0; i < alunos.length; i++) {
			if (alunos[i].getnMec() == nMec) {
				aluno = alunos[i];
				break;
			}
		}
		return aluno;
		
	}
}



