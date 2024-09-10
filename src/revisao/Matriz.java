package revisao;

public class Matriz {
	public static void main(String[] args) {
		String[][] pessoas = {{"José","j@gmail.com"} ,
				 			 {"Ana","a@gmail.com"},
				 			 {"Igor", "i@gmai.com"}};
		
		//linha
		for (int i = 0; i < pessoas.length; i++) {
			//coluna
			for (int j = 0; j < pessoas[i].length; j++) {
				System.out.println(pessoas[i][j]);
			}
		}
		
	}
		
}
