package exerciciosjava.lista1;

import java.util.Scanner;

public class ex8 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um primeiro número: ");
        float n1 = teclado.nextFloat();

        System.out.print("Digite um segundo número: ");
        float n2 = teclado.nextFloat();

        System.out.print("Digite um terceiro número: ");
        float n3 = teclado.nextFloat();

        System.out.print("Digite um último número: ");
        float n4 = teclado.nextFloat();

        float mediaaritmetica = ((n1 + n2 + n3 + n4) / 4);

        System.out.print("=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
        System.out.printf("A média aritmética dos quatro números digitados é %.2f", mediaaritmetica);

    }
}
