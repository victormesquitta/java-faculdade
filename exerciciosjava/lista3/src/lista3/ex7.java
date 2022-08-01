package lista3;

import java.lang.Math;
import java.util.Scanner;
public class ex7 {

	public static float Volume(float raio) {
		
		return(1.33f*3.14f*(float)Math.pow(raio, 3));
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("De o raio da esfera: ");
		int n1=sc.nextInt();
		System.out.println("O volume da esfera é: "+Volume(n1));

	}

}
