package exercicios;

import java.lang.IllegalArgumentException;

public class Cliente {
	private int id;
	private String nome;
	private int idade;
	private String telefone;
	
	public Cliente(int id, String nome, int idade, String telefone) throws IllegalArgumentException{
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
		
		if(id<0) {
			throw new IllegalArgumentException("teste");
		}
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", idade=" + idade + ", telefone=" + telefone + "]";
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public String getTelefone() {
		return telefone;
	}
	
	
}
