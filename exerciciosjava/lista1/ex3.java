package exerciciosjava.lista1;

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor1 = teclado.nextInt();

        System.out.print("Digite um valor: ");
        int valor2 = teclado.nextInt();

        System.out.printf("A soma dos quadrados de %d e %d é %d", valor1, valor2, (valor1*valor1) + (valor2*valor2));

    }
}