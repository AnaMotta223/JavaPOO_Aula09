package exercicios;

public class Aluno {
	private String nome;
	private Double nota1, nota2;
	
	public Aluno(String nome, Double nota1, Double nota2) {
		super();
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	@Override
	public String toString() {
		return "Nome:" + nome + " Nota1: " + nota1 + " Nota2: " + nota2;
	}

	public String getNome() {
		return nome;
	}

	public Double getNota1() {
		return nota1;
	}

	public Double getNota2() {
		return nota2;
	}
	
	public Double calcularMedia() {
		if(nota1 <= 0 || nota1 > 10 || nota2 <= 0 || nota2 > 10) {
			throw new AlunoException("Erro: valor de nota inválido!");
		}
		else {
			double media = (nota1+nota2)/2;
			return media;
		}
		
	}
	
}
