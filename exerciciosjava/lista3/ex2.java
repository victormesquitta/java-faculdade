package exerciciosjava.lista3;

import java.util.Scanner;

public class ex2 {

    static int somatoria (int N) {

        int soma = 0;
        if(N > 0){
            for (int i = 0; i <= N; i++) {
                soma += i;
            }
        }
        return soma;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int a = teclado.nextInt();

        System.out.println("A somatória resultará em " + somatoria(a));

    }

}
