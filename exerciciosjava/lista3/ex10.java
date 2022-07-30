package exerciciosjava.lista3;

import java.util.Scanner;

public class ex10 {

    static String categoria(int idade){

        if (idade >= 5 && idade <= 7){
            return "Infantil A";
        }
        else if (idade >= 8 && idade <= 10){
            return "Infantil B";
        }
        else if (idade >= 11 && idade <= 13){
            return "Juvenil A";
        }
        else if (idade >= 14 && idade <= 17){
            return "Juvenil B";
        }
        else if (idade >= 18){
            return "Adulto";
        }
        else{
            return "Grupo inválido";
        }
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a idade do nadador: ");
        int idade = teclado.nextInt();

        System.out.println("A catigoria desse nadador: " + categoria(idade));
    }
}
