package Aula09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

import Aula06.Pessoa;
import Aula06.Date;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> c1 = new ArrayList<>();
        for (int i = 10; i <= 100; i+=10)
        c1.add(i);
        System.out.println("Size: " + c1.size());
        for (int i = 0; i < c1.size(); i++)
        System.out.println("Elemento: " + c1.get(i));
        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Vento");
        c2.add("Calor");
        c2.add("Frio");
        c2.add("Chuva");
        System.out.println(c2);
        Collections.sort(c2);
        System.out.println(c2);
        c2.remove("Frio");
        c2.remove(0);
        System.out.println(c2);
        System.out.println(c2.indexOf("Vento"));
        System.out.println(c2.lastIndexOf("Vento"));
        c2.set(0, "Miguel");
        System.out.println(c2);

        Set<Pessoa> c3 = new HashSet<>();
        c3.add(new Pessoa("Miguel Miragaia", 108317, new Date(30, 5, 2003)));
        c3.add(new Pessoa("Cristiano Nicolau", 108536, new Date(14,8,2003)));
        c3.add(new Pessoa("Tiago Cruz", 108673,new Date(20,04,2003)));
        c3.add(new Pessoa("Gonçalo Lopes",106713, new Date(25,12,2003)));
        c3.add(new Pessoa("Pedro Rei",106512, new Date(27,8,2003)));

        Iterator<Pessoa> i = c3.iterator();
		while (i.hasNext())
			System.out.println(i.next());

        Set<Date> c4 = new TreeSet<>();
        c4.add(new Date(10, 8, 2003));
        c4.add(new Date(30, 5, 1999));
        c4.add(new Date(4,  9 ,2007));
        c4.add(new Date(30, 5, 1974));
        c4.add(new Date(15, 1, 1972));
        System.out.println(c4);
    }
}
