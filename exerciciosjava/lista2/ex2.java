package exerciciosjava.lista2;

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = teclado.nextInt();

        int i = 1;
        int soma = 0;

        while (i <= n){
            soma += i;
            i++;
        }
       System.out.printf("A soma resultante de 1 até o número digitado é: %d.", soma);
    }
}
