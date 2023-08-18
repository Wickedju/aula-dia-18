package operadorespackage;

import java.util.Scanner;
import java.lang.Math;

public class Lataclass {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
        double v = 0;
        System.out.println("Digite o valor da altura da lata:");
        double a = scn.nextDouble();
        System.out.println("Digite o valor do raio da lata:"); 
        double r = scn.nextDouble();
	   
		v = 3.141509 * r * Math.pow(r, 2) * a;
	 System.out.println( v + " é o volume");
	}
	

}
