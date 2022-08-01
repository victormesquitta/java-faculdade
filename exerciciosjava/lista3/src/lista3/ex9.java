package lista3;

import java.util.Scanner;

public class ex9 {

	public static int idd(int a, int b, int c) {
		
         return((a*365)+(b*30)+c);
		}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("De sua idade em anos: ");
		int anos=sc.nextInt();
		System.out.println("meses: ");
		int meses=sc.nextInt();
		System.out.println("dias: ");
		int dias=sc.nextInt();
		System.out.println("Sua idade em dias é: "+idd(anos,meses,dias));

	}

}
