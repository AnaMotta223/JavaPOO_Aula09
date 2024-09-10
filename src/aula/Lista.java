package aula;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		//ArrayList do tipo String
		//ArrayList <String> nomes = new ArrayList<>();
		
		//Interface list tem metodos mais especificos
		//Cria a lista do tipo Object (mãe de todas as classes), sem um outro tipo específico
		List nomes = new ArrayList<>();
		nomes.add("Maria");
		nomes.add("Carlos");
		nomes.add(true);
		nomes.add(1000);
		
		//if (nomes.contains("Maria")) {
		//	nomes.get(0);
		//	
		//}
		
		//percorre o arraylist sem colchetes antes
		//for (Object object : nomes) {
		//	System.out.println(object);
		//}
		
		//Procura se na lista tem maria, pega o índice e remove ela da lista
		if(nomes.contains("Maria")) {
		nomes.remove(nomes.indexOf("Maria"));
		}
		
		for (Object object : nomes) {
			System.out.println(object);
		}
		
	}

}
