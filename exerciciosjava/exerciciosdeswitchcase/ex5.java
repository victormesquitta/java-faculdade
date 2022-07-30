package exerciciosjava.exerciciosdeswitchcase;

import java.util.Random;

public class ex5 {

    public static void main(String[] args) {

        Random facesdado = new Random();

        float contador1 = 0;
        float contador2 = 0;
        float contador3 = 0;
        float contador4 = 0;
        float contador5 = 0;
        float contador6 = 0;

        for (int i = 0; i < 1000000; i++){
            int numeroaletorio = facesdado.nextInt(6) + 1;
            switch (numeroaletorio){
                case 1:
                    contador1++;
                    break;
                case 2:
                    contador2++;
                    break;
                case 3:
                    contador3++;
                    break;
                case 4:
                    contador4++;
                    break;
                case 5:
                    contador5++;
                    break;
                case 6:
                    contador6++;
                    break;
            }
        }
        System.out.println("Num cenário onde um dado que foi jogado 1.000.000 de vezes");
        System.out.println("Essas foram as porcentagens nas quais cada face cairam:");
        System.out.println("=-=-=-=--=--=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Face 1 - " + (contador1 * 100 / 1000000) + "%");
        System.out.println("Face 2 - " + contador2/10000 + "%");
        System.out.println("Face 3 - " + contador3/10000 + "%");
        System.out.println("Face 4 - " + contador4/10000 + "%");
        System.out.println("Face 5 - " + contador5/10000 + "%");
        System.out.println("Face 6 - " + contador6/10000 + "%");
    }
}
