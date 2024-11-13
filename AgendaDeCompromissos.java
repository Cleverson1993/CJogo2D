import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class AgendaDeCompromissos {
    private List<Compromisso> compromissos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Compromisso> compromissos = new ArrayList<>();

        while(true) {
            System.out.println("\n1. Adicionar compromisso");
            System.out.println("2. Visualizar compromisso");
            System.out.println("3. Sair");
            System.out.println("Escolha uma opção:");
            int opcao = scanner.nextInt();
            scanner.nextLine();//Consumir a nova linha.
            
            if(opcao == 1){
                System.out.print(" Digite a descrição do compromisso:");
                String descricao = scanner.nextLine();
                System.out.print(" Digite a data(dd/mm/aaaa): ");
                String data = scanner.nextLine();
                System.out.print(" Digite a hora(hh:mm): ");
                String hora = scanner.nextLine();
                compromissos.add(new Compromisso(descricao, data, hora));
            }else if(opcao==2) {
                for (Compromisso compromisso : compromissos) {
                    System.out.println(compromissos);
                }
            }else if(opcao==3) {
                break;

            }else {
                System.out.println("Opção invalida! Tente novamente. ");
            }
        }
        scanner.close();
    }
}

class Compromisso{
    private String descricao;
    private String data;
    private String hora;

    public Compromisso(String descricao, String data, String hora) {
        this.descricao=descricao;
        this.data=data;
        this.hora=hora;
    }

    public String getDescicao() {
        return descricao;
    }

    public String getData() {
        return data;
    }

    public String gethora() {
        return hora;
    }
    @Override public String toString() { return "Compromisso{" + "Descrição='" + descricao + '\'' + ", Data='" + data + '\'' + ", Hora='" + hora + '\'' + '}';
}
}