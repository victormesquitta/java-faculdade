package exerciciosjava.lista1;

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o número para ser a base da potenciação: ");
        int base = teclado.nextInt();

        System.out.print("Digite o número para ser o expoente da potenciação: ");
        int potencia = teclado.nextInt();

        int resultado = (int) Math.pow(base, potencia);

        System.out.printf("%d elevado a %d é igual a %d", base, potencia, resultado);

    }
}
