package exerciciosjava.lista2;

import java.util.Scanner;

public class ex21 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = teclado.nextInt();

        int soma = 0;

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0 && i != numero) {
                soma += i;
            }
        }
        if (soma == numero) {
            System.out.print("O número escolhido É PERFEITO.");
        }
        else {
            System.out.print("O número escolhido NÃO É PERFEITO.");
        }
    }
}