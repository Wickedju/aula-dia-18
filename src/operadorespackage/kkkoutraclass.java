package operadorespackage;


import java.util.Scanner;

public class kkkoutraclass {

	public static void main(String[] args) {
	 Scanner scn = new Scanner(System.in);
	 
	 System.out.print("digite um valor númerico inteiro abaixo!");
	 int num = scn.nextInt();
	 
	 if(num % 2 == 0) {
	    System.out.print("o número é par");
	 }
        else {
    	 System.out.print("o número é impar");
     }
	 
	}

}
