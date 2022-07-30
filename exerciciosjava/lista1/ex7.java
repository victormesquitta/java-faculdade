package exerciciosjava.lista1;

import java.util.Scanner;

public class ex7 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor do lado A do triângulo retângulo [em cm]: ");
        float ladoa = teclado.nextFloat();

        System.out.print("Digite o valor do lado B do triângulo retângulo [em cm]: ");
        float ladob = teclado.nextFloat();

        float hipotenusa =  (float) Math.sqrt((ladoa*ladoa) + (ladob*ladob));

        System.out.print("=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
        System.out.printf("Na formação de um triângulo retângulo com lados de %.2fcm e %.2fcm,\ntemos uma hipotenusa resultante de %.2fcm.", ladoa, ladob, hipotenusa);

    }
}

