package Listadoispackage;

import java.util.Scanner;
public abstract class ClassTroca {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);	
		System.out.println("Digite o valor da variável A: ");
        int A = scn.nextInt();
        
        System.out.println("Digite o valor da variável B: ");
        int B = scn.nextInt();
        
        int C = A;
        A = B;
        B = C;
        
        System.out.println("O valor de A é igual a " + A);
        System.out.println("O valor de B é igual a " + B);
	}

}
