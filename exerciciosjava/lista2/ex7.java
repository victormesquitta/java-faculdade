package exerciciosjava.lista2;

public class ex7 {

    public static void main(String[] args) {

        int i = 7;

        while (i < 200) {
            if (i + 7 > 200) {
                System.out.printf("%d.", i);
            }
            else {
                System.out.printf("%d, ", i);
            }
            i += 7;
        }
    }
}