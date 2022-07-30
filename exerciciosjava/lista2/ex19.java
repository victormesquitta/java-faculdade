package exerciciosjava.lista2;

import java.util.Scanner;

public class ex19 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int senhacorreta = 2002;
        int senha;

        do {
            System.out.print("Digite sua senha: ");
            senha = teclado.nextInt();
            if (senha == senhacorreta){
                break;
            }
            System.out.print("Senha Inválida\n");
        }

        while (senha != senhacorreta);

        System.out.print("Acesso Permitido");

    }
}