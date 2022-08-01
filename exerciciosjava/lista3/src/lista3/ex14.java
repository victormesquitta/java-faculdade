package lista3;

import java.util.Scanner;

public class ex14 {

	public static int soma(int a, int n) {
		int resul=a;
		
		if(n==0 || n<0) {
			resul=-1;
		}
		else {
			for(int i=1; i<n;i++) {
				resul+=a+i;
			}
		}
		
		return(resul);
	}

	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("De o valor A: ");
		int A=sc.nextInt();
		System.out.println("De o valor N: ");
		int N=sc.nextInt();
		System.out.println("O resultado da soma é: "+soma(A,N));
	}

}
