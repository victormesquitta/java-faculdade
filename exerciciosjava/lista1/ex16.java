package exerciciosjava.lista1;

import java.util.Scanner;

public class ex16 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int htotal;

        System.out.print("DURAÇÃO DO JOGO\nObs.: tempo minimo de 1h e máximo de 24h.\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\nHora inicial do jogo: ");
        int hinicial = teclado.nextInt();

        if (hinicial < 1 || hinicial > 24){
            System.out.print("HORAS INVÁLIDAS POR NÃO ESTAREM DENTRO DOS LIMITES!");
        }

        System.out.print("Hora final do jogo: ");
        int hfinal = teclado.nextInt();

        if (hfinal < 1 || hinicial > 24) {
            System.out.print("HORAS INVÁLIDAS POR NÃO ESTAREM DENTRO DOS LIMITES!");
        }

        if (hinicial > hfinal){
            htotal = 24 - hinicial + hfinal;
        }
        else if (hinicial < hfinal) {
            htotal = hfinal - hinicial;
        }
        else {
            htotal = 24;
        }

        System.out.printf("O tempo total no jogo foi de %dh.", htotal);
    }
}
