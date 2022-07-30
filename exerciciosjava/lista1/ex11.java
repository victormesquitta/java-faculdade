package exerciciosjava.lista1;

import java.util.Scanner;

public class ex11 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        float numero = teclado.nextFloat();

        if (numero < 0) {
            System.out.printf("O número %.2f é NEGATIVO.", numero);
        }
        else {
            System.out.printf("O número %.2f é POSITIVO.", numero);
        }

    }
}
