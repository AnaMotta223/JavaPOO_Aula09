package revisao;

public class Vetor {
	public static void main(String[] args) {
		//String[] produtos = new String[4];
		//String[] produtos2 = {"Celular","TV","Kindle","Alexa"};
		//produtos[0] = "Som";
		
		//cria uma lista do tipo Produto para preencher com objetos
		Produto[] produtos = new Produto[2];
		produtos[0] = new Produto("Celular",1500.);
		produtos[1] = new Produto("TV",2000.);
		
		//cria uma variavel do tipo produtos pra percorrer a lista
		for (Produto produto : produtos) {
			System.out.println(produto.getDescricao());
		}
	}	
}
