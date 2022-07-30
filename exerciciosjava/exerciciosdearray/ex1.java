package exerciciosjava.exerciciosdearray;

public class ex1 {

    public static void main(String[] args) {
        int[] array = {100, 200, 300, 400, 500};

        int[] novoarray = new int[5];

        for (int i = 0; i < array.length; i++){

            novoarray[i] = array[i];
            System.out.printf("%d\n", novoarray[i]);
        }
    }
}
