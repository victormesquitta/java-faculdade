package exerciciosjava.exercicioderandom;

import java.util.Random;
import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Random numeroaleatorio = new Random();

        System.out.print("Digite um valor: ");
        int max = teclado.nextInt();

        System.out.print("Digite outro valor (tem de ser menor que o primeiro número): ");
        int min = teclado.nextInt();

        int a = numeroaleatorio.nextInt((max - min) + 1) + min;
        int b = numeroaleatorio.nextInt((max - min) + 1) + min;

        System.out.printf("Assim, temos a equação:\n%dx + %d = 0", a, b);
        System.out.print("\nx = " + (float)(0 - b)/a);
    }
}
