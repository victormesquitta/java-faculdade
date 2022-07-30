package exerciciosjava.lista1;

import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor do lado do quadrado [em cm]: ");
        int lado = teclado.nextInt();

        System.out.printf("A área do quadrado de lado %d é igual é %d cm².", lado, lado*lado);

    }
}
