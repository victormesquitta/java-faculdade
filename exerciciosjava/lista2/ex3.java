package exerciciosjava.lista2;

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int maior = 0;

        for (int i = 1; i < 11;i++){
            System.out.print("Digite um número: ");
            int numero = teclado.nextInt();
            if (i == 1){
                maior = numero;
            }
            else {
                if (numero > maior){
                    maior = numero;
                }
            }
        }
        System.out.printf("O maior número digitado foi o %d", maior);
    }
}