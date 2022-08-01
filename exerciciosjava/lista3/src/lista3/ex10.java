package lista3;

import java.util.Scanner;

public class ex10 {
	
	
	public static void idd(int a) {
		if(a>=18) {
			System.out.println("Adulto");
		}
		else if(a<=17 & a>=14) {
			System.out.println("Juvenil B");
		}
		else if(a<=13 & a>=11) {
			System.out.println("Juvenil A");
		}
		else if(a<=10 & a>=8) {
			System.out.println("Infantil B");
		}
		else if(a<=7 & a>=4) {
			System.out.println("Infatil A");
		}
		
       
		}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("De sua idade: ");
		int idd=sc.nextInt();
		idd(idd);
		

	}

}
