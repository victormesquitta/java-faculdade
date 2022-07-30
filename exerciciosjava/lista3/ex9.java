package exerciciosjava.lista3;

import java.util.Scanner;

public class ex9 {

    static int conversordeidade (int idadeanos, int idademeses, int idadedias){

        return idadeanos*365 + idademeses*30 + idadedias;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite sua idade em anos, meses e dias\nanos:  ");
        int idadeanos = teclado.nextInt();

        System.out.print("meses:  ");
        int idademeses = teclado.nextInt();

        System.out.print("dias:  ");
        int idadedias = teclado.nextInt();

        System.out.println("A idade em dias é de aproximadamente " + conversordeidade(idadeanos, idademeses, idadedias) + " dias.");
    }
}
