import java.util.ArrayList;
import java.util.Scanner;


public class MédiaDeNota {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);//Cria Um objeto Scanner para a entrada do usuário;
        ArrayList<Double> notas = new ArrayList<>();//Cria uma lista para arnazenar as notas dos alunos;

        System.out.println("Digite as notas dos alunos(digite -1 para finalizar):");
        while (true) {//inicia um loop infinito
            System.out.print("nota: ");
            double nota = scanner.nextDouble();//Lê a proxima entrada do como um double;
            if(nota==-1){//Verifica se a entrada é -1 para sair do loop;
                break;//Encerra o loop se a entrada for -1;
            }
            notas.add(nota);//Adiciona a nota lida á lista de notas;
            
        }
        double soma = 0;//Inicializa uma variável para armazenar a soma das notas;
        for(double nota : notas){//loop através de cada nota na lista de notas;
            soma += nota; //Adiciona cada nota á soma;
        }

        double media = notas.isEmpty() ? 0 : soma / notas.size();//Calcula a média das notas;
        System.out.println("A média das notas é: " + media);//Imprime a média das notas;
    }

    
}
