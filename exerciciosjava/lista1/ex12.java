package exerciciosjava.lista1;

import java.util.Scanner;

public class ex12 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o número L: ");
        float l = teclado.nextFloat();
        float areaquad = l * l;

        System.out.print("Digite o número R: ");
        float r = teclado.nextFloat();
        float areacirculo = (float) 3.14 * (r * r);

        if (areaquad > areacirculo) {
            System.out.print("A área do QUADRADO é maior que a do círculo.");
        }
        else if (areacirculo > areaquad) {
            System.out.print("A área do CÍRCULO e maior que o do quadrado.");
        }
        else {
            System.out.print("As áreas do quadrado e do círculo tem o MESMO tamanho.");
        }
    }
}
