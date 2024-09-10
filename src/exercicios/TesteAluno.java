package exercicios;

import java.util.ArrayList;
import java.util.List;

public class TesteAluno {

	public static void main(String[] args) {
		try {
			List<Aluno> alunos = new ArrayList<>();
			
			alunos.add(new Aluno("Fulaninho",1.,7.5));
			alunos.add(new Aluno("Fulano",4.0,8.));
			alunos.add(new Aluno("Fulana",10.,6.4));
			
			for (Aluno aluno : alunos) {
				//System.out.println(aluno);
				System.out.print("Média: "+ aluno.calcularMedia() + " " + aluno + "\n");
			}
		}
		catch (AlunoException e) {
			System.err.println(e.getMessage());
		}
		
	}

}
