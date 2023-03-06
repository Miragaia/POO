/* package imagina;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;

public class main {
	public static void main(String[] args) {
		main ap = new main();
		ap.alinea1();
		//ap.alinea2();
	}

	public void alinea1() {
		Cruzeiro cruz = criarCruzeiro();
		System.out.println(cruz);
	}

 	public void alinea2() {
		Cruzeiro cruz = criarCruzeiro();
		System.out.printf("%-10s %-5.2f","Percentagem:", cruz.getPercentagem(cruz));
		System.out.printf("%-8s %-5.2f","Media:", cruz.getMedia(cruz));
		
		PrintWriter outpt=null;
		try {
			outpt= new PrintWriter(new File("SeaPrincess-2017.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		outpt.println(String.format("%-10s%-15s%-20s","Numero","Capacidade","Ocupantes"));
		for(Cabine c: cruz.getListacabines()) {
			if(c.getOcupantes()!=null) {
				
				outpt.print(String.format("%-10s%-15s%-20s%n", c.getNumero(),c.getCapacidade(),Arrays.toString(c.getOcupantes())));
			}
		}
		outpt.close();
		// coloque o código da alínea 2 aqui
		 
		 
	}  

	public Cruzeiro criarCruzeiro() {
		String[] aux = { "Lisboa", "Barcelona", "Rodes", "Southampton" };
		Cruzeiro cr2 = new Cruzeiro("Sea Princess", aux, "22/01/2017");
		cr2.setDuracao(11);
		CabineComJanela ccj = new CabineComJanela(17, 2, TipoDeJanela.INTERIOR);
		ccj.setPassageiros(new String("Maria Luz;Manuel Luz").split(";"));
		ccj.pacoteExtra(Extra.Spa);
		cr2.add(ccj);
		cr2.add(new CabineComJanela(15, 4, TipoDeJanela.INTERIOR, new String("António Campos;Maria Campos;Marina Mota").split(";")));
		cr2.add(new CabineComJanela(25, 2, TipoDeJanela.INTERIOR, "Anonymous1;Anonymous2".split(";")));
		cr2.add(new CabineComJanela(4, 4, TipoDeJanela.MAR, new String("Ursula Magnusson and Matts Magnusson and Miki Rosberg and Charles Sean").split(" and ")));
		Suite suite1 = new Suite(100, 2);
		suite1.setNumQuartos(3);
		suite1.setMaxOcupantes(2 * 3);
		cr2.add(suite1);
		Suite s = new Suite(102, 6);
		s.setNumQuartos(3);
		cr2.add(s);
		s.setPassageiros(new String("A. Jolie:B. Pitt:Shiloh:Knox Leon").split(":"));
		CabineComVaranda cab = new CabineComVaranda(21, 1, TipoDeVaranda.VISTA_LIVRE);
		cab.setTipoVaranda(TipoDeVaranda.OBSTR_PARCIAL);
		cab.pacoteExtra(Extra.Desporto);
		try {
			cab.setPassageiros(new String("Paulo Portas;Júlia Portas").split(";"));
			cr2.add(cab);
		} catch (IllegalArgumentException e) {
			System.out.println("Não adicionado devido a excesso de ocupantes !!");
		}
		Cabine eo = new CabineComJanela(1, 4, TipoDeJanela.MAR, "Marcelo R. de Sousa".split(";"));
		cr2.add(eo);
		cr2.add(new CabineComJanela(130, 4, TipoDeJanela.MAR));
		cr2.add(new CabineComJanela(131, 4, TipoDeJanela.INTERIOR));
		return cr2;
	}
} */
