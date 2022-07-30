package exerciciosjava.lista1;

import java.util.Scanner;

public class ex15 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        float a = teclado.nextFloat();

        System.out.print("Digite outro número: ");
        float b = teclado.nextFloat();

        System.out.print("Digite um último número: ");
        float c = teclado.nextFloat();

        float delta = ((b*b) - 4 * a * c);

        float bhaskarapos = (float) Math.sqrt((-b + delta) / 2 * a) ;

        float bhaskaraneg = (float) Math.sqrt((-b - delta) / 2 * a) ;

        if (2 * a == 0 || delta < 0) {
            System.out.print("Impossível calcular!");
        }
        else {
            System.out.printf("Realizando uma fórmula de bhaskara com esses números, os resultados são %.2f e %.2f.", bhaskarapos, bhaskaraneg);
        }
    }
}