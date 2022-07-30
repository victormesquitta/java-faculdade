package exerciciosjava.lista2;

import java.util.Scanner;

public class ex11 {

    public static void main(String [] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = teclado.nextInt();

        float somapos = 1;
        float somaneg = 0;
        float somatot;

        for (int i = 2; i <= numero; i++){

            if (i % 2 == 0){
                somaneg += (float) 1 / i;
            }
            else {
                somapos += (float) 1 / i;
            }
        }
        somatot = somapos - somaneg;
        System.out.print(somatot);
    }
}
