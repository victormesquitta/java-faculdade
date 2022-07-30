package exerciciosjava.lista1;

import java.util.Scanner;

public class ex10 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Nome do vendedor: ");
        String vendedor = teclado.next();

        System.out.print("Salário fixo do vendedor [em R$]: ");
        float salariofixo = teclado.nextFloat();

        System.out.print("Total de vendas efetuadas pelo vendedor [em R$]: ");
        float totvendas = teclado.nextInt();

        float salariofinal = salariofixo + (totvendas * 0.15f);

        System.out.printf("O salário total a receber pelo vendedor %s, contando com as comissões, é de R$%.2f", vendedor, salariofinal);

    }
}
