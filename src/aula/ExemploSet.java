package aula;

import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {

	public static void main(String[] args) {
		//Set - uma interface
		//HashSet - não aceita elementos duplicdos
		//TreeSet - ordena pela árvore binária 
		
		Set<String> lista = new TreeSet<>();
		//Set<String> lista = new HashSet<>();
		lista.add("Flamengo");
		lista.add("Vasco");
		lista.add("Botafogo");
		lista.add("Botafogo");
		lista.add("Fluminense");
		
		System.out.println(lista);
		
	}

}
