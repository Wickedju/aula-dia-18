package operadorespackage;

import java.util.Scanner;

public class AutomovelClass {

	public static void main(String[] args) {
		Scanner giovanna = new Scanner(System.in);

		System.out.print(" Digite o tempo gasto na viagem: ");
		float tempo = giovanna.nextFloat();
		
		System.out.print(" Digite a velocidade média: ");
		float vel_media = giovanna.nextFloat();
		
		float dist = tempo * vel_media;
		float litros = dist / 12;
			
		System.out.println("o tempo gasto é de:" + tempo + "Hrs");
		System.out.println("a velocidade média é de :" + vel_media);
		System.out.println("a distância percorrida foi de:" + dist);
		System.out.println("a quantidade de combustível é de :" + litros );
		
	}

}
