package operadorespackage;

import java.util.Scanner;
public class deFparaC {

	public static void main(String[] args) {
      Scanner scn= new Scanner(System.in);
      float tempC = 0;
      
      System.out.println("Digite uma temperatura em graus Fahrenheit:");
      float tempF= scn.nextFloat();
      
      tempC = ((tempF-32)*5/9);
      System.out.println(tempC + " graus em Celsius!");
	}

}
