package exerciciosjava.lista2;

public class ex8 {

    public static void main(String[] args) {

        int soma = 0;
        int contador = 0;

        for (int i = 14; i < 73; i += 2){
            System.out.printf("%d\n", i);
            contador += 1;
            soma += i;
        }
        float media = (float) soma / contador;
        System.out.printf("A média aritmética dos números pares entre 13 e 73 é %.2f.", media);
    }
}

