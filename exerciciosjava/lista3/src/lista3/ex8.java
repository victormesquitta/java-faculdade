package lista3;

import java.util.Scanner;

public class ex8 {

public static boolean Primo(float n) {
		
	if(n%2!=0 & n%3!=0 & n%5!=0) {
		return true;
	}
	else{
		return false;
	}
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("De um numero: ");
		int n1=sc.nextInt();
		
		if(Primo(n1)) {
			System.out.println("O numero é primo");
		}
		else {
			System.out.println("O numero não é primo");
		}

	}

}
