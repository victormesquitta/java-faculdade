package exerciciosjava.lista2;

import java.util.Scanner;

public class ex13 {

    public static void main(String [] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = teclado.nextInt();

        int numerador = 1;
        int denominador = 1;
        float soma = 1;

        for (int i = 2; i <= numero; i++){
            numerador = numerador * i;
            denominador = denominador * ((2 * i) - 1);
            soma += (float) numerador / denominador;
        }

        System.out.print(soma);
    }
}
