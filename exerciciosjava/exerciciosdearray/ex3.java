package exerciciosjava.exerciciosdearray;

public class ex3 {

    public static void main(String[] args){

        int[] vetor1 = {12, 20, 28, 36};
        int[] vetor2 = {6, 12, 18, 24};
        int[] vetor3 = new int[4];

        for (int i = 0; i < vetor3.length; i++){

            vetor3[i] = vetor1[i] + vetor2[i];
            System.out.printf("%d\n", vetor3[i]);
        }
    }
}
