package exerciciosjava.lista2;

import java.util.Scanner;

public class ex17 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = teclado.nextInt();

        System.out.printf("Os divisores de %d são: ", numero);
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0 && i != numero) {
                System.out.print(i + ", ");
            }
            else if (numero % i == 0 && i == numero){
                System.out.print(i + ".");
            }
        }
    }
}