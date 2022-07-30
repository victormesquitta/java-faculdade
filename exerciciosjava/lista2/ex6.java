package exerciciosjava.lista2;

import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int contador = 1;
        String nome;
        String nomemaior = "a";
        int idade;
        int idademaior = 0;
        String sexo;
        String sexomaior = "a";


        do {
            System.out.print("Nome do[a] aluno[a]: ");
            nome = teclado.next();

            System.out.print("Idade do[a] aluno[a]: ");
            idade = teclado.nextInt();

            System.out.print("Sexo do[a] aluno[a]: ");
            sexo = teclado.next();

            if (contador == 0){
                nomemaior = nome;
                idademaior = idade;
                sexomaior = sexo;
            }
            else {
                if (idade > idademaior){
                    nomemaior = nome;
                    idademaior = idade;
                    sexomaior = sexo;
                }
            }

            contador++;
        }
        while (contador < 6);
        System.out.print("=--=--=--=--=--=--=--=--=--=--=--=--=--=--=--=");
        System.out.printf("\nDados do[a] aluno[a] mais velho[a] da turma:\n- Nome: %s\n- Idade: %d\n- Sexo: %s ", nomemaior, idademaior, sexomaior);

    }
}