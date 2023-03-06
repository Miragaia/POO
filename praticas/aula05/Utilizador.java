package Aula05;

public class Utilizador {
    private String nome;
    private int nMec;
    private String curso;
    private int[] livros;

    public Utilizador(String nome, int nMec, String curso) {
        this.nome = nome;
        this.nMec = nMec;
        this.curso = curso;
        this.livros = new int[] {0,0,0};
    }

    public String getNome() {
        return nome;
    }

    public int getnMec() {
        return nMec;
    }

    public String getCurso() {
        return curso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setnMec(int nMec) {
        this.nMec = nMec;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String toString() {
		return "Aluno: " + nMec + "; " + nome + "; " + curso;
	}

    public boolean giveLivro(int id) {
		
		for(int i=0; i<3; i++) {
			if(livros[i] == 0) {
				livros[i] = id;
				return true;
			}
		}
		return false;
	}
    
	public boolean removeLivro(int id) {
		
		for(int i=0; i<3; i++) {
			if(livros[i] == id) {
				livros[i] = 0;
				return true;
			}
		}
		return false;
	}
}
