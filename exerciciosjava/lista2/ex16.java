package exerciciosjava.lista2;

import java.util.Scanner;

public class ex16 {

    public static void main(String [] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantos valores devem ser lidos ? ");
        int quantvalores = teclado.nextInt();

        for (int i = 1; i <= quantvalores; i++){
            System.out.print("Digite um número: ");
            int numero = teclado.nextInt();
            if (numero != 0 && numero % 2 == 0 ){
                System.out.print("Esse número é PAR.\n");
                System.out.print("=--=--=--=--=--=--=--=--=--=\n");
            }
            else if (numero % 2 == 1 ) {
                System.out.print("Esse número é ÍMPAR.\n");
                System.out.print("=--=--=--=--=--=--=--=--=--=\n");
            }
            else {
                System.out.print("Esse número é NULO.\n");
                System.out.print("=--=--=--=--=--=--=--=--=--=\n");
            }
        }
    }
}
