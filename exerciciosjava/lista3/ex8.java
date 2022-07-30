package exerciciosjava.lista3;

import java.util.Scanner;

public class ex8 {

    static boolean verificadordeverdadeementira(int x){

        int contador = 0;
        for(int i = 1; i < x+1; i++) {

            if (x % i == 0) {
                contador++;
            }
        }
        return contador < 3;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int x;

        do {
            System.out.print("Digite um número inteiro positivo: ");
            x = teclado.nextInt();
        }
        while(x < 0);

        System.out.printf("%d é primo ? %s", x, verificadordeverdadeementira(x));

    }
}
