package exerciciosjava.lista1;

import java.util.Scanner;

public class ex14 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        float div;

        System.out.print("Digite um número: ");
        float n1 = teclado.nextFloat();

        System.out.print("Digite outro número: ");
        float n2 = teclado.nextFloat();

        if (n1 >= n2) {
            div = n1 / n2;
        }
        else{
            div = n2 / n1;
        }
        System.out.printf("A divisão entre os dois números digitados resulta em %.2f", div);
    }
}
