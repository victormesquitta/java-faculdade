package exerciciosjava.lista1;

import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número [em cm]: ");
        float a = teclado.nextFloat();

        System.out.print("Digite outro número [em cm]: ");
        float b = teclado.nextFloat();

        System.out.print("Digite um último número [em cm]: ");
        float c = teclado.nextFloat();

        float areacirculo = (float) 3.14159 * (c*c);

        float areatrapezio = ((a+b) * c )/2;

        System.out.print("Com as informações, dá para se formar as seguintes formas geométricas\n");
        System.out.print("=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
        System.out.printf("Um triângulo com base de %.2fcm e altura de %.2fcm que tem área de %.2fcm².\n", a, c, (a*c)/2);
        System.out.printf("Um círculo de raio %.2fcm que tem área de %.2fcm².\n", c, areacirculo);
        System.out.printf("Um trapézio com bases de %.2fcm e %.2fcm e altura %.2fcm que tem %.2fcm² de área.\n", a, b, c, areatrapezio);
        System.out.printf("Um quadrado com lados de %.2fcm que tem área de %.2fcm².\n", b, b*b);
        System.out.printf("Um retângulo com lados de %.2fcm e %.2fcm que tem área de %.2fcm².\n", a, b, a*b);
        System.out.printf("Um retângulo com lados de %.2fcm e %.2fcm que tem um perímetro de %.2fcm.\n", a, b, (2*a) + (2*b));

    }
}
