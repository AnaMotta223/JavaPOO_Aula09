package exercicios;

//Crie uma main para testar o time. Crie um time, adicione atletas e depois imprima na tela o nome do time e o nome
//de seus atletas

public class TesteTime {
	public static void main(String[] args) {
		Atleta atleta = new Atleta("nome");
		Atleta atleta2 = new Atleta("nome2");
		Time time = new Time("Brasil","Fulano","Fulaninho");
		Time time2 = new Time("França","Fulano2","Fulano3");
		time.adicionarAtleta(atleta);
		time2.adicionarAtleta(atleta2);

		System.out.println(time.toString() + time2.toString());
	}
}
