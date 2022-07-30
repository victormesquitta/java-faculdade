package exerciciosjava.lista2;

public class ex10 {

    public static void main(String[] args) {

        float soma = 1;

        for (int i = 2; i < 21; i++){
            soma += (float) 1 / i;
        }
        System.out.print(soma);
    }
}
