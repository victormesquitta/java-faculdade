package exerciciosjava.lista1;

import java.util.Scanner;

public class ex13 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        float n1 = teclado.nextFloat();

        System.out.print("Digite outro número: ");
        float n2 = teclado.nextFloat();

        System.out.print("Digite um último número: ");
        float n3 = teclado.nextFloat();

        if (n1 > n2 && n1 > n3){
            System.out.printf("%.2f é maior número dentre os três.", n1);
        }

        else if (n2 > n1 && n2 > n3){
            System.out.printf("%.2f é maior número dentre os três.", n2);
        }

        else if (n3 > n1 && n3 > n2){
            System.out.printf("%.2f é maior número dentre os três.", n3);
        }

    }
}
