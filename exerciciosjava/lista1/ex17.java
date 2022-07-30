package exerciciosjava.lista1;

import java.util.Scanner;

public class ex17 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int a = teclado.nextInt();

        System.out.print("Digite um segundo número: ");
        int b = teclado.nextInt();

        System.out.print("Digite mais um número: ");
        int c = teclado.nextInt();

        System.out.print("Digite um último número: ");
        int d = teclado.nextInt();

        if ( b > c && d > a && (c+d) > (a+b) && c > 0 && d > 0 && a % 2 == 0 ) {
            System.out.print("Valores aceitos.");
        }
        else {
            System.out.print("Valores não aceitos.");
        }

    }
}