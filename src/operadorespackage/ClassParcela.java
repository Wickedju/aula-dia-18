package operadorespackage;

import  java.util.Scanner;

public class ClassParcela {

	public static void main(String[] args) {
		Scanner erica = new Scanner(System.in);
		
		System.out.println("Digite o valor inicial: ");
		float valor = erica.nextFloat();
		
		System.out.println("Digite a taxa:");
		float taxa = erica.nextFloat();
		
		System.out.println("Digite o tempo: ");
		float tempo = erica.nextFloat();
		
		float prest = valor + (valor * (taxa / 100) * tempo );
		System.out.printf("Prestação = R$ %.2f", (prest));
	}

}
