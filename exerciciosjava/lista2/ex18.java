package exerciciosjava.lista2;

import java.util.Scanner;

public class ex18 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número menor que 46: ");
        int numero = teclado.nextInt();

        int n1 = 0;
        int n2 = 1;
        int n3;


        if (numero >= 2) {
            System.out.printf("A sequência ficou: %d, %d", n1, n2);
        }
        else if (numero == 1){
            System.out.printf("A sequência ficou: %d", n1);
        }

        for (int i = 3; i <= numero; i++){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            if (i == 11) {
                System.out.print("\nO número ultrapassou o limite de 46.");
                break;
            }
            System.out.print(", " + n3);
        }
    }
}
