package aula;

public class VarArgs {
	
	//Método calcularSoma recebe um número x de elementos - vira uma lista - e soma todos
	public static int calcularSoma(int ... numeros) {
		int soma = 0;
		for (int i : numeros) {
			soma += i;
		}
		
		return soma;
	}
	
	public static void main(String[] args) {
		int total = 0;
		total = calcularSoma(10,4,20,40,12,100,200,100,1);
		System.out.println("Total: " + total);
	}
}
