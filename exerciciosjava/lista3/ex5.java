package exerciciosjava.lista3;

import java.util.Scanner;

public class ex5 {

    static double bhaskara(int a, int b, int c) {

        int delta = (int) Math.pow(b, 2) - 4 * a * c;
        if (delta > 0){
            double x1 = -b + Math.sqrt(delta) / 2 * a;
            double x2 = -b - Math.sqrt(delta) / 2 * a;
            return Math.max(x1, x2);
        }
        else if (delta == 0){
            return (double) -b / 2 * a;
        }
        else {
            return -1;
        }
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int a = teclado.nextInt();

        System.out.print("Digite outro número: ");
        int b = teclado.nextInt();

        System.out.print("Digite mais um número: ");
        int c = teclado.nextInt();

        System.out.println("A maior raiz da equação de 2ºgrau foi " + bhaskara(a, b, c));

    }
}
