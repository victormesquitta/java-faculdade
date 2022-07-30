package exerciciosjava.exerciciosdearray;

public class ex2 {

    public static void main(String[] args) {

        int[] vetor1 = {5, 10, 15, 20, 25};
        int[] vetor2 = {4, 8, 12, 16, 20};
        int[] vetor3 = new int[5];

        for (int i = 0; i < vetor1.length; i++){

            vetor3[i] = vetor1[i] + vetor2[i];
            System.out.printf("%d\n", vetor3[i]);
        }




    }
}
