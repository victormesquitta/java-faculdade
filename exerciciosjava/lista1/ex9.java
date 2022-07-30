package exerciciosjava.lista1;

import java.util.Scanner;

public class ex9 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Número de cadastro do funcionário: ");
        int cadastro = teclado.nextInt();

        System.out.print("Número de horas trabalhadas: ");
        int htrabalhadas = teclado.nextInt();

        System.out.print("Valor da hora da trabalhada: ");
        float valorhora = teclado.nextInt();

        float salario = htrabalhadas * valorhora;

        System.out.printf("O funcionário de cadastro %d detém um salário de R$%.2f", cadastro, salario);
    }
}
