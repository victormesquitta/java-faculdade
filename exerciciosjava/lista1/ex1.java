package exerciciosjava.lista1;

import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor1 = teclado.nextInt();

        System.out.print("Digite outro valor: ");
        int valor2 = teclado.nextInt();

        System.out.printf("O produto de %d e %d é %d.", valor1, valor2, valor1 * valor2);

    }
}
