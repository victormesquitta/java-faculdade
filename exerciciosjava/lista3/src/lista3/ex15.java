package lista3;

import java.util.Scanner;

public class ex15 {

	public static int pot(int x, int z) {
		int resul=x;
		
		for(int i=1;i<z;i++) {
			resul*=x;
		}
		return(resul);
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("De o valor X: ");
		int X=sc.nextInt();
		System.out.println("De o valor Z: ");
		int Z=sc.nextInt();
		System.out.println("O resultado da soma é: "+pot(X,Z));

	}

}
