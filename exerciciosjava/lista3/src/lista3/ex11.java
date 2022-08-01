package lista3;

import java.util.Scanner;

public class ex11 {

	public static void med(float a) {
		if(a>10) {
			System.out.println("Media invalida");
		}
		else if(a<=10 & a>=9) {
			System.out.println("O seu conceito final é A");
		}
		else if(a<=8.9 & a>=7) {
			System.out.println("O seu conceito final é B");
		}
		else if(a<=6.9 & a>=5) {
			System.out.println("O seu conceito final é C");
		}
		else if(a<=4.9 & a>=0) {
			System.out.println("O seu conceito final é D");
		}
       
		}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("De sua media final: ");
		float med = sc.nextFloat();
		med(med);
		

	}
}
