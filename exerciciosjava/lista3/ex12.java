package exerciciosjava.lista3;

import java.util.Scanner;

public class ex12 {

    static double pesoideal(float altura, String sexo){

        if(sexo.equalsIgnoreCase("Masculino")){
            return (72.2 * altura) - 58 ;
        }
        else if (sexo.equalsIgnoreCase("Feminino")){
            return (62.1 * altura) - 44.7 ;
        }
        else{
            return 0;
        }
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Altura [em m]: ");
        float altura = teclado.nextFloat();

        System.out.print("Sexo: ");
        String sexo = teclado.next();
        if (pesoideal(altura, sexo) == 0){
            System.out.println("Sexo inválido.");
        }
        else {
            System.out.print("O peso ideal para essa pessoa é " + pesoideal(altura, sexo));
        }
    }
}
