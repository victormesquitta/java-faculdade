package exerciciosjava.lista3;

import java.util.Scanner;

public class ex4 {

    static float divisoria(int n) {

        int somador = 0;
        int multiplicador = 1;
        if(n > 0){
            for (int i = 1; i <= n; i++) {
                multiplicador *= i;
            }
            for(int i = 0; i <= n; i++){
                somador += i;
            }
        }
        return (float) multiplicador / somador;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = teclado.nextInt();

        System.out.println("O resultado de fatorial divido pela somatória resultou em " + divisoria(n));
        
    }
}
