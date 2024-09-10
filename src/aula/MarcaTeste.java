package aula;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MarcaTeste {
	public static void main(String[] args) {
		List<Marca> marcas = new ArrayList();
		List<Marca> marcas2 = Arrays.asList(new Marca(4,"h"),
										new Marca(5,"z"));
		
		//Add all une uma lista na outra
		marcas.addAll(marcas2);
		marcas.add(new Marca(0,"x"));
		marcas.add(new Marca(1,"y"));
		
		System.out.println(marcas);
		
		
		
	}
	
	
}
