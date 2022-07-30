package exerciciosjava.lista3;

import java.util.Scanner;

public class ex1 {

    static int menor (int a, int b, int c) {

        int menor = 0;

        if(a < b && a < c){
            menor = a;
        }
        else if(b < a && b < c){
            menor = b;
        }
        else{
            menor = c;
        }

        return menor;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int a = teclado.nextInt();

        System.out.print("Digite outro número: ");
        int b = teclado.nextInt();

        System.out.print("Digite mais um número: ");
        int c = teclado.nextInt();

        System.out.println("O menor número foi " + menor(a, b, c));

    }

}
