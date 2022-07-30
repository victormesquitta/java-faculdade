package exerciciosjava.lista1;

import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor1 = teclado.nextInt();

        System.out.print("Digite um valor: ");
        int valor2 = teclado.nextInt();

        System.out.printf("Os números consecutivos de %d e %d são %d e %d, respectivamente.", valor1, valor2, valor1 + 1, valor2 + 1);

    }
}