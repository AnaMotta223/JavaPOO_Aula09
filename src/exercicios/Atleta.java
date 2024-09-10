package exercicios;

public class Atleta {
	private String nome;
	private int idade;
	private String posicao;
	
	public Atleta(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "nome do atleta: " + nome;
	}



	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public String getPosicao() {
		return posicao;
	}
	
}
