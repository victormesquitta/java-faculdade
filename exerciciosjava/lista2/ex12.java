package exerciciosjava.lista2;

import java.util.Scanner;

public class ex12 {

    public static void main(String [] args) {

        Scanner teclado = new Scanner(System.in);

        float fracaodenominadorn = 0;

        System.out.print("Digite um número: ");
        int numero = teclado.nextInt();

        for (int i = 0; i < numero; i++){
            fracaodenominadorn += (float) (i + 1) / (numero - i);
        }

        System.out.print(fracaodenominadorn * 2);
    }
}
