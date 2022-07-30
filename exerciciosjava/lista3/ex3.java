package exerciciosjava.lista3;

import java.util.Scanner;

public class ex3 {

    static int multiplicacao(int n) {

        int multiplicador = 1;
        if(n > 0){
            for (int i = 1; i <= n; i++) {
                multiplicador *= i;
            }
        }
        return multiplicador;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = teclado.nextInt();

        System.out.println("O fatorial desse número resultará em " + multiplicacao(n));
    }
}
