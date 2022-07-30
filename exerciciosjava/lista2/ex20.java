package exerciciosjava.lista2;

import java.util.Scanner;

public class ex20 {

    public static void main(String[] args) {

        Scanner teclado  = new Scanner (System.in);

        System.out.print("Digite seu saldo inicial [em R$]: ");
        float saldoinicial = teclado.nextFloat();

        int opcao;

        while (true) {

            System.out.print("Qual operação deseja realizar?\n [1] DEPÓSITO\n [2] SAQUE\n [3] SAIR\n");
            opcao = teclado.nextInt();

            if (opcao == 1){
                System.out.print("Qual o valor? ");
                float valor = teclado.nextFloat();
                saldoinicial += valor;
            }

            if (opcao == 2){
                System.out.print("Qual o valor? ");
                float valor = teclado.nextFloat();
                saldoinicial -= valor;;
            }

            if (opcao == 3) {
                break;
            }
        }

        if (saldoinicial == 0){
            System.out.printf("CONTA ZERADA (Saldo: R$%.2f)", saldoinicial);
        }
        else if (saldoinicial < 0) {
            System.out.printf("CONTA ESTOURADA (Saldo = R$%.2f)", saldoinicial);
        }
        else {
            System.out.printf("CONTA PREFERENCIAL (Saldo = R$%.2f)", saldoinicial);
        }
    }
}

