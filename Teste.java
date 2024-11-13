import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner scanner= new Scanner(System.in);//Cria um objeto Scanner para ler a entrada do usuário;

        System.out.println("Qual é se nome?");//pergunta ao usuário;
        String nome = scanner.nextLine();//Lê a linha de entrada do usuário e armazenana variavel 'nome';

        System.out.println("Olá, " + nome + "!");//Imprime uma saudação usando o nome fornecido pelo usuário;

    }


    
}