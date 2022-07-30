package exerciciosjava.exerciciosdeswitchcase;

import java.util.*;

public class ex6 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int i = 0;

        List<String> alternativas = Arrays.asList("Max", "Min", "Sqrt", "Abs", "Pow");

        String resposta;

        Collections.shuffle(alternativas);
        System.out.println(alternativas);
        System.out.println(alternativas.get(0).equals("Max"));

                do {
                    Collections.shuffle(alternativas);

                    System.out.printf("Qual método da classe Math serve para retornar a raiz quadrada de um número ?\n" +
                            "a) %s\nb) %s\nc) %s\nd) %s\ne) %s", alternativas.get(0), alternativas.get(1),
                            alternativas.get(2), alternativas.get(3), alternativas.get(4));
                    resposta = teclado.next();

                    String a = alternativas.get(0);
                    String b = alternativas.get(1);
                    String c = alternativas.get(2);
                    String d = alternativas.get(3);
                    String e = alternativas.get(4);

                    switch (resposta){
                        case "a":
                            if (Objects.equals(a, "Max")) {
                            System.out.println("Resposta incorreta!");
                            break;
                        }
                        case "b":
                            System.out.println("Resposta incorreta!");
                            break;
                        case "c":
                            System.out.println("Resposta correta!");
                            i=4;
                            break;
                        case "d":
                            System.out.println("Resposta incorreta!");
                            break;
                        case "e":
                            System.out.println("Resposta incorreta!");
                            break;
                    }
                    i++;
                }
                while (i < 3);
    }
}