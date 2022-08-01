package lista3;

import java.util.Scanner;

public class ex13 {
	
	public static int div(int a) {
		int div=0;
		
		for(int i=1; i<a+1;i++) {
			if(a%i==0) {
				div++;
			}
		}
		
		return(div);
	}

	public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("De um numero: ");
			int n=sc.nextInt();
			
			if(n>=0) {
				System.out.println("A quantidade de divisores deste numero é: "+div(n));
			}
			else {
				System.out.println("Numero invalido");
			}

	}

}
