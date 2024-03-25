import java.util.Objects;
import java.util.Scanner;

public class CalculadoraSimples {
    //Definindo a classe scanner e o objeto scan

    //Colocando static atras do objeto faz com que o programa inteiro consiga ver
    static Scanner scan = new Scanner(System.in);
    static String choice;
    static double result;

    public static void main(String[] args) {

        //Definindo as variaveis


        Double x;


        System.out.println("Bem-vindo a calculadora.\n\n");

        while (!Objects.equals(choice, "5")) {

            System.out.println("Digite o numero da acao correspondente de sua escolha:\n");
            System.out.println("1-Somar\n2-Subtrair\n3-Multiplicar\n4-Dividir\n5-Sair\n");

            System.out.println("Sua escolha: ");

            // A SUA ESCOLHA
            choice = scan.next();

            //As suas escolhas vão te levar até as suas respectivas funcoes para realizar o calculo


            switch(choice){

                //SOMA
                case "1":
                    System.out.println("VOCE ESCOLHEU SOMA\n");

                    System.out.println("Digite o valor: ");
                    x = scan.nextDouble();
                    sum(x);
                    break;
                //SUBTRACAO
                case "2":
                    System.out.println("VOCE ESCOLHEU SUBTRAIR\n");

                    System.out.println("Digite o valor: ");
                    x = scan.nextDouble();

                    minus(x);
                    break;
                //MULTIPLICACAO
                case "3":
                    System.out.println("VOCE ESCOLHEU MULTIPLICAR\n");

                    System.out.println("Digite o valor: ");
                    x = scan.nextDouble();

                    multiplication(x);
                    break;

                //DIVISAO
                case "4":
                    System.out.println("VOCE ESCOLHEU DIVIDIR\n");

                    System.out.println("Digite o valor: ");
                    x = scan.nextDouble();

                    division(x);
                    break;
                //DESLIGAR A CALCULADORA
                case "5":
                    System.out.println("Voce escolheu desligar a calculadora\n");
                    break;
                //ERRO NA CALCULADORA
                default:
                    //Caso as suas escolhas nao sejam iguais, o programa ira perguntar novamente a sua escolha em um looping
                    System.out.println("ERRO: ESCOLHA DESCONHECIDA.\nPOR FAVOR, DIGITE NOVAMENTE.\n");
                    break;

            }

        }
    }


    // FUNCOES QUE SERVEM PARA O FUNCIONAMENTO DA CALCULADORA
    // SO DA PARA REALIZAR AS CONTAS DO MESMO TIPO ESCOLHIDO
    //A variavel result sera incrementada com os resultados recebidos abaixo

    //SOMA
    static void sum(Double x) {
      
        result += x;
        System.out.println("Resultado: " + result);

    }

    //SUBTRACAO
    static void minus(Double x) {
        result -= x;
        System.out.println("Resultado: " + result);

    }

    //MULTIPLICACAO
    static void multiplication(Double x) {
        result *= x;
        System.out.println("Resultado: " + result);
    }

    //DIVISAO
    static void division(Double x) {
        if (x != 0) {
            result /= x;
            System.out.println("Resultado: " + result);
        } else {
            System.out.println("ERRO: Divisão por zero não é permitida!");
        }
    }
}
