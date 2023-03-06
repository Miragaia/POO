package Aula05;

public class Livro {
    private int id;
    private String titulo;
    private String tipoEmprestimo;	
    private String disp;	
	private static int contador = 100;

    public Livro(String titulo) {
		this.titulo = titulo; 
        this.tipoEmprestimo = "NORMAL"; 
        this.id = contador++;
        this.disp = "DISPONÍVEL";
	}
	public Livro(String titulo, String tipoEmprestimo) {
		this.titulo = titulo; 
        this.tipoEmprestimo = tipoEmprestimo; 
        this.id = contador++;
        this.disp = "DISPONÍVEL";
	}

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getTipoEmprestimo() {
        return tipoEmprestimo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setTipoEmprestimo(String tipoEmprestimo) {
        this.tipoEmprestimo = tipoEmprestimo;
    }

    public String getDisp() {
		return disp;
	}
	public void setDisp(String disp) {
		this.disp = disp;
	}

    public String toString() {
		return "Livro " + id + "; " + titulo + "; " + tipoEmprestimo;
	}
}
