package exerciciosjava.lista2;

import java.util.Scanner;

public class ex15 {

    public static void main(String [] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número para ser fatorado: ");
        int fatorial = teclado.nextInt();

        for (int i = fatorial; i > 1; i--){
            fatorial = (i - 1) * fatorial;
        }

        System.out.print(fatorial);
    }
}
