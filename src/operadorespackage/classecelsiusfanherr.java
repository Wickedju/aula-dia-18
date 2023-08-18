package operadorespackage;
 
import java.util.Scanner;

public class classecelsiusfanherr {
	

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		float tempF = 0;
		
	 System.out.println("Digite uma temperatura em graus Celsius:");
	 float tempC= scn.nextFloat();
	 
	 tempF = tempC * 9 / 5 + 32;
	 System.out.println(tempF  + " graus em Fahrenheit.");
	}

}
